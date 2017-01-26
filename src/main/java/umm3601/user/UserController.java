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

    // Get a single user
    public User getUser(String id) {
        return Arrays.stream(users).filter(x -> x._id.equals(id)).findFirst().orElse(null);
    }
    
}
