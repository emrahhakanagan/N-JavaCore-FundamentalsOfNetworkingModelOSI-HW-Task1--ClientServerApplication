package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientServer {
    public static void main(String[] args) throws IOException {
        final String host = "127.0.0.1";
        final int port = 8080;

        try (Socket clientSocket = new Socket(host, port);
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ) {
            out.println("Netology");

//            String resp = in.readLine();
//            System.out.println(resp);

      String resp;
      while((resp = in.readLine()) != null) {
          System.out.println(resp);
      }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

