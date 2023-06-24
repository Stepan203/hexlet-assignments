package exercise;

import lombok.Value;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import java.io.StringWriter;
import java.io.StringReader;
//import lombok.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
@Getter
@Setter
@RequiredArgsConstructor
//@JsonAutoDetect
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public static String serialize() {
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        String json = mapper.writeValueAsString(Car.class);

        //mapper.writeValue(writer, );
        //String result = writer.toString();
        return json;
    }
    public static Car unserialize(String str) {
        String jsonString = str;
        StringReader reader = new StringReader(jsonString);
        ObjectMapper mapper = new ObjectMapper();
        Car car = mapper.readValue(reader, Car.class);
        return car;
    }
    // END
}
