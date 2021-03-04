package DAO;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static List<User> userList = new ArrayList<>();

    static {
        userList.add(new User("john", "123456", "john", "john@gamil.com", 18));
        userList.add(new User("james", "123456", "james", "james@gamil.com", 18));
        userList.add(new User("alex", "123456", "alex", "alex@gamil.com", 18));
    }

    public static User checkLogin(Login login) {
        User user = null;
        for (User u : userList) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())) {
                user = u;
            }
        }
        return user;
    }
}
