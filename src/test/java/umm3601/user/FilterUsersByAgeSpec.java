package umm3601.user;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class FilterUsersByAgeSpec {

    @Test
    public void filterUsersByAge() throws IOException {
        UserController userController = new UserController();
        User[] allUsers = userController.listUsers(new HashMap<>());
        User[] age27Users = userController.filterUsersByAge(allUsers, 27);
        assertEquals("Incorrect number of users with age 27", 3, age27Users.length);
        User[] age33Users = userController.filterUsersByAge(allUsers, 33);
        assertEquals("Incorrect number of users with age 33", 1, age33Users.length);
    }

    @Test
    public void listUsersWithAgeFilter() throws IOException {
        UserController userController = new UserController();
        Map<String, String[]> queryParams = new HashMap<>();
        queryParams.put("age", new String[] {"27"});
        User[] age27Users = userController.listUsers(queryParams);
        assertEquals("Incorrect number of users with age 27", 3, age27Users.length);
        queryParams.put("age", new String[] {"33"});
        User[] age33Users = userController.listUsers(queryParams);
        assertEquals("Incorrect number of users with age 33", 1, age33Users.length);
    }
}
