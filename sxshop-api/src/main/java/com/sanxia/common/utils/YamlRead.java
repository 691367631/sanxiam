package com.sanxia.common.utils;

import org.yaml.snakeyaml.Yaml;
import java.io.FileInputStream;
//import java.net.URL;
import java.util.Map;

public class YamlRead {

public static Map yamlToMap(String url) {
        
        try {
            Yaml yaml = new Yaml();
           
            if (url != null) {
                //获取test.yaml文件中的配置数据，然后转换为obj，
               /* Object obj =yaml.load(new FileInputStream(url.getFile()));
                System.out.println(obj);*/
                //也可以将值转换为Map
                Map map =(Map)yaml.load(url);
                System.out.println(map);
                //通过map我们取值就可以了.
                return map;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
	
}
