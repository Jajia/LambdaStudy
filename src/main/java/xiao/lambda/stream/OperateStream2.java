package xiao.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OperateStream2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "helloworld");
        list = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list);

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
    }
}
