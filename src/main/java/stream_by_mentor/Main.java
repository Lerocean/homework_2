package stream_by_mentor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        1) Что будет выведено в результате выполнения стрима:
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });


        List<String> strings = Arrays.asList("A", "B", "C", "D");
        long count = strings.stream().peek(System.out::println).count();
        System.out.println(count);

        System.out.println("--------------------------------------------");

        testUsersStream();

    }

    private static void testUsersStream() {
        List<User> users = Arrays.asList(
                new User("Name_1", 10),
                new User("Name_2", 20),
                new User("Name_3", 30)
        );

        Stream<User> userStream = users.stream()
                .filter(TestStream::checkUserAge);

        doSmth(userStream);

        List<String> userNames = userStream
                .map(User::getName)
                .toList();

        userNames.forEach(System.out::println);
    }

    private static boolean doSmth(Stream<User> userStream) {
        return userStream.anyMatch(user -> user.getName().startsWith("N"));
    }

}