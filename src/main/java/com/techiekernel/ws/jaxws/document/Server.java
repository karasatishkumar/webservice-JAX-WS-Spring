package com.techiekernel.ws.jaxws.document;

public class Server {
	private String name;
	private String ip;
	private String mac;
	private String os;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	@Override
	public String toString() {
		return "Server [name=" + name + ", ip=" + ip + ", mac=" + mac + ", os="
				+ os + ", toString()=" + super.toString() + "]";
	}
}
