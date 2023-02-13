package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

// BEGIN
class App {
    public static String getForwardedVariables(String fileName) {

        String[] resultList = Arrays.stream(fileName.split("\n"))
                .filter(x -> x.startsWith("environment"))
                .map(x -> x.replaceAll("environment=", ""))
                .map(x -> x.replaceAll("\"", ""))
                .flatMap(x -> Arrays.stream(x.split(",")))
                .filter(x -> x.startsWith("X_FORWARDED_"))
                .map(x -> x.replaceAll("X_FORWARDED_", ""))
                .toArray(String[]::new);
        String result = "";
        System.out.println(Arrays.toString(resultList));
        result = String.join(",", resultList);
        return result;
    }
}
//END
