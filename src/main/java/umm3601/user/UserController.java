package umm3601.user;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class UserController {

    User[] users;

    public UserController() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("src/main/data/users.json");
        users = gson.fromJson(reader, User[].class);
    }

    // List users
    public User[] listUsers() {
        return users;
    }

    // Filter users by age
    public User[] listUsersByAge(int age) {
        return Arrays.stream(users).filter(x -> x.age == age).toArray(User[]::new);
    }
}
