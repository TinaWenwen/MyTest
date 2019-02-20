package demo.year2018;

import java.math.BigDecimal;

/**
 * @author xuxiaoyan
 * @date 2018-08-28 14:06
 */
public class Decimal2Long {

    public static void main(String[] args) {

        Long weight;
        BigDecimal packageActualWeight = new BigDecimal(540.00);
        //weight = packageActualWeight.longValue();
        weight = Double.valueOf(packageActualWeight.doubleValue()).longValue();
        System.out.println(weight);
    }
}
