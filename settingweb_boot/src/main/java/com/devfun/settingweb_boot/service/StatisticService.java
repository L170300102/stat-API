package com.devfun.settingweb_boot.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.devfun.settingweb_boot.dto.StatisticDto;

public interface StatisticService {
	public HashMap<String,Object> yearloginNum (String year);
    public HashMap<String,Object> yearMonthloginNum (String yearMonth);
    public HashMap<String,Object> dateloginNum (String date);
    public HashMap<String,Object> DeptMonthloginNum (String yearMonth,String dpet);
    public HashMap<String,Object> AvgMonthloginNum (String yearMonth);
    public HashMap<String, Object> NonPhLogin(String yearMonth);
    public HashMap<String, Object> WirteCnt(String yearMonth,String userId);
    public ArrayList<HashMap<String, Object>> AllWirteCnt(String yearMonth);
}