package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket();
		
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		
		String str = "i am a ai programmer";
		byte[] data = str.getBytes();
		
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);
		
		socket.send(packet);
		socket.close();
	}
}
