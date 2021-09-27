package com.en.core.exeptions;

import java.io.Serializable;

public class StandartError implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long timestamp;
	private Integer status;
	private String systemMessage;
	private String userMessage;

	public StandartError() {
		super();
	}

	public StandartError(Long timestamp, Integer status, String systemMessage, String userMessage) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.systemMessage = systemMessage;
		this.userMessage = userMessage;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSystemMessage() {
		return systemMessage;
	}

	public void setMsg(String systemMessage) {
		this.systemMessage = systemMessage;
	}

	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}

}
