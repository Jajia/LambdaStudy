package xiao.lambda.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        PredicateDemo predicateDemo = new PredicateDemo();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 流的filter方法接受 Predicate 参数，把条件为true的元素返回回来，形成一个新的集合流
        list.stream().filter(i -> i > 5).forEach(i -> System.out.println(i));

        // 与Function类似的，Predicate也能组合，形成or and 的组合条件，这里只写一个and
        System.out.println(predicateDemo.andPredicate(i -> i > 5, i -> i % 2 == 0, 7));

    }

    public boolean andPredicate(Predicate<Integer> predicate1, Predicate<Integer> predicate2, Integer i) {
        return predicate1.and(predicate2).test(i);
    }
}
