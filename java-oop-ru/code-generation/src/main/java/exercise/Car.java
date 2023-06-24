package exercise;

import lombok.Value;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Setter;
import java.io.StringWriter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.io.IOException;
//import lombok.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
@Getter
//@Setter
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            StringWriter writer = new StringWriter();
            return mapper.writeValueAsString(this);

            //mapper.writeValue(writer, );
            //String result = writer.toString();
           // return json;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static Car unserialize(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // String jsonString = str;
            // StringReader reader = new StringReader(jsonString);
            return mapper.readValue(json, Car.class);
            //return car;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // END
}
