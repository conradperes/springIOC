package br.com.jm.spring.ioc.beans;

public class Zip {
	
	private String code;

	public Zip(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Zip [code=" + code + "]";
	}
	
	

}
