package stream;

class CourseImpl implements Course {
    private final String name;

    @Override
    public String toString() {
        return name;
    }

    public CourseImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

