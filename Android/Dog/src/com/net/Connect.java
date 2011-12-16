package com.net;


import java.net.Socket;

public class Connect {
	private static Connect conn = null;
	private String ip = "192.168.1.12";
	private int port = 2589;
	
	public static Connect getInstance()
	{
		if (conn==null)
		{
			conn = new Connect();
		}
		return conn;
	}
	
	public Socket getSocket()
	{
		Socket socket = null;
		try {
			 socket = new Socket(ip, port);
		} catch (Exception e) {
		}
		return socket;
	}

}
