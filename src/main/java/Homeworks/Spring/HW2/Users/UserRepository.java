package Homeworks.Spring.HW2.Users;

import java.util.List;

public interface UserRepository {
    void save(User user) ;
    User findById(int id) ;
    List<User> findAll() ;
   void delete(User user);
}
