package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for(Map <String, String> book: books) {
            Integer num = 0;
            for (Map.Entry<String, String> item : where.entrySet()) {
              //  System.out.println("Item " + item);
              //  System.out.println("Book " + book);
                if (book.containsKey(item.getKey()) & (book.containsValue(item.getValue()))) {
                    num = num + 1;
                }
            }
         //   System.out.println(num);
                if (num == where.size()) {
                    result.add(book);
                  //  System.out.println("Result " + result);
                }
        }
        return result;
    }
}
//END
