import java.io.*;
import java.net.*;

public class server {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(3001);
            Socket now = server.accept();

            DataInputStream input = new DataInputStream(now.getInputStream());

            String str = (String) input.readUTF();
            System.out.println("message= " + str);

            server.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}