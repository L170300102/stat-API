package com.devfun.settingweb_boot.dto;

import java.util.List;

import org.springframework.stereotype.Repository;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class StatisticDto {

	private String requestID;
	private String requestCode;
	private String userID;
	private String createDate;
	private List<StatisticDto> list;
	public String getRequestID() {
		return requestID;
	}
	public String getRequestCode() {
		return requestCode;
	}
	public String getUserID() {
		return userID;
	}
	public String getCreateDate() {
		return createDate;
	}
	public List<StatisticDto> getList() {
		return list;
	}
}
