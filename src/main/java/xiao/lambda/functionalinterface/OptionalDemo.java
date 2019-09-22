package xiao.lambda.functionalinterface;

import xiao.lambda.domain.Book;
import xiao.lambda.domain.Student;
import xiao.lambda.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    boolean flag;
    public static void main(String[] args) {
        OptionalDemo optionalDemo = new OptionalDemo();
        System.out.println(optionalDemo.login(new User("sean","sean")));
        Student student = new Student("xiao",12);
        Book book1 = new Book("book1", 12);
        Book book2 = new Book("book2", 16);
        student.setBooks(Arrays.asList(book1, book2));
        System.out.println(optionalDemo.getBookByStudent(student));
        optionalDemo.ifExpansive(book2);
    }

    // 对于Optional容器，我们有三种处理方法，就是所谓的map filter ifPresent 对应Function Predicate Consumer接口

    // 用户名与密码相等则登录成功
    public User login(User userDTO) {
        return Optional.ofNullable(userDTO).filter(user -> user.getPassword().equals(user.getUsername())).orElse(null);
    }

    // 和上面filter操作非常类似，不为空就操作对象，获得另一个容器，返回容器内的值
    public List<Book> getBookByStudent(Student studentDTO) {
        return Optional.ofNullable(studentDTO).map((student -> student.getBooks())).orElse(new ArrayList<>());
    }

    // 这个是Consumer对象，如果不为空则进行一些操作，但并不生成新的容器对象
    public void ifExpansive(Book bookDTO) {
        Optional.ofNullable(bookDTO).ifPresent(book -> flag = book.getPrice() > 15);
        System.out.println(flag);
    }
}
