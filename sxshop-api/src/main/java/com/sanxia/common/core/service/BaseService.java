
package com.sanxia.common.core.service;

import java.util.List;
import java.util.Map;

import com.sanxia.common.core.page.PageBean;
import com.sanxia.common.core.page.PageParam;





/**
 * 数据访问层基础支撑接口.
 *
 */
public interface BaseService<T> {

    /**
     * 函数功能说明 ：单条插入数据. 修改者名字：zgn 
     * 
     * @参数：@param entity
     * @参数：@return
     * @return：int
     * @throws
     */
    int insertOne(T entity);

  

    /**
     * 函数功能说明 ：根据id单条更新数据. 修改者名字： zgn 
     * 
     * @参数：@param entity
     * @参数：@return
     * @return：int
     * @throws
     */
    int updateOne(T entity);

    

    /**
     * 函数功能说明 ： 根据id查询数据. 修改者名字： zgn 
     * 
     * @参数：@param id
     * @参数：@return
     * @return：T
     * @throws
     */
    T getById(String id);

 

    /**
     * 根据条件查询 listBy: <br/>
     * 
     * @param paramMap
     * @return 返回实体
     */
    public T getBy(Map<String, Object> paramMap);
    
    /**
     * 根据条件查询列表数据.
     */
    public List<T> listBy(Map<String, Object> paramMap);


    /**
     * 函数功能说明 ： 根据id删除数据. 修改者名字： zgn ：
     * 
     * @参数：@param id
     * @参数：@return
     * @return：int
     * @throws
     */
    int delete(String id);

    
   
    
    long listPageCount(Map<String, Object> pammermap);
    
    @SuppressWarnings("rawtypes")
	public List<T> listPage( Map<String, Object> paramMap);

   
}
