package xiao.lambda.functionalinterface;

import xiao.lambda.domain.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
    public static void main(String[] args) {
        Student student1 = new Student("xiao", 22);
        Student student2 = new Student("he", 23);
        Student student3 = new Student("pan", 24);
        List<Student> students = Arrays.asList(student1, student2, student3);
        // students.sort((Student s1, Student s2) -> s1.getAge() - s2.getAge());
        // students.sort(Student::compareByAge);
        // StudentCompare studentCompare = new StudentCompare();
        // students.sort(studentCompare::compareStudent);
        students.sort(Student::compareByAge2);
        System.out.println(students);
        List<String> list = Arrays.asList("a", "b", "c");
        List<Student> students2 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(students2);

    }
}
