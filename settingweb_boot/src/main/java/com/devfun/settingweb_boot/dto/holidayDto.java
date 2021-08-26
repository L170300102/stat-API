package com.devfun.settingweb_boot.dto;

import lombok.Data;

@Data
public class holidayDto {
	
   String ServiceKey;
   String solYear;
   String solMonth;
   
	public String getServiceKey() {
		return ServiceKey;
	}
	public String getSolYear() {
		return solYear;
	}
	public String getSolMonth() {
		return solMonth;
	}
	@Data
	static class Item{
		public String locdate;
		public String seq;
		public String dateKind;
		public String isHoliday;
		public String dateName;
	}
}