import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student this, Student that) {
        if ((this.name.length()) > (that.name.length()))
            return 1;
        else
            return -1;

    }

}

public class sortingLec03 {
    // integer implement comparable by default thats why we can compare
    // automatically. but the other type cannot because ot the implemetation . so
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "rahman"));
        studs.add(new Student(37, "aman"));
        studs.add(new Student(78, "farman"));
        studs.add(new Student(13, "arman"));
        Collections.sort(studs);
        for (Student s : studs) {
            System.out.println(s);
        }

    }

}
