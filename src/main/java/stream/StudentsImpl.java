package stream;

import java.util.ArrayList;
import java.util.List;

class StudentImpl implements Student {
    @Override
    public String toString() {
        return "StudentImpl{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }

    private final String name;
    private final List<Course> courses;

    public StudentImpl(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }
}


