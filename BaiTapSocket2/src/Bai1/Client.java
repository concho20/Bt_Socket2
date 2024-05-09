package Bai1;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            System.out.println("Connected to server.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String number;
            while ((number = in.readLine()) != null) {
                System.out.println("Received number: " + number);
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
