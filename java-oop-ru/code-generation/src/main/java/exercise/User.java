package exercise;

import lombok.Value;
import lombok.Data;
import lombok.NoArgsConstructor;

// BEGIN
@Data
@NoArgsConstructor
// END
class User {
    int id;
    String firstName;
    String lastName;
    int age;
}
