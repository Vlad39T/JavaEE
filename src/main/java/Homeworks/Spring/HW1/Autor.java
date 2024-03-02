package Homeworks.Spring.HW1;

import java.util.List;

//автор
//(имя, фамилия, список книг),
public class Autor {
    private Integer idAutor;
    private String name;
    private String surname;
    private List<String> books;

    public Autor() {
    }

    public Autor(Integer idAutor, String name, String surname, List<String> books) {
        this.idAutor = idAutor;
        this.name = name;
        this.surname = surname;
        this.books = books;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }


}