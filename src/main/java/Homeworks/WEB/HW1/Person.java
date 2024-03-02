package Homeworks.WEB.HW1;

public class Person {
    private String lastname;
    private String name;
    private String patronymic;
    private String tel;
    private String email;
    private String old;

    public Person() {
    }

    public Person(String lastname, String name, String patronymic, String tel, String email, String old) {
        this.lastname = lastname;
        this.name = name;
        this.patronymic = patronymic;
        this.tel = tel;
        this.email = email;
        this.old = old;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }
}
