package com.devfun.settingweb_boot.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.devfun.settingweb_boot.dto.StatisticDto;

public interface StatisticMapper {
	public HashMap<String, Object> selectYearLogin(String year);
	public HashMap<String, Object> selectMonthLogin(String yearMonth);
    public HashMap<String, Object> selectDateLogin(String date);
    public HashMap<String, Object> selectAvgDateLogin(String yearMonth);
    public HashMap<String, Object> selectDeptMonthLogin(String yearMonth,String dept);
    public HashMap<String, Object> selectNonPhLogin(String yearMonth);
    public HashMap<String, Object> selectWriteCnt(String yearMonth,String userId);
    public ArrayList<HashMap<String, Object>> selectAllWriteCnt(String yearMonth);
}
