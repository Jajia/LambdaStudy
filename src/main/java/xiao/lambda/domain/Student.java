package xiao.lambda.domain;

import java.util.List;

public class Student {
    private String name = "sean";
    private int age = 15;
    private List<Book> books;
    private Teacher teacher;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", books=" + books +
                ", teacher=" + teacher +
                '}';
    }

    public static int compareByAge(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }

    public static int compareByName(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }

    public int compareByAge2(Student s1) {
        return this.getAge() - s1.getAge();
    }
}
