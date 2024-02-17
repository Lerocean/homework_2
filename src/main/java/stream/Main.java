package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new StudentImpl("Alice"));
        students.add(new StudentImpl("Bob"));
        students.add(new StudentImpl("Jen"));
        students.add(new StudentImpl("Jack"));
        students.add(new StudentImpl("Fred"));

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

        List<String> subscribedCourses = getSubscribedCourses(students);
        System.out.println(subscribedCourses);

        List<Student> mostCuriousStudents = getMostCuriousStudents(students);
        System.out.println(mostCuriousStudents);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the subject: ");
        String subjectName = scanner.nextLine();
        Course course = new CourseImpl(subjectName);

        printStudentsByCourse(students, course);
    }

    private static List<String> getSubscribedCourses(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getAllCourses().stream())
                .map(Course::getName)
                .distinct()
                .collect(Collectors.toList());
    }
    private static List<Student> getMostCuriousStudents(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparingInt((Student student

                ) -> student.getAllCourses().size()).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    private static void printStudentsByCourse(List<Student> students, Course course) {
        List<Student> studentsByCourse = students.stream()
                .filter(student -> student.getAllCourses().stream()
                        .anyMatch(c -> c.getName().equals(course.getName())))
                .toList();

        for (Student student : studentsByCourse) {
            System.out.println(student.name());
        }
    }
}
