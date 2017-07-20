package android.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author yanbowen
 *
 * @version Created on: Jul 20, 2017 5:54:39 PM
 *
 * @E-mail: 1743803588@qq.com
 */
public class AndroidService {
	public static void main(String[] args) throws IOException {
		ServerSocket serivce = new ServerSocket(30000);
		while (true) {
			// 等待客户端连接
			Socket socket = serivce.accept();
			new Thread(new AndroidRunable(socket)).start();
		}
	}
}
