package com.sanxia.market.dto.index;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sanxia.market.dao.ShoppingGoodsclassDao;
import com.sanxia.market.dto.ApiResult;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("产品分类返回信息(多级)") 
@Component
public class GoodsClassAllResponse  implements Serializable{

	@Autowired
	private ShoppingGoodsclassDao dao;
	
	@ApiModelProperty(value = "分类id" ,dataType = "String") 
	private String id;
	
	@ApiModelProperty(value = "分类名称" ,dataType = "String") 
	private String className;

	@ApiModelProperty(value = "是否推荐（1是0否）" ,dataType = "String") 
	private String recommend;
	
	@ApiModelProperty(value = "排序数值越小越靠前" ,dataType = "String") 
	private String sequence;
	
	@ApiModelProperty(value = "父类id" ,dataType = "String") 
	private String parent_id;
	
	@ApiModelProperty(value = "系统图标,目前0-34分别代表系统的35个图标" ,dataType = "String") 
	private String icon_sys;
	
	@ApiModelProperty(value = "图标类型：0代表使用系统图标1代表使用自定义图标" ,dataType = "String") 
	private String icon_type;
	
	@ApiModelProperty(value = "自定义图标地址" ,dataType = "String") 
	private String icon_path;
	
	@ApiModelProperty(value = "子类" ,dataType = "Object") 
	private List<GoodsClassResponse> childs;
	
	@ApiModelProperty(value = "级别" ,dataType = "String") 
	private String level;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public String getIcon_sys() {
		return icon_sys;
	}

	public void setIcon_sys(String icon_sys) {
		this.icon_sys = icon_sys;
	}

	public String getIcon_type() {
		return icon_type;
	}

	public void setIcon_type(String icon_type) {
		this.icon_type = icon_type;
	}

	public String getIcon_path() {
		return icon_path;
	}

	public void setIcon_path(String icon_path) {
		this.icon_path = icon_path;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public List<GoodsClassResponse> getChilds() {

		return childs;
	}

	public void setChilds(List<GoodsClassResponse> childs) {
		this.childs = childs;
	}
	

	
	
	
}
