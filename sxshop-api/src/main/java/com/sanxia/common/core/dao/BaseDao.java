
package com.sanxia.common.core.dao;

import java.util.List;
import java.util.Map;





/**
 * 鏁版嵁璁块棶灞傚熀纭�敮鎾戞帴鍙�
 *
 */
public interface BaseDao<T> {

    /**
     * 鍑芥暟鍔熻兘璇存槑 锛氬崟鏉℃彃鍏ユ暟鎹� 淇敼鑰呭悕瀛楋細zgn 
     * 
     * @鍙傛暟锛欯param entity
     * @鍙傛暟锛欯return
     * @return锛歩nt
     * @throws
     */
    int insertOne(T entity);

  

    /**
     * 鍑芥暟鍔熻兘璇存槑 锛氭牴鎹甶d鍗曟潯鏇存柊鏁版嵁. 淇敼鑰呭悕瀛楋細 zgn 
     * 
     * @鍙傛暟锛欯param entity
     * @鍙傛暟锛欯return
     * @return锛歩nt
     * @throws
     */
    int updateOne(T entity);

    

    /**
     * 鍑芥暟鍔熻兘璇存槑 锛�鏍规嵁id鏌ヨ鏁版嵁. 淇敼鑰呭悕瀛楋細 zgn 
     * 
     * @鍙傛暟锛欯param id
     * @鍙傛暟锛欯return
     * @return锛歍
     * @throws
     */
    T getById(String id);

 

    /**
     * 鏍规嵁鏉′欢鏌ヨ listBy: <br/>
     * 
     * @param paramMap
     * @return 杩斿洖瀹炰綋
     */
    public T getBy(Map<String, Object> paramMap);
    
    /**
     * 鏍规嵁鏉′欢鏌ヨ鍒楄〃鏁版嵁.
     */
    public List<T> listBy(Map<String, Object> paramMap);


    /**
     * 鍑芥暟鍔熻兘璇存槑 锛�鏍规嵁id鍒犻櫎鏁版嵁. 淇敼鑰呭悕瀛楋細 zgn 锛�     * 
     * @鍙傛暟锛欯param id
     * @鍙傛暟锛欯return
     * @return锛歩nt
     * @throws
     */
    int delete(String id);
    
    

    /**
     * 鍑芥暟鍔熻兘璇存槑 锛�鏍规嵁鏉′欢缁熻鍒楄〃鏁版嵁鎬绘潯鏁� 淇敼鑰呭悕瀛楋細 zgn 锛�     * 
     * @鍙傛暟锛欯param list
     * @鍙傛暟锛欯return
     * @return锛歩nt
     * @throws
     */
    long  listPageCount(Map<String, Object> paramMap);
   
    
    /**
     * 鍑芥暟鍔熻兘璇存槑 锛�鏍规嵁鏉′欢鏌ヨ鍒嗛〉鏁版嵁. 淇敼鑰呭悕瀛楋細 zgn 锛�     * 
     * @鍙傛暟锛欯param list
     * @鍙傛暟锛欯return
     * @return锛歩nt
     * @throws
     */
    @SuppressWarnings("rawtypes")
	public List<T> listPage(Map<String, Object> paramMap);

   
    /**
     * 鍑芥暟鍔熻兘璇存槑 锛�鏍规嵁鏉′欢缁熻鍒嗛〉鏁版嵁. 淇敼鑰呭悕瀛楋細 zgn 锛�     * 
     * @鍙傛暟锛欯param list
     * @鍙傛暟锛欯return
     * @return锛歩nt
     * @throws
     */
    Map<String, Object> countByPageParam(Map<String, Object> paramMap);
}
