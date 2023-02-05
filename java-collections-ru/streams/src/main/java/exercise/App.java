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
        //List<String> dm = emailsList.stream().filter(domenFree::contains).collect(Collectors.toSet());
       // allList.add(emailsList);
       // allList.add(domenFree);
       // long result = emailsList.stream().filter(domenFree::contains).collect(Collectors.toSet());
        //long result = allList.stream().concat(Arrays.stream(emailsList), Arrays.stream(domenFree)).distinct().toArray();
        long result = emailsList.stream()
                .distinct()
               // .anyMatch(domenFree::contains)
                .filter(s -> s.contains("@gmail.com") || s.contains("@yandex.ru") || s.contains("@hotmail.com"))
                .count();
        //System.out.println(total);
        return (int)result;
    }
}
// END
