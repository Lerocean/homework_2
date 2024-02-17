package stream;

import java.util.ArrayList;
import java.util.List;

class StudentImpl implements Student {
    private final String name;
    private final List<Course> courses;

    public StudentImpl(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }
}


