package com.carl.util.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * @Description Json处理工具类
 * @Author carl.he
 * @Date 2019/8/1 9:47
 * @Version 1.0
 **/
public class JsonUtils {
    /**
     * @Author carl.he
     * @Description 将jsonArrayString 转换为对应的 Object
     * @Date 2019/8/1 10:13
     * @param jsonArrayString e.g.：[{"maxAmt":100000,"minAmt":1000,"rate":0.09}]
     * @param clazz 需要转换的对象
     * @return {@link List<T>}
     **/
    public static <T> List<T>  jsonArrayToList(String jsonArrayString,Class<T> clazz){
        return JSONArray.parseArray(jsonArrayString,clazz);
    }

    /**
     * @Author carl.he
     * @Description 将jsonString 转换为对应的 Object
     * @Date 2019/8/1 10:16
     * @param jsonString e.g.：{"maxAmt":100000,"minAmt":1000,"rate":0.09}
     * @param clazz	需要转换的对象
     * @return {@link T}
     **/
    public static <T> T jsonStringToObject(String jsonString,Class<T> clazz){
        return JSONObject.parseObject(jsonString,clazz);
    }

    /**
     * @Author carl.he
     * @Description 将map转换为json
     * @Date 2019/8/1 10:40
     * @param map Map<String,T>
     * @return {@link String e.g.:{"测试":{"maxAmt":100000,"minAmt":1000,"rate":0.09}}}
     **/
    public static <T> String mapToJson(Map<String,T> map){
        return JSONObject.toJSONString(map);
    }

    /**
     * @Author carl.he
     * @Description 将json转换为map
     * @Date 2019/8/1 11:00
     * @param jsonStr e.g.:{"测试":{"maxAmt":100000,"minAmt":1000,"rate":0.09}}
     * @return {@link Map< String,T>}
     **/
    public static <T> Map<String,T> jsonToMap(String jsonStr){
        return (Map<String, T>) JSONObject.parse(jsonStr);
    }
}
