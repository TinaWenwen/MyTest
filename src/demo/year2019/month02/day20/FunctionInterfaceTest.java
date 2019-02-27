package demo.year2019.month02.day20;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * @author xuxiaoyan
 * @date 2019-02-20 16:28
 */
public class FunctionInterfaceTest {

    /**
     * 1.Lambda 表达式是一个匿名方法，将行为像数据一样进行传递。
     * 2.Lambda 表达式的常见结构：BinaryOperator<Integer> add = (x, y) → x + y。
     * 3.函数接口指仅具有单个抽象方法的接口，用来表示 Lambda 表达式的类型。
     *
     * @param args
     */
    public static void main(String[] args) {
        // 用Lambda表达式定义一个函数
        Predicate<Integer> atLeast5 = x -> x > 5;
        System.out.println(atLeast5.test(6));

        BinaryOperator<Integer> addLongs = (x, y) -> x + y;
        System.out.println(addLongs.apply(3, 9));

        Runnable helloworld = () -> System.out.println("hello");
    }
}
