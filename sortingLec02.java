import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

public class sortingLec02 {
    // sorting with string

    public static void main(String[] args) {
        Comparator<Student> Com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;

            }

        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(23, "nabi"));
        studs.add(new Student(38, "arman"));
        studs.add(new Student(51, "ram"));
        studs.add(new Student(19, "shyam"));
        Collections.sort(studs, Com);

        for (Student s : studs) {
            System.out.println(s);
        }
    }
}
