package xiao.lambda.stream;

import java.util.Arrays;
import java.util.List;

public class OperateStream1 {
    public static void main(String[] args) {
        // 把数字集合的每一项乘2，并且求和
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list.stream().map(item -> item * 2).mapToInt(item -> item).sum();
        System.out.println(sum);
    }
}
