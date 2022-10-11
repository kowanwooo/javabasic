package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(7100);
		byte[] data = new byte[256];

		DatagramPacket packet = new DatagramPacket(data, data.length);
		System.out.println("UDP 받을 준비중...");
		socket.receive(packet);
		System.out.println(new String(data));
	}
}
