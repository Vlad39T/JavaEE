package Homeworks.WEB.HW2;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Task1 {
    static final int port = 2357;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            Socket clientSocket = serverSocket.accept();
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String inputLine;
            String outputLine;

            while ((inputLine = reader.readLine()) != null) {
                outputLine = inputLine;
                System.out.println(outputLine);
                Thread.sleep(1000);
                writer.println( "О " + LocalDateTime.now() + " від "+ serverSocket.getLocalPort()  + " отримано рядок: Привіт Клієнт " );
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
