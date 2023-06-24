package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.File;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

// BEGIN
class App {
    public static void save(Path path, Car car) {
        String json = car.serialize();
        try {
            Files.write(path, json.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Car extract(Path path) {
        try {
            String json = Files.readString(path);
            return Car.unserialize(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
// END
