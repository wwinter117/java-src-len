package cn.wwinter.test.util_package;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhangdongdong
 * @CreateTime: 2023-04-20
 */
public class Demo {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("1", "v1");
        map.put("2", "v2");
        map.put("3", "v3");

        map.forEach((m1, m2) -> System.out.println(m1 + "---" + m2));
    }
}
