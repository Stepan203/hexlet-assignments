package exercise;

import lombok.Value;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

// BEGIN
@Data
@NoArgsConstructor
@AllArgsConstructor
// END
class User {
    int id;
    String firstName;
    String lastName;
    int age;
}
