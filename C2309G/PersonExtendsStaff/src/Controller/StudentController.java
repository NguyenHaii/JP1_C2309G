package Controller;

import Entity.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StudentController {
    private static List<Student> students;

    public StudentController(List<Student> students) {
        this.students = students;
    }

    public Optional<Student> minStudent() {
        Optional<Student> minStudent = students.stream()
                .min(Comparator.comparing(Student::getAge));
        return minStudent;

    }

    public static List<Student> getByName(String keyword) {
       return students.stream()
               .filter(s->s.getName().toLowerCase().contains(keyword.toLowerCase()))
               .toList();

    }
}
