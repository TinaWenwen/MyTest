package demo.year2018;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author xuxiaoyan
 * @date 2018-12-03 17:10
 */
public class NumTest {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal("99988123456789.389");
        System.out.println(parseNumber(",###,###", bd)); // out: 123,456,789
        System.out.println(parseNumber(",###,###.000", bd)); // out: 123,456,789.30
    }

    public static String parseNumber(String pattern, BigDecimal bd) {
        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(bd);
    }
}


