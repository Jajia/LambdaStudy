package xiao.lambda.functionalinterface;

import xiao.lambda.domain.Student;
import xiao.lambda.domain.StudentCompare;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        Student student1 = new Student("xiao", 22);
        Student student2 = new Student("he", 23);
        Student student3 = new Student("pan", 24);
        List<Student> students = Arrays.asList(student1, student2, student3);
        // students.sort((Student s1, Student s2) -> s1.getAge() - s2.getAge());
        // students.sort(Student::compareByAge);
        System.out.println(students);
        StudentCompare studentCompare = new StudentCompare();
        students.sort(studentCompare::compareStudent);
    }
}
