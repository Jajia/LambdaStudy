package xiao.lambda.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        FunctionDemo functionDemo = new FunctionDemo();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // steam的map函数接受Function实例，对每一个元素进行操作，并根据返回结果形成一个新的流对象
        list.stream().map(i -> i + 1).forEach(i -> System.out.println(i));

        // 传递一个行为，和一个值，返回把行为作用在值上的结果
        System.out.println(functionDemo.function(x -> x * 3, 5));

        // compose会形成组合行为，先作用function2,再作用function1
        System.out.println(functionDemo.composeFunction(x -> x + 2, x -> x * x, 5));

        // andThen会形成组合行为，先作用function1,再作用function2
        System.out.println(functionDemo.andThenFunction(x -> x + 2, x -> x * x, 5));
    }

    public Integer function(Function<Integer, Integer> function, Integer i) {
        return function.apply(i);
    }

    public Integer composeFunction(Function<Integer, Integer> function1, Function<Integer, Integer> function2, Integer i) {
        return function1.compose(function2).apply(i);
    }

    public Integer andThenFunction(Function<Integer, Integer> function1, Function<Integer, Integer> function2, Integer i) {
        return function1.andThen(function2).apply(i);
    }
}
