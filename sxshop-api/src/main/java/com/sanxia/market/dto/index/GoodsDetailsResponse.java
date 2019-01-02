package com.sanxia.market.dto.index;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.sanxia.market.dto.ApiResult;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("产品明细返回信息") 
public class GoodsDetailsResponse  implements Serializable{

	@ApiModelProperty(value = "产品id" ,dataType = "String") 
	private String id;
	
	@ApiModelProperty(value = "产品详情" ,dataType = "String") 
	private String goods_details;

	@ApiModelProperty(value = "库存" ,dataType = "String") 
	private String goods_inventory;
	
	@ApiModelProperty(value = "产品名称" ,dataType = "String") 
	private String goods_name;
	
	@ApiModelProperty(value = "产品价格" ,dataType = "String") 
	private String goods_price;
	
	@ApiModelProperty(value = "产品参数" ,dataType = "String") 
	private String goods_property;
	
	@ApiModelProperty(value = "店铺推荐（0未推荐，1推荐）" ,dataType = "String") 
	private String goods_recommend;
	
	@ApiModelProperty(value = "销量" ,dataType = "String") 
	private String goods_salenum;

	@ApiModelProperty(value = "顺序" ,dataType = "String") 
	private String goods_serial;
	
	@ApiModelProperty(value = "运费类型（0买家承担1卖家承担）" ,dataType = "String") 
	private String goods_transfee;
	
	@ApiModelProperty(value = "产品重量" ,dataType = "String") 
	private String goods_weight;
	
	@ApiModelProperty(value = "产品分类id" ,dataType = "String") 
	private String gc_id;
	
	@ApiModelProperty(value = "品牌id" ,dataType = "String") 
	private String goods_brand_id;
	
	@ApiModelProperty(value = "(平台)商品推荐" ,dataType = "String") 
	private String store_recommend;
	
	@ApiModelProperty(value = "商品主图图片" ,dataType = "String") 
	private String goods_main_photo_id;
	
	@ApiModelProperty(value = "店铺id" ,dataType = "String") 
	private String goods_store_id;
	
	@ApiModelProperty(value = "店铺名称" ,dataType = "String") 
	private String goods_store_name;
	
	@ApiModelProperty(value = "点击量" ,dataType = "String") 
	private String goods_click;
	
	@ApiModelProperty(value = "描述评分" ,dataType = "String") 
	private String description_evaluate; 
	
	
	@ApiModelProperty(value = "收藏量" ,dataType = "String") 
	private String goods_collect;
	

	@ApiModelProperty(value = "商品当前价格" ,dataType = "String") 
	private String goods_current_price;
	
	@ApiModelProperty(value = "ems运费" ,dataType = "String") 
	private String ems_trans_fee;
	
	@ApiModelProperty(value = "快递运费" ,dataType = "String") 
	private String express_trans_fee;
	
	@ApiModelProperty(value = "平邮运费" ,dataType = "String") 
	private String mail_trans_fee;
/*	@ApiModelProperty(value = "商品图片" ,dataType = "String") 
	private List<String> goods_photos;*/
	@ApiModelProperty(value = "库存类型，all为不区分规格，spec" ,dataType = "String")
    private String inventory_type;
 
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getGoods_details() {
		return goods_details;
	}


	public void setGoods_details(String goods_details) {
		this.goods_details = goods_details;
	}


	public String getGoods_inventory() {
		return goods_inventory;
	}


	public void setGoods_inventory(String goods_inventory) {
		this.goods_inventory = goods_inventory;
	}


	public String getGoods_name() {
		return goods_name;
	}


	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}


	public String getGoods_price() {
		return goods_price;
	}


	public void setGoods_price(String goods_price) {
		this.goods_price = goods_price;
	}


	public String getGoods_property() {
		return goods_property;
	}


	public void setGoods_property(String goods_property) {
		this.goods_property = goods_property;
	}


	public String getGoods_recommend() {
		return goods_recommend;
	}


	public void setGoods_recommend(String goods_recommend) {
		this.goods_recommend = goods_recommend;
	}


	public String getGoods_salenum() {
		return goods_salenum;
	}


	public void setGoods_salenum(String goods_salenum) {
		this.goods_salenum = goods_salenum;
	}


	public String getGoods_serial() {
		return goods_serial;
	}


	public void setGoods_serial(String goods_serial) {
		this.goods_serial = goods_serial;
	}


	public String getGoods_transfee() {
		return goods_transfee;
	}


	public void setGoods_transfee(String goods_transfee) {
		this.goods_transfee = goods_transfee;
	}


	public String getGoods_weight() {
		return goods_weight;
	}


	public void setGoods_weight(String goods_weight) {
		this.goods_weight = goods_weight;
	}


	public String getGc_id() {
		return gc_id;
	}


	public void setGc_id(String gc_id) {
		this.gc_id = gc_id;
	}


	public String getGoods_brand_id() {
		return goods_brand_id;
	}


	public void setGoods_brand_id(String goods_brand_id) {
		this.goods_brand_id = goods_brand_id;
	}


	public String getStore_recommend() {
		return store_recommend;
	}


	public void setStore_recommend(String store_recommend) {
		this.store_recommend = store_recommend;
	}


	public String getGoods_main_photo_id() {
		return goods_main_photo_id;
	}


	public void setGoods_main_photo_id(String goods_main_photo_id) {
		this.goods_main_photo_id = goods_main_photo_id;
	}


	public String getGoods_store_id() {
		return goods_store_id;
	}


	public void setGoods_store_id(String goods_store_id) {
		this.goods_store_id = goods_store_id;
	}


	public String getGoods_click() {
		return goods_click;
	}


	public void setGoods_click(String goods_click) {
		this.goods_click = goods_click;
	}


	public String getDescription_evaluate() {
		return description_evaluate;
	}


	public void setDescription_evaluate(String description_evaluate) {
		this.description_evaluate = description_evaluate;
	}


	public String getGoods_collect() {
		return goods_collect;
	}


	public void setGoods_collect(String goods_collect) {
		this.goods_collect = goods_collect;
	}

	

	public String getGoods_current_price() {
		return goods_current_price;
	}


	public void setGoods_current_price(String goods_current_price) {
		this.goods_current_price = goods_current_price;
	}


	public String getEms_trans_fee() {
		return ems_trans_fee;
	}


	public void setEms_trans_fee(String ems_trans_fee) {
		this.ems_trans_fee = ems_trans_fee;
	}


	public String getExpress_trans_fee() {
		return express_trans_fee;
	}


	public void setExpress_trans_fee(String express_trans_fee) {
		this.express_trans_fee = express_trans_fee;
	}


	public String getMail_trans_fee() {
		return mail_trans_fee;
	}


	public void setMail_trans_fee(String mail_trans_fee) {
		this.mail_trans_fee = mail_trans_fee;
	}


	public String getInventory_type() {
		return inventory_type;
	}


	public void setInventory_type(String inventory_type) {
		this.inventory_type = inventory_type;
	}


	public String getGoods_store_name() {
		return goods_store_name;
	}


	public void setGoods_store_name(String goods_store_name) {
		this.goods_store_name = goods_store_name;
	}


	/*public List<String> getGoods_photos() {
		return goods_photos;
	}


	public void setGoods_photos(List<String> goods_photos) {
		this.goods_photos = goods_photos;
	}*/
	
	
}
