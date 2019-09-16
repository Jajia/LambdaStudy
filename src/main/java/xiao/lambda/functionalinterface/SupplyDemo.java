package xiao.lambda.functionalinterface;

import java.util.function.Supplier;

public class SupplyDemo {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 5;
        // 可以应用于工厂类，这里就不多举例了
        System.out.println(supplier.get());
    }
}
