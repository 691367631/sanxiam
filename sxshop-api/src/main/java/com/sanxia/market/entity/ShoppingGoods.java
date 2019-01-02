package com.sanxia.market.entity;

import com.sanxia.common.core.entity.BaseEntity;
import com.sanxia.common.utils.HttpClientUtil;
import com.sanxia.common.utils.JsonUtil;
import com.sanxia.common.utils.PropertiesConfigUtil;
import com.sanxia.market.dto.goodscart.QueryGoodsPriceRequest;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;

/**
* @TableName: shopping_goods 
* @Package: com.sanxia.market.entity
* @Title:ShoppingGoods.java 
* @Description:  
* @author: 赵贯男
* @date: 2018-11-20 10:44:36
* @version V1.0    
* create by codeFactory
*/
@ApiModel("") 
public class ShoppingGoods extends BaseEntity implements Serializable {

	  private static final long serialVersionUID = 1L;
	  
	/**
	*@Fields id :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long id;
	/**
	*@Fields addTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date addTime;
	/**
	*@Fields deleteStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean deleteStatus;
	/**
	*@Fields goodsClick :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsClick;
	/**
	*@Fields goodsDetails :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String goodsDetails;
	/**
	*@Fields goodsFee :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String goodsFee;
	/**
	*@Fields goodsInventory :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsInventory;
	/**
	*@Fields goodsInventoryDetail :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String goodsInventoryDetail;
	/**
	*@Fields goodsName :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String goodsName;
	/**
	*@Fields goodsPrice :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double goodsPrice;
	/**
	*@Fields goodsProperty :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String goodsProperty;
	/**
	*@Fields goodsRecommend :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean goodsRecommend;
	/**
	*@Fields goodsSalenum :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsSalenum;
	/**
	*@Fields goodsSellerTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date goodsSellerTime;
	/**
	*@Fields goodsSerial :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String goodsSerial;
	/**
	*@Fields goodsStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsStatus;
	/**
	*@Fields goodsTransfee :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsTransfee;
	/**
	*@Fields goodsWeight :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double goodsWeight;
	/**
	*@Fields inventoryType :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String inventoryType;
	/**
	*@Fields seoDescription :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String seoDescription;
	/**
	*@Fields seoKeywords :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String seoKeywords;
	/**
	*@Fields storePrice :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double storePrice;
	/**
	*@Fields storeRecommend :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean storeRecommend;
	/**
	*@Fields storeRecommendTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date storeRecommendTime;
	/**
	*@Fields ztcAdminContent :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String ztcAdminContent;
	/**
	*@Fields ztcApplyTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date ztcApplyTime;
	/**
	*@Fields ztcBeginTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date ztcBeginTime;
	/**
	*@Fields ztcClickNum :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ztcClickNum;
	/**
	*@Fields ztcDredgePrice :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ztcDredgePrice;
	/**
	*@Fields ztcGold :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ztcGold;
	/**
	*@Fields ztcPayStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ztcPayStatus;
	/**
	*@Fields ztcPrice :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ztcPrice;
	/**
	*@Fields ztcStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ztcStatus;
	/**
	*@Fields gcId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long gcId;
	/**
	*@Fields goodsBrandId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsBrandId;
	/**
	*@Fields goodsMainPhotoId :
	*/
	@ApiModelProperty(value = "" ,dataType = "String") 
	private String goodsMainPhotoId;
	/**
	*@Fields goodsStoreId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsStoreId;
	/**
	*@Fields ztcAdminId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long ztcAdminId;
	/**
	*@Fields goodsCollect :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsCollect;
	/**
	*@Fields groupBuy :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long groupBuy;
	/**
	*@Fields goodsChoiceType :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long goodsChoiceType;
	/**
	*@Fields groupId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long groupId;
	/**
	*@Fields activityStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long activityStatus;
	/**
	*@Fields bargainStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long bargainStatus;
	/**
	*@Fields deliveryStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long deliveryStatus;
	/**
	*@Fields goodsCurrentPrice :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double goodsCurrentPrice;
	/**
	*@Fields goodsVolume :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double goodsVolume;
	/**
	*@Fields emsTransFee :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double emsTransFee;
	/**
	*@Fields expressTransFee :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double expressTransFee;
	/**
	*@Fields mailTransFee :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double mailTransFee;
	/**
	*@Fields transportId :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long transportId;
	/**
	*@Fields combinStatus :
	*/
	@ApiModelProperty(value = "" ,dataType = "Long") 
	private Long combinStatus;
	/**
	*@Fields combinBeginTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date combinBeginTime;
	/**
	*@Fields combinEndTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date combinEndTime;
	/**
	*@Fields combinPrice :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double combinPrice;
	/**
	*@Fields descriptionEvaluate :
	*/
	@ApiModelProperty(value = "" ,dataType = "Double") 
	private Double descriptionEvaluate;
	/**
	*@Fields weixinShopHot :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean weixinShopHot;
	/**
	*@Fields weixinShopHotTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date weixinShopHotTime;
	/**
	*@Fields weixinShopRecommend :
	*/
	@ApiModelProperty(value = "" ,dataType = "boolean") 
	private boolean weixinShopRecommend;
	/**
	*@Fields weixinShopRecommendTime :
	*/
	@ApiModelProperty(value = "" ,dataType = "Date") 
	private Date weixinShopRecommendTime;
	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return id;
	}
	public void setAddTime(Date addTime){
		this.addTime=addTime;
	}

	public Date getAddTime(){
		return addTime;
	}
	public void setDeleteStatus(boolean deleteStatus){
		this.deleteStatus=deleteStatus;
	}

	public boolean getDeleteStatus(){
		return deleteStatus;
	}
	public void setGoodsClick(Long goodsClick){
		this.goodsClick=goodsClick;
	}

	public Long getGoodsClick(){
		return goodsClick;
	}
	public void setGoodsDetails(String goodsDetails){
		this.goodsDetails=goodsDetails;
	}

	public String getGoodsDetails(){
		return goodsDetails;
	}
	public void setGoodsFee(String goodsFee){
		this.goodsFee=goodsFee;
	}

	public String getGoodsFee(){
		return goodsFee;
	}
	public void setGoodsInventory(Long goodsInventory){
		this.goodsInventory=goodsInventory;
	}

	public Long getGoodsInventory(){
		return goodsInventory;
	}
	public void setGoodsInventoryDetail(String goodsInventoryDetail){
		this.goodsInventoryDetail=goodsInventoryDetail;
	}

	public String getGoodsInventoryDetail(){
		return goodsInventoryDetail;
	}
	public void setGoodsName(String goodsName){
		this.goodsName=goodsName;
	}

	public String getGoodsName(){
		return goodsName;
	}
	public void setGoodsPrice(Double goodsPrice){
		this.goodsPrice=goodsPrice;
	}

	public Double getGoodsPrice(){
		return goodsPrice;
	}
	public void setGoodsProperty(String goodsProperty){
		this.goodsProperty=goodsProperty;
	}

	public String getGoodsProperty(){
		return goodsProperty;
	}
	public void setGoodsRecommend(boolean goodsRecommend){
		this.goodsRecommend=goodsRecommend;
	}

	public boolean getGoodsRecommend(){
		return goodsRecommend;
	}
	public void setGoodsSalenum(Long goodsSalenum){
		this.goodsSalenum=goodsSalenum;
	}

	public Long getGoodsSalenum(){
		return goodsSalenum;
	}
	public void setGoodsSellerTime(Date goodsSellerTime){
		this.goodsSellerTime=goodsSellerTime;
	}

	public Date getGoodsSellerTime(){
		return goodsSellerTime;
	}
	public void setGoodsSerial(String goodsSerial){
		this.goodsSerial=goodsSerial;
	}

	public String getGoodsSerial(){
		return goodsSerial;
	}
	public void setGoodsStatus(Long goodsStatus){
		this.goodsStatus=goodsStatus;
	}

	public Long getGoodsStatus(){
		return goodsStatus;
	}
	public void setGoodsTransfee(Long goodsTransfee){
		this.goodsTransfee=goodsTransfee;
	}

	public Long getGoodsTransfee(){
		return goodsTransfee;
	}
	public void setGoodsWeight(Double goodsWeight){
		this.goodsWeight=goodsWeight;
	}

	public Double getGoodsWeight(){
		return goodsWeight;
	}
	public void setInventoryType(String inventoryType){
		this.inventoryType=inventoryType;
	}

	public String getInventoryType(){
		return inventoryType;
	}
	public void setSeoDescription(String seoDescription){
		this.seoDescription=seoDescription;
	}

	public String getSeoDescription(){
		return seoDescription;
	}
	public void setSeoKeywords(String seoKeywords){
		this.seoKeywords=seoKeywords;
	}

	public String getSeoKeywords(){
		return seoKeywords;
	}
	public void setStorePrice(Double storePrice){
		this.storePrice=storePrice;
	}

	public Double getStorePrice(){
		return storePrice;
	}
	public void setStoreRecommend(boolean storeRecommend){
		this.storeRecommend=storeRecommend;
	}

	public boolean getStoreRecommend(){
		return storeRecommend;
	}
	public void setStoreRecommendTime(Date storeRecommendTime){
		this.storeRecommendTime=storeRecommendTime;
	}

	public Date getStoreRecommendTime(){
		return storeRecommendTime;
	}
	public void setZtcAdminContent(String ztcAdminContent){
		this.ztcAdminContent=ztcAdminContent;
	}

	public String getZtcAdminContent(){
		return ztcAdminContent;
	}
	public void setZtcApplyTime(Date ztcApplyTime){
		this.ztcApplyTime=ztcApplyTime;
	}

	public Date getZtcApplyTime(){
		return ztcApplyTime;
	}
	public void setZtcBeginTime(Date ztcBeginTime){
		this.ztcBeginTime=ztcBeginTime;
	}

	public Date getZtcBeginTime(){
		return ztcBeginTime;
	}
	public void setZtcClickNum(Long ztcClickNum){
		this.ztcClickNum=ztcClickNum;
	}

	public Long getZtcClickNum(){
		return ztcClickNum;
	}
	public void setZtcDredgePrice(Long ztcDredgePrice){
		this.ztcDredgePrice=ztcDredgePrice;
	}

	public Long getZtcDredgePrice(){
		return ztcDredgePrice;
	}
	public void setZtcGold(Long ztcGold){
		this.ztcGold=ztcGold;
	}

	public Long getZtcGold(){
		return ztcGold;
	}
	public void setZtcPayStatus(Long ztcPayStatus){
		this.ztcPayStatus=ztcPayStatus;
	}

	public Long getZtcPayStatus(){
		return ztcPayStatus;
	}
	public void setZtcPrice(Long ztcPrice){
		this.ztcPrice=ztcPrice;
	}

	public Long getZtcPrice(){
		return ztcPrice;
	}
	public void setZtcStatus(Long ztcStatus){
		this.ztcStatus=ztcStatus;
	}

	public Long getZtcStatus(){
		return ztcStatus;
	}
	public void setGcId(Long gcId){
		this.gcId=gcId;
	}

	public Long getGcId(){
		return gcId;
	}
	public void setGoodsBrandId(Long goodsBrandId){
		this.goodsBrandId=goodsBrandId;
	}

	public Long getGoodsBrandId(){
		return goodsBrandId;
	}
	public void setGoodsMainPhotoId(String goodsMainPhotoId){
		this.goodsMainPhotoId=goodsMainPhotoId;
	}

	public String getGoodsMainPhotoId(){
		return goodsMainPhotoId;
	}
	public void setGoodsStoreId(Long goodsStoreId){
		this.goodsStoreId=goodsStoreId;
	}

	public Long getGoodsStoreId(){
		return goodsStoreId;
	}
	public void setZtcAdminId(Long ztcAdminId){
		this.ztcAdminId=ztcAdminId;
	}

	public Long getZtcAdminId(){
		return ztcAdminId;
	}
	public void setGoodsCollect(Long goodsCollect){
		this.goodsCollect=goodsCollect;
	}

	public Long getGoodsCollect(){
		return goodsCollect;
	}
	public void setGroupBuy(Long groupBuy){
		this.groupBuy=groupBuy;
	}

	public Long getGroupBuy(){
		return groupBuy;
	}
	public void setGoodsChoiceType(Long goodsChoiceType){
		this.goodsChoiceType=goodsChoiceType;
	}

	public Long getGoodsChoiceType(){
		return goodsChoiceType;
	}
	public void setGroupId(Long groupId){
		this.groupId=groupId;
	}

	public Long getGroupId(){
		return groupId;
	}
	public void setActivityStatus(Long activityStatus){
		this.activityStatus=activityStatus;
	}

	public Long getActivityStatus(){
		return activityStatus;
	}
	public void setBargainStatus(Long bargainStatus){
		this.bargainStatus=bargainStatus;
	}

	public Long getBargainStatus(){
		return bargainStatus;
	}
	public void setDeliveryStatus(Long deliveryStatus){
		this.deliveryStatus=deliveryStatus;
	}

	public Long getDeliveryStatus(){
		return deliveryStatus;
	}
	public void setGoodsCurrentPrice(Double goodsCurrentPrice){
		this.goodsCurrentPrice=goodsCurrentPrice;
	}

	public Double getGoodsCurrentPrice(){
		return goodsCurrentPrice;
	}
	public Double getGoodsCurrentPrice(String property_id){
		QueryGoodsPriceRequest pammermap=new QueryGoodsPriceRequest();
		pammermap.setId(this.id+"");
		pammermap.setGsp(property_id);
		String url=PropertiesConfigUtil.readConfig("web_url")+"/load_goods_gsp.htm";
		String httprest=HttpClientUtil.doPost(url, JsonUtil.jsonStr2Map(JsonUtil.bean2JsonStr(pammermap)));
		Map<String,Object> map=JsonUtil.jsonStr2Map(httprest);
		String price=map.get("price")+"";
		return Double.valueOf(price);
	}
	public void setGoodsVolume(Double goodsVolume){
		this.goodsVolume=goodsVolume;
	}

	public Double getGoodsVolume(){
		return goodsVolume;
	}
	public void setEmsTransFee(Double emsTransFee){
		this.emsTransFee=emsTransFee;
	}

	public Double getEmsTransFee(){
		return emsTransFee;
	}
	public void setExpressTransFee(Double expressTransFee){
		this.expressTransFee=expressTransFee;
	}

	public Double getExpressTransFee(){
		return expressTransFee;
	}
	public void setMailTransFee(Double mailTransFee){
		this.mailTransFee=mailTransFee;
	}

	public Double getMailTransFee(){
		return mailTransFee;
	}
	public void setTransportId(Long transportId){
		this.transportId=transportId;
	}

	public Long getTransportId(){
		return transportId;
	}
	public void setCombinStatus(Long combinStatus){
		this.combinStatus=combinStatus;
	}

	public Long getCombinStatus(){
		return combinStatus;
	}
	public void setCombinBeginTime(Date combinBeginTime){
		this.combinBeginTime=combinBeginTime;
	}

	public Date getCombinBeginTime(){
		return combinBeginTime;
	}
	public void setCombinEndTime(Date combinEndTime){
		this.combinEndTime=combinEndTime;
	}

	public Date getCombinEndTime(){
		return combinEndTime;
	}
	public void setCombinPrice(Double combinPrice){
		this.combinPrice=combinPrice;
	}

	public Double getCombinPrice(){
		return combinPrice;
	}
	public void setDescriptionEvaluate(Double descriptionEvaluate){
		this.descriptionEvaluate=descriptionEvaluate;
	}

	public Double getDescriptionEvaluate(){
		return descriptionEvaluate;
	}
	public void setWeixinShopHot(boolean weixinShopHot){
		this.weixinShopHot=weixinShopHot;
	}

	public boolean getWeixinShopHot(){
		return weixinShopHot;
	}
	public void setWeixinShopHotTime(Date weixinShopHotTime){
		this.weixinShopHotTime=weixinShopHotTime;
	}

	public Date getWeixinShopHotTime(){
		return weixinShopHotTime;
	}
	public void setWeixinShopRecommend(boolean weixinShopRecommend){
		this.weixinShopRecommend=weixinShopRecommend;
	}

	public boolean getWeixinShopRecommend(){
		return weixinShopRecommend;
	}
	public void setWeixinShopRecommendTime(Date weixinShopRecommendTime){
		this.weixinShopRecommendTime=weixinShopRecommendTime;
	}

	public Date getWeixinShopRecommendTime(){
		return weixinShopRecommendTime;
	}

	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	if(null != id && !"".equals(id) ){
		sb.append("  id= "+id+",");
	}
	if(null != addTime && !"".equals(addTime) ){
		sb.append("  addTime= "+addTime+",");
	}
	
	if(null != goodsClick && !"".equals(goodsClick) ){
		sb.append("  goodsClick= "+goodsClick+",");
	}
	if(null != goodsDetails && !"".equals(goodsDetails) ){
		sb.append("  goodsDetails= "+goodsDetails+",");
	}
	if(null != goodsFee && !"".equals(goodsFee) ){
		sb.append("  goodsFee= "+goodsFee+",");
	}
	if(null != goodsInventory && !"".equals(goodsInventory) ){
		sb.append("  goodsInventory= "+goodsInventory+",");
	}
	if(null != goodsInventoryDetail && !"".equals(goodsInventoryDetail) ){
		sb.append("  goodsInventoryDetail= "+goodsInventoryDetail+",");
	}
	if(null != goodsName && !"".equals(goodsName) ){
		sb.append("  goodsName= "+goodsName+",");
	}
	if(null != goodsPrice && !"".equals(goodsPrice) ){
		sb.append("  goodsPrice= "+goodsPrice+",");
	}
	if(null != goodsProperty && !"".equals(goodsProperty) ){
		sb.append("  goodsProperty= "+goodsProperty+",");
	}

	if(null != goodsSalenum && !"".equals(goodsSalenum) ){
		sb.append("  goodsSalenum= "+goodsSalenum+",");
	}
	if(null != goodsSellerTime && !"".equals(goodsSellerTime) ){
		sb.append("  goodsSellerTime= "+goodsSellerTime+",");
	}
	if(null != goodsSerial && !"".equals(goodsSerial) ){
		sb.append("  goodsSerial= "+goodsSerial+",");
	}
	if(null != goodsStatus && !"".equals(goodsStatus) ){
		sb.append("  goodsStatus= "+goodsStatus+",");
	}
	if(null != goodsTransfee && !"".equals(goodsTransfee) ){
		sb.append("  goodsTransfee= "+goodsTransfee+",");
	}
	if(null != goodsWeight && !"".equals(goodsWeight) ){
		sb.append("  goodsWeight= "+goodsWeight+",");
	}
	if(null != inventoryType && !"".equals(inventoryType) ){
		sb.append("  inventoryType= "+inventoryType+",");
	}
	if(null != seoDescription && !"".equals(seoDescription) ){
		sb.append("  seoDescription= "+seoDescription+",");
	}
	if(null != seoKeywords && !"".equals(seoKeywords) ){
		sb.append("  seoKeywords= "+seoKeywords+",");
	}
	if(null != storePrice && !"".equals(storePrice) ){
		sb.append("  storePrice= "+storePrice+",");
	}

	if(null != storeRecommendTime && !"".equals(storeRecommendTime) ){
		sb.append("  storeRecommendTime= "+storeRecommendTime+",");
	}
	if(null != ztcAdminContent && !"".equals(ztcAdminContent) ){
		sb.append("  ztcAdminContent= "+ztcAdminContent+",");
	}
	if(null != ztcApplyTime && !"".equals(ztcApplyTime) ){
		sb.append("  ztcApplyTime= "+ztcApplyTime+",");
	}
	if(null != ztcBeginTime && !"".equals(ztcBeginTime) ){
		sb.append("  ztcBeginTime= "+ztcBeginTime+",");
	}
	if(null != ztcClickNum && !"".equals(ztcClickNum) ){
		sb.append("  ztcClickNum= "+ztcClickNum+",");
	}
	if(null != ztcDredgePrice && !"".equals(ztcDredgePrice) ){
		sb.append("  ztcDredgePrice= "+ztcDredgePrice+",");
	}
	if(null != ztcGold && !"".equals(ztcGold) ){
		sb.append("  ztcGold= "+ztcGold+",");
	}
	if(null != ztcPayStatus && !"".equals(ztcPayStatus) ){
		sb.append("  ztcPayStatus= "+ztcPayStatus+",");
	}
	if(null != ztcPrice && !"".equals(ztcPrice) ){
		sb.append("  ztcPrice= "+ztcPrice+",");
	}
	if(null != ztcStatus && !"".equals(ztcStatus) ){
		sb.append("  ztcStatus= "+ztcStatus+",");
	}
	if(null != gcId && !"".equals(gcId) ){
		sb.append("  gcId= "+gcId+",");
	}
	if(null != goodsBrandId && !"".equals(goodsBrandId) ){
		sb.append("  goodsBrandId= "+goodsBrandId+",");
	}
	if(null != goodsMainPhotoId && !"".equals(goodsMainPhotoId) ){
		sb.append("  goodsMainPhotoId= "+goodsMainPhotoId+",");
	}
	if(null != goodsStoreId && !"".equals(goodsStoreId) ){
		sb.append("  goodsStoreId= "+goodsStoreId+",");
	}
	if(null != ztcAdminId && !"".equals(ztcAdminId) ){
		sb.append("  ztcAdminId= "+ztcAdminId+",");
	}
	if(null != goodsCollect && !"".equals(goodsCollect) ){
		sb.append("  goodsCollect= "+goodsCollect+",");
	}
	if(null != groupBuy && !"".equals(groupBuy) ){
		sb.append("  groupBuy= "+groupBuy+",");
	}
	if(null != goodsChoiceType && !"".equals(goodsChoiceType) ){
		sb.append("  goodsChoiceType= "+goodsChoiceType+",");
	}
	if(null != groupId && !"".equals(groupId) ){
		sb.append("  groupId= "+groupId+",");
	}
	if(null != activityStatus && !"".equals(activityStatus) ){
		sb.append("  activityStatus= "+activityStatus+",");
	}
	if(null != bargainStatus && !"".equals(bargainStatus) ){
		sb.append("  bargainStatus= "+bargainStatus+",");
	}
	if(null != deliveryStatus && !"".equals(deliveryStatus) ){
		sb.append("  deliveryStatus= "+deliveryStatus+",");
	}
	if(null != goodsCurrentPrice && !"".equals(goodsCurrentPrice) ){
		sb.append("  goodsCurrentPrice= "+goodsCurrentPrice+",");
	}
	if(null != goodsVolume && !"".equals(goodsVolume) ){
		sb.append("  goodsVolume= "+goodsVolume+",");
	}
	if(null != emsTransFee && !"".equals(emsTransFee) ){
		sb.append("  emsTransFee= "+emsTransFee+",");
	}
	if(null != expressTransFee && !"".equals(expressTransFee) ){
		sb.append("  expressTransFee= "+expressTransFee+",");
	}
	if(null != mailTransFee && !"".equals(mailTransFee) ){
		sb.append("  mailTransFee= "+mailTransFee+",");
	}
	if(null != transportId && !"".equals(transportId) ){
		sb.append("  transportId= "+transportId+",");
	}
	if(null != combinStatus && !"".equals(combinStatus) ){
		sb.append("  combinStatus= "+combinStatus+",");
	}
	if(null != combinBeginTime && !"".equals(combinBeginTime) ){
		sb.append("  combinBeginTime= "+combinBeginTime+",");
	}
	if(null != combinEndTime && !"".equals(combinEndTime) ){
		sb.append("  combinEndTime= "+combinEndTime+",");
	}
	if(null != combinPrice && !"".equals(combinPrice) ){
		sb.append("  combinPrice= "+combinPrice+",");
	}
	if(null != descriptionEvaluate && !"".equals(descriptionEvaluate) ){
		sb.append("  descriptionEvaluate= "+descriptionEvaluate+",");
	}

	if(null != weixinShopHotTime && !"".equals(weixinShopHotTime) ){
		sb.append("  weixinShopHotTime= "+weixinShopHotTime+",");
	}

	if(null != weixinShopRecommendTime && !"".equals(weixinShopRecommendTime) ){
		sb.append("  weixinShopRecommendTime= "+weixinShopRecommendTime+",");
	}
	sb.append("]");
	String toStr =sb.toString();
	return toStr.substring(0,toStr.indexOf(",]"))+"]";
	}

}
