package umm3601.user;

import org.junit.Test;
import umm3601.user.User;
import umm3601.user.UserController;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class FullUserListSpec {

    @Test
    public void totalUserCount() throws IOException {
        UserController userController = new UserController();
        User[] allUsers = userController.listUsers(new HashMap<>());
        assertEquals("Incorrect total number of users", 10, allUsers.length);
    }

    @Test
    public void firstUserInFullList() throws IOException {
        UserController userController = new UserController();
        User[] allUsers = userController.listUsers(new HashMap<>());
        User firstUser = allUsers[0];
        assertEquals("Incorrect name", "Connie Stewart", firstUser.name);
        assertEquals("Incorrect age", 25, firstUser.age);
        assertEquals("Incorrect company", "OHMNET", firstUser.company);
        assertEquals("Incorrect e-mail", "conniestewart@ohmnet.com", firstUser.email);
    }
}
