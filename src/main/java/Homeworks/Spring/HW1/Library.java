package Homeworks.Spring.HW1;

import java.util.List;

//библиотека (название, город расположения, список авторов, список книг )
public class Library {
    private Integer idLibrary;
    private String name;
    private String city;
    private List<String> autors;
    private List<String> books;

    public Library() {
    }

    public Library(Integer idLibrary, String name, String city, List<String> autors, List<String> books) {
        this.idLibrary = idLibrary;
        this.name = name;
        this.city = city;
        this.autors = autors;
        this.books = books;
    }

    public Integer getIdLibrary() {
        return idLibrary;
    }

    public void setIdLibrary(Integer idLibrary) {
        this.idLibrary = idLibrary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getAutors() {
        return autors;
    }

    public void setAutors(List<String> autors) {
        this.autors = autors;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }



}
