package xiao.lambda.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        ConsumerDemo consumerDemo = new ConsumerDemo();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // forEach 接受 Consumer实例，对集合每一个元素进行操作，不返回值
        list.forEach(item -> System.out.println(item));

        // 传递一个行为和一个值，方法会对值应用这个行为
        consumerDemo.consume((item) -> System.out.println(item), 5);
    }

    public void consume(Consumer<Integer> consumer, Integer i) {
        consumer.accept(i);
    }
}
