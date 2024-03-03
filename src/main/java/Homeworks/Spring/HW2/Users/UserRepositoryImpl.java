package Homeworks.Spring.HW2.Users;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    User user = new User();
    private final List<User> users = new ArrayList<>();

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public User findById(int id) {
        for (User user : users)
            if (user.getIdUser() == id) {
                return user;
            }
        return null;
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
