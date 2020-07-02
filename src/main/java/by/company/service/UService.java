package by.company.service;

import by.company.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UService {

    private List<User> listOfUsers = new ArrayList<>();

    public void add(User user){
        listOfUsers.add(user);
    }

    public User getByLogin(String login) {
        for (User user : listOfUsers) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        throw new noUserException("User not found");
    }

    public User checkRegistration(User user){
        User byLogin = getByLogin(user.getLogin());
        if (byLogin.getPassword().equals(user.getPassword())){
            return byLogin;
        }
        throw new noUserException("Incorrect data");
    }
}
