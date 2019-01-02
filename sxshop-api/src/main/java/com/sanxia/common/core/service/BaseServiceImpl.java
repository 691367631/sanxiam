package com.sanxia.common.core.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.sanxia.common.core.dao.BaseDao;
import com.sanxia.common.core.exception.BizException;
import com.sanxia.common.core.page.PageBean;
import com.sanxia.common.core.page.PageParam;





/**
 * 数据访问层基础支撑接口.
 *
 */
public class BaseServiceImpl<T> implements BaseService<T>{

	@Autowired
	private BaseDao<T> dao;
	
    /**
     * 函数功能说明 ：单条插入数据. 修改者名字：zgn 
     * 
     * @参数：@param entity
     * @参数：@return
     * @return：int
     * @throws
     */

    public int insertOne(T entity){
    	int result=dao.insertOne(entity);
    	if(result<= 0){
    		throw BizException.DB_INSERT_RESULT_0.newInstance("数据库操作插入失败");
    	}
    	return result;
    };

  

    /**
     * 函数功能说明 ：根据id单条更新数据. 修改者名字： zgn 
     * 
     * @参数：@param entity
     * @参数：@return
     * @return：int
     * @throws
     */
    public int updateOne(T entity){
    	int result = dao.updateOne(entity);
    	if (result <= 0) {
            throw BizException.DB_UPDATE_RESULT_0.newInstance("数据库操作,update失败！");
        }
    	return result;
    };
    

    /**
     * 函数功能说明 ： 根据id查询数据. 修改者名字： zgn 
     * 
     * @参数：@param id
     * @参数：@return
     * @return：T
     * @throws
     */
    public T getById(String id){
    	T t=dao.getById(id);
    	return t;
    };

 

    /**
     * 根据条件查询 listBy: <br/>
     * 
     * @param paramMap
     * @return 返回实体
     */
    public T getBy(Map<String, Object> paramMap){
    	if (paramMap == null||paramMap.isEmpty()) {
            return null;
        }
    	return dao.getBy(paramMap);
    };
    
    /**
     * 根据条件查询列表数据.
     */
    public List<T> listBy(Map<String, Object> paramMap){
    	if(paramMap==null||paramMap.isEmpty()){
    		return null;
    	}
    	 return dao.listBy(paramMap);
    };


    /**
     * 函数功能说明 ： 根据id删除数据. 修改者名字： zgn ：
     * 
     * @参数：@param id
     * @参数：@return
     * @return：int
     * @throws
     */
    public int delete(String id){
    	
    	int result=dao.delete(id);
    	/*if(result<= 0){
    		throw BizException.DB_DELETE_RESULT_0.newInstance("数据库操作删除失败!");
    	}*/
    	return result;
    };
    /**
     * 函数功能说明 ： 分页查询总条数. 修改者名字： zgn ：
     * 
     * @参数：@param list
     * @参数：@return
     * @return：int
     * @throws
     */
    public long listPageCount(Map<String, Object> paramMap ){
        Long totalCount = dao.listPageCount(paramMap);
        return totalCount;
    }

    /**
     * 函数功能说明 ： 分页查询暂未实现. 修改者名字： zgn ：
     * 
     * @参数：@param list
     * @参数：@return
     * @return：int
     * @throws
     */
   
    @SuppressWarnings("rawtypes")
    public List<T> listPage(Map<String, Object> paramMap){
    	if(paramMap==null||paramMap.isEmpty()){
    		return null;
    	}
    	 return dao.listPage(paramMap);
    };

   
}
