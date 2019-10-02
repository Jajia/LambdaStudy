package xiao.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        // 调用Stream的静态方法创建对象
        Stream stream = Stream.of(1, 2, 3, 4, 5);

        // 用数组创建Stream对象
        String[] arr = {"1", "2", "3", "4", "5"};
        Stream stream2 = Stream.of(arr);
        Stream stream3 = Arrays.stream(arr);

        // 用集合创建Stream对象
        List<String> list = Arrays.asList("1","2","3","4","5");
        Stream stream4 = list.stream();
    }
}
