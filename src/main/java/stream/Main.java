package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import stream.Student;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new StudentImpl("Alice"));
        students.add(new StudentImpl("Bob"));
        students.add(new StudentImpl("Jen"));
        students.add(new StudentImpl("Jack"));
        students.add(new StudentImpl("Fred"));

        // Добавление курсов студентам
        students.get(0).addCourse(new CourseImpl("Math"));
        students.get(0).addCourse(new CourseImpl("Physics"));
        students.get(1).addCourse(new CourseImpl("Physics"));
        students.get(1).addCourse(new CourseImpl("English"));
        students.get(1).addCourse(new CourseImpl("History"));
        students.get(1).addCourse(new CourseImpl("Math"));
        students.get(2).addCourse(new CourseImpl("History"));
        students.get(2).addCourse(new CourseImpl("Physics"));
        students.get(2).addCourse(new CourseImpl("Sport"));
        students.get(3).addCourse(new CourseImpl("Sport"));
        students.get(3).addCourse(new CourseImpl("Biology"));
        students.get(3).addCourse(new CourseImpl("Literature"));
        students.get(3).addCourse(new CourseImpl("English"));
        students.get(3).addCourse(new CourseImpl("History"));
        students.get(4).addCourse(new CourseImpl("Physics"));
        students.get(4).addCourse(new CourseImpl("Biology"));
        students.get(4).addCourse(new CourseImpl("Computer Science"));
        students.get(4).addCourse(new CourseImpl("Sport"));


        List<Course> subscribedCourses = getSubscribedCourses(students);
        System.out.println(subscribedCourses);
    }

    private static List<Course> getSubscribedCourses(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getAllCourses().stream())
                .distinct()
                .collect(Collectors.toList());
    }

}
