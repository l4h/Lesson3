package GeekBrains.Java2.Lesson3;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class PhoneBook {
    private Map<String, Set> phoneBook = new HashMap<>();

    public void add(String name, String number) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(number);
        } else {
            Set<String> numbers = new HashSet<>();
            numbers.add(number);
            phoneBook.put(name, numbers);
        }
    }

    public Set<String> getContact(String name) {
        return phoneBook.get(name);
    }

}
