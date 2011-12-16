package com.net;


import java.io.IOException;
import java.io.InputStream;

public class Execute {
	private InputStream ins;
	private byte[] buffer;
	
	public InputStream getIns() {
		return ins;
	}

	public void setIns(InputStream ins) {
		this.ins = ins;
	}

	public byte[] getBuffer() {
		return buffer;
	}

	public void setBuffer(byte[] buffer) {
		this.buffer = buffer;
	}
	
	public Execute() throws IOException
	{
		ins = Connect.getInstance().getSocket().getInputStream();
		ins.read(buffer);
	}
}
