package exercise;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emailsList) {
        List<String> domenFree = Arrays.asList("gmail.com", "yandex.ru", "hotmail.com");
        List<String> allList = Arrays.asList();
        long result = emailsList.stream()
                .distinct()
                .filter(s -> s.contains("@gmail.com") || s.contains("@yandex.ru") || s.contains("@hotmail.com"))
                .count();
        return (int)result;
    }
}
// END
