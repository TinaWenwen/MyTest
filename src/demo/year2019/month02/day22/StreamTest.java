package demo.year2019.month02.day22;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 流测试类
 *
 * @author xuxiaoyan
 * @date 2019-02-22 16:01
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> collect = Stream.of("a", "b", "c").collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect1 = Stream.of("a", "b", "hello").map(String -> String.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect1);

        Integer reduce = Stream.of(1, 2, 3).reduce(3, (acc, element) -> acc + element);
        System.out.println(reduce);


    }
}
