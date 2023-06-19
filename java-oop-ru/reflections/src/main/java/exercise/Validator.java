package exercise;
import java.util.ArrayList;

import java.lang.reflect.Field;
// BEGIN
class Validator {
    public static ArrayList<String> validate(Address address) {
        ArrayList<String> listNull = new ArrayList<>();
        for (Field field : address.getClass().getDeclaredFields()) {
            NotNull elem = field.getAnnotation(NotNull.class);

            if (elem != null) {
                try {
                    field.setAccessible(true);
                    var value = field.get(address);
                    if (value == null) {
                        listNull.add(field.getName());
                    }
                }
                catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return listNull;
    }
}
// END
