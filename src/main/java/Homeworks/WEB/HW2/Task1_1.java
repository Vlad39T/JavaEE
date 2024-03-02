package Homeworks.WEB.HW2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.time.LocalDateTime;


public class Task1_1 {
    public static void main(String[] args) {
        try (Socket socket = new Socket(InetAddress.getLocalHost(), Task1.port)) {
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader clientReader = new BufferedReader(new InputStreamReader(System.in));


            String userInput;

            while (true){
                userInput = clientReader.readLine();
                writer.println("О "+ LocalDateTime.now() +" від "+socket.getLocalAddress()+" отримано рядок: "+userInput);
                System.out.println(reader.readLine());
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
