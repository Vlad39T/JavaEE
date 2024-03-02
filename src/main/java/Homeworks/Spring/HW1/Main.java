package Homeworks.Spring.HW1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("library-context.xml");
        Library library = (Library) context.getBean("library");
        System.out.println("Назва бібліотеки: " + library.getName()+ "\nМісто: "+ library.getCity()+"\nАвтори: "+
                library.getAutors()+"\nКниги: "+library.getBooks());
        Autor autor= (Autor) context.getBean("autor");
        Autor autor1= (Autor) context.getBean("autor2");
        Book book = (Book) context.getBean("book");
        Book book1 = (Book) context.getBean("book1");
        Book book2 = (Book) context.getBean("book2");
        Book book3 = (Book) context.getBean("book3");
        System.out.println("-------------Автори----------");
        System.out.println("Ім'я: "+autor.getName()+"\nПрізвище: "+autor.getSurname()+"\nКниги: "+autor.getBooks());
        System.out.println("------------------------------");
        System.out.println("Ім'я: "+autor1.getName()+"\nПрізвище: "+autor1.getSurname()+"\nКниги: "+autor1.getBooks());
        System.out.println("---------------------Книги--------------------");
        System.out.println("Автор: "+book.getAutor()+"\nКнига: "+book.getTitle());
        System.out.println("-------------------------------");
        System.out.println("Автор: "+book1.getAutor()+"\nКнига: "+book1.getTitle());
        System.out.println("-------------------------------");
        System.out.println("Автор: "+book2.getAutor()+"\nКнига: "+book2.getTitle());
        System.out.println("-------------------------------");
        System.out.println("Автор: "+book3.getAutor()+"\nКнига: "+book3.getTitle());

    }
}
