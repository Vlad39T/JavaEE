package Homeworks.Spring.HW2.Users;

public class User {
    Integer idUser;
    String email;
    String name;

    public User() {
    }

    public User(Integer idUser, String email, String name) {
        this.idUser = idUser;
        this.email = email;
        this.name = name;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
