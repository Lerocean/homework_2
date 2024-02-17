package stream;

class CourseImpl implements Course {
    private final String name;

    public CourseImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

