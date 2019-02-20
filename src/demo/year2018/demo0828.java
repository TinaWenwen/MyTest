package demo.year2018;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuxiaoyan
 * @date 2018-08-28 18:08
 */
public class demo0828 {
    public static void main(String[] args) {
        Map<String, Integer> tempMap = new HashMap<>();
        Map<String, Integer> tempMap1 = new HashMap<>();
        tempMap.put("1", new Integer(1));
        tempMap.put("2", 2);
        tempMap.put("1", 5);
        tempMap1.put("2", 2);
        tempMap1.put("1", 5);
        /*tempMap1.put("3", 1);*/
        System.out.println(tempMap.equals(tempMap1));
    }
}
