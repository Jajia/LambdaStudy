package xiao.lambda.stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperateStream1 {
    public static void main(String[] args) {
        // 把数字集合的每一项乘2，并且求和
        /*List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list.stream().map(item -> item * 2).mapToInt(item -> item).sum();
        System.out.println(sum);*/

        // 把字符串流转换成字符串数组
        Stream<String> stream = Stream.of("Hello", "World", "HelloWorld");
        String[] array = stream.toArray(length -> new String[length]);
        System.out.println(Arrays.toString(array));

        Stream<String> stream2 = Stream.of("Hello", "World", "HelloWorld");
        // List<String> streamList = stream2.collect(Collectors.toList());
        // List<String> streamList = stream2.collect(() -> new ArrayList<>(), (list, item) -> list.add(item), (list1, list2) -> list1.addAll(list2));
        List<String> streamList = stream2.collect(Collectors.toCollection(LinkedList::new));
        System.out.println(streamList);
    }
}
