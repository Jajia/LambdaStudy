package xiao.lambda.domain;

public class StudentCompare {
    public int compareStudent(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }
}
