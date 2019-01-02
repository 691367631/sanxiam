package com.sanxia.common.utils;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.apache.commons.collections.map.CaseInsensitiveMap;



public class Report {

	/**
	 * 导出excel表格公共方法
	 */
	public static String exportExcelOnLine(HttpServletRequest request,
			HttpServletResponse response, Map titleMap, List<Map> dataList,
			String dst_fname) throws Exception {
		// String clientLanguage = request.getHeader("Accept-Language");
		// String guessCharset = ResponseEncodingUtil
		// .getGuessCharset(clientLanguage);
		// dst_fname = ResponseEncodingUtil.encodingFileName(dst_fname,
		// guessCharset);
		dst_fname = toUtf8String(dst_fname);
		response.reset();
		String charsetStr = "utf-8";
		// if ("GBK".equalsIgnoreCase(guessCharset)) {
		// charsetStr = "GBK";
		// }
		response.setContentType("application/vnd.ms-excel;charset="
				+ charsetStr);
		response.setHeader("Content-Disposition", "attachment;filename="
				+ dst_fname);
		OutputStream os = response.getOutputStream();

		WritableWorkbook book = ExcelUtil.createExcel(os);
		WritableSheet ws = ExcelUtil.addExcelSheet(book, "导出列表");
		// String condition = callService.getCallCondition(callVo);
		// ws.addCell(ExcelUtil.createCell(0, 0, condition));
		int rowIndex = 0;
		if (titleMap.size() != 0) {
			Iterator colKey = titleMap.keySet().iterator();
			int colIndex = 0;
			while (colKey.hasNext()) {
				Object key = colKey.next();
				ws.addCell(ExcelUtil.createCellTextHeader(colIndex, rowIndex,
						(String) titleMap.get(key)));
				++colIndex;
			}
			++rowIndex;
			ws.getSettings().setVerticalFreeze(1);
		}
		int dataSize = 0;
		if (null != dataList) {
			dataSize = dataList.size();
		}
		for (int i = 0; i < dataSize; ++i) {
			Object o = dataList.get(i);
			Map map = (Map) dataList.get(i);
			CaseInsensitiveMap imap = new CaseInsensitiveMap(map);
			int colIndex = 0;
			Iterator colKey = titleMap.keySet().iterator();
			while (colKey.hasNext()) {
				Object key = colKey.next();
				Object value = imap.get(key);
				if (value == null || "null".equals(value)) {
					value = "";
				}
				ws.addCell(ExcelUtil.createCell(colIndex, rowIndex, value));
				++colIndex;
			}
			++rowIndex;
		}
				
	/*	String filePath = MedicalConfig.getInstantce().getConfigProperty("waterMarkImgPath");
		String fileWidth = MedicalConfig.getInstantce().getConfigProperty("waterMarkImgWidth");
		String fileHeight = MedicalConfig.getInstantce().getConfigProperty("waterMarkImgHeight");*/
		/*if(filePath.indexOf("/")>-1){
			filePath=request.getSession().getServletContext().getRealPath("/") +filePath;
		}
		File fileImg = new File(filePath);

		byte imageData[] = new byte[(int) fileImg.length()];

		FileInputStream fis = new FileInputStream(fileImg);

		fis.read(imageData);


		ws.setWaterMarkImage(imageData, Integer.parseInt(fileWidth), Integer.parseInt(fileHeight));
		*/
		ws.getSettings().setProtected(true);
		book.setProtected(true);
		
		
		
		book.write();
		book.close();
		return null;
	}

	private static String toUtf8String(String s) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 0 && c <= 255) {
				sb.append(c);
			} else {
				byte[] b;
				try {
					b = Character.toString(c).getBytes("utf-8");
				} catch (Exception ex) {
					System.out.println(ex);
					b = new byte[0];
				}
				for (int j = 0; j < b.length; j++) {
					int k = b[j];
					if (k < 0)
						k += 256;
					sb.append("%" + Integer.toHexString(k).toUpperCase());
				}
			}
		}
		return sb.toString();
	}

}
