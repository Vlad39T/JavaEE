package Homeworks.Spring.HW1;
//книга (название, автор).
public class Book {
    private Integer idBook;
    private String title;
    private String autor;

    public Book() {
    }

    public Book(Integer idBook, String title, String autor) {
        this.idBook = idBook;
        this.title = title;
        this.autor = autor;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }



}
