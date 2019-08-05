package com.autonomo.smartcar.model;

public enum Status {
	
	PARADO("Parado"),
	MOVIMENTO("Em Movimento"),
	GARAGEM("Garagem"),
	QUEBRADO("Quebrado");
	
	private String desc;
	
	private Status(String desc) {
		this.setDesc(desc);
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
