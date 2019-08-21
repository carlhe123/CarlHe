package com.carl.util.json;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description JsonUtils测试类
 * @Author carl.he
 * @Date 2019/8/1 10:24
 * @Version 1.0
 **/
public class JsonUtilsTest {

    @Test
    public void testJson() {
        String jsonArrayStr = "[{\"maxAmt\":100000,\"minAmt\":1000,\"rate\":0.09}]";
        String jsonStr = "{\"maxAmt\":100000,\"minAmt\":1000,\"rate\":0.09}";
        Map<String,BuyAmtAndYieldRate> map = new HashMap<>();
        List<BuyAmtAndYieldRate> list = JsonUtils.jsonArrayToList(jsonArrayStr, BuyAmtAndYieldRate.class);
        for (BuyAmtAndYieldRate rate : list) {
            System.out.println("maxAmt:" + rate.getMaxAmt());
            System.out.println("minAmt:" + rate.getMinAmt());
            System.out.println("rate:" + rate.getRate());
        }
        BuyAmtAndYieldRate object = JsonUtils.jsonStringToObject(jsonStr, BuyAmtAndYieldRate.class);
        System.out.println("maxAmt:" + object.getMaxAmt());
        System.out.println("minAmt:" + object.getMinAmt());
        System.out.println("rate:" + object.getRate());
        map.put("测试",object);
        String str = JsonUtils.mapToJson(map);
        System.out.println(str);
        map = new HashMap<>();
        map = JsonUtils.jsonToMap(str);
        System.out.println(map);

    }
}
