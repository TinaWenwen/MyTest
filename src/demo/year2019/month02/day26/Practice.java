package demo.year2019.month02.day26;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author xuxiaoyan
 * @date 2019-02-26 10:11
 */
public class Practice {

    public static void main(String[] args) {
        String str = "AabecBBee";
        // System.out.println(str.chars().filter(Character::isLowerCase).count());

        String str1 = "agageogjaeogjeAAACD";
        String str2 = "fjeofjaoejfiaBBDFJfjeifje";

        List<String> strList = Stream.of(str, str1, str2).collect(Collectors.toList());

        Optional<String> result = strList.stream().max(Comparator.comparing(str3 -> str3.chars().filter(Character::isLowerCase).count()));
        System.out.println(result);
    }
}
