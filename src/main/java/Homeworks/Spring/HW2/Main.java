package Homeworks.Spring.HW2;

import Homeworks.Spring.HW2.Config.UserConfig;
import Homeworks.Spring.HW2.Users.User;
import Homeworks.Spring.HW2.servise.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        UserService service = context.getBean(UserService.class);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть дію");
        boolean isSelect = true;
        while (isSelect) {
            System.out.println("1 Додати нового користувача.");
            System.out.println("2 Видалити існуючого користувача.");
            System.out.println("3 Перевірити, чи існує такий користувач.");
            System.out.println("4 Показати всіх користувачів.");
            System.out.println("0 Вихід.");


            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> service.addUser(new User(2,"Jack","Jack1011@gmail.com"));
                case 2 -> service.deleteUser(new User());
                case 3 -> {
                    System.out.println("Введіть ID для перевірки:");
                    int check = scanner.nextInt();
                    service.getUser(check);
                }
                case 4 ->   service.getAllUsers();
                case 0 -> {
                    System.out.println("Exit...");
                    isSelect = false;
                }
                default ->  System.out.println("Помилка вводу.");
            }
        }
    }
}
