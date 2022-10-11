package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

   public static void main(String[] args) throws Exception{
      ServerSocket server = new ServerSocket(6666);
      System.out.println("서버소켓 시작됨");
      System.out.println("클라이언트의 요청을 기다리는 중..");
      
      int count = 0;
      while (true) {
         Socket socket = server.accept();
         count++;
         System.out.println("클라이언트 연결됨");
         
         PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
         out.print("i am java programmer");
         out.close();
         socket.close();
      }
   }
}