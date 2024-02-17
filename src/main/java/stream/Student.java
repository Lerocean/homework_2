package stream;

import java.util.List;
import java.util.Objects;

interface Student {
    String name();

    List<Course> getAllCourses();

    void addCourse(Course course);
}
