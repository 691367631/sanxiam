package com.sanxia.common.utils;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableCell;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ExcelUtil {
	private static Log log = LogFactory.getLog(ExcelUtil.class);

	public static WritableWorkbook createExcel(OutputStream os) {
		WritableWorkbook book = null;
		try {
			book = Workbook.createWorkbook(os);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return book;
	}

	public static WritableWorkbook createExcel(File file) {
		OutputStream os = null;
		try {
			os = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return createExcel(os);
	}

	public static WritableSheet addExcelSheet(WritableWorkbook book,
			String sheetName) {
		WritableSheet ws = null;
		if ((null == sheetName) || (sheetName.trim().length() < 1)) {
			sheetName = "sheet" + (book.getNumberOfSheets() + 1);
		}
		ws = book.createSheet(sheetName, book.getNumberOfSheets());
		ws.getSettings().setDefaultColumnWidth(15);
		return ws;
	}

	public static WritableCell createCellTextHeader(int colIndex, int rowIndex,
			String str) {
		WritableCellFormat format = new WritableCellFormat(new WritableFont(
				WritableFont.ARIAL, 11, WritableFont.BOLD));
		try {
			format.setAlignment(Alignment.CENTRE);
			format.setBorder(Border.ALL, BorderLineStyle.THIN);
			format.setBackground(Colour.LIGHT_GREEN);
			format.setWrap(true);
			format.setLocked(true);
		} catch (WriteException e) {
			e.printStackTrace();
		}

		return createCellTextHeader(colIndex, rowIndex, str, format);
	}

	private static WritableCell createCellTextHeader(int colIndex,
			int rowIndex, String str, WritableCellFormat format) {
		return new Label(colIndex, rowIndex, str, format);
	}

	public static WritableCell createCell(int colIndex, int rowIndex, Object obj) {
		if (null == obj)
			return createCellText(colIndex, rowIndex, "");
		if ((obj instanceof Integer) || (obj instanceof Double)
				|| (obj instanceof BigDecimal) || (obj instanceof Float)) {
			return createCellNumber(colIndex, rowIndex, obj.toString());
		}
		return createCellText(colIndex, rowIndex, obj.toString());
	}

	private static WritableCell createCellNumber(int colIndex, int rowIndex,
			String str) {
		WritableCellFormat format = new WritableCellFormat(new WritableFont(
				WritableFont.ARIAL, 10));
		try {
			format.setAlignment(Alignment.RIGHT);
			format.setBorder(Border.ALL, BorderLineStyle.THIN);
		} catch (WriteException e) {
			e.printStackTrace();
		}

		return new Number(colIndex, rowIndex, getNumber(str, 0.0D), format);
	}

	private static WritableCell createCellText(int colIndex, int rowIndex,
			String str) {
		WritableCellFormat format = new WritableCellFormat(new WritableFont(
				WritableFont.ARIAL, 10));
		try {
			format.setAlignment(Alignment.LEFT);
			format.setBorder(Border.ALL, BorderLineStyle.THIN);
		} catch (WriteException e) {
			e.printStackTrace();
		}

		return new Label(colIndex, rowIndex, str, format);
	}

	private static double getNumber(String str, double defNum) {
		try {
			return Double.parseDouble(str);
		} catch (NumberFormatException e) {
			log.debug(" !!error!! ExcelUtil.getNumber(" + str + ")");
		}
		return defNum;
	}
}
