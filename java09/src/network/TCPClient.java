package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 100; i++) {
			Socket socket = new Socket("localhost", 6666);
			System.out.println("클라이언트가 접속함.>>" + i);
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = buffer.readLine();
			System.out.println(data);
		}
	}
}
