package stream_by_mentor;

public class TestStream {
    static boolean checkUserAge(User user) {
        System.out.println("Current user: " + user.getName());
        return user.getAge() >= 18;
    }
}
