package stream;

import java.util.List;

public interface Student {
    String name();
    List<Course> getAllCourses();
    void addCourse(Course course);
}