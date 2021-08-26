package com.devfun.settingweb_boot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.dto.StatisticDto;

@Service
public class StatisticServiceImpl implements StatisticService {

   
   @Autowired
   private StatisticMapper uMapper;
   @Autowired
   SqlSession SqlSession;

   @Override
   public HashMap<String, Object> yearloginNum (String year) {
       HashMap<String, Object> retVal = new HashMap<String,Object>();
       
       try {
           retVal = uMapper.selectYearLogin(year);
           retVal.put("year", year);
           retVal.put("is_success", true);
           
           
       }catch(Exception e) {
           retVal.put("totCnt", -999);
           retVal.put("year", year);
           retVal.put("is_success", false);
       }
       
       return retVal;
   }

   @Override
   public HashMap<String, Object> yearMonthloginNum(String yearMonth) {

	
       HashMap<String, Object> retVal = new HashMap<String,Object>();
    	
       try {
    	
    	   retVal = uMapper.selectMonthLogin(yearMonth);
    	   retVal.put("yearMonth", yearMonth);
    	   retVal.put("is_success", true);
    	
      }catch (Exception e) {
          retVal.put("totCnt", -999);
 	      retVal.put("yearMonth", yearMonth);
       	  retVal.put("is_success", false);
	  }
       
       return retVal;
    
   }
   
   @Override
   public HashMap<String, Object> dateloginNum(String date) {

       HashMap<String, Object> retVal = new HashMap<String,Object>();

   		try {
   			
   		   retVal = uMapper.selectDateLogin(date);
     	   retVal.put("date", date);
     	   retVal.put("is_success", true);
   			
   		}catch (Exception e) {
		 
   		 retVal.put("totCnt", -999);
   	     retVal.put("date", date);
   		 retVal.put("is_success", false);
		}
   	
   	return retVal;
   }
   
   
   

   @Override
   public HashMap<String, Object> DeptMonthloginNum(String yearMonth,String dept) {
	   
	   HashMap<String, Object> retVal = new HashMap<String,Object>();
	   
	   try {
		   
		   retVal = uMapper.selectDeptMonthLogin(yearMonth, dept);
		   retVal.put("yearMonth", yearMonth);
		   retVal.put("dept",dept);
		   retVal.put("is_success", true);
		   
	   }catch (Exception e) {
	       retVal.put("totCnt", -999);
		   retVal.put("yearMonth", yearMonth);
		   retVal.put("dept",dept);
		   retVal.put("is_success", false);
	}
	   
	return retVal;
}

  @Override
  public HashMap<String, Object> AvgMonthloginNum(String yearMonth) {
	  
   HashMap<String, Object> retVal = new HashMap<String,Object>();
	   
	   try {
		   
		   retVal = uMapper.selectAvgDateLogin(yearMonth);
		   retVal.put("yearMonth", yearMonth);
		   retVal.put("is_success", true);
		   
	   }catch (Exception e) {
	       retVal.put("totCnt", -999);
		   retVal.put("yearMonth", yearMonth);
		   retVal.put("is_success", false);
	}
	   
	return retVal;
	    
	
  }


  @Override
  public HashMap<String, Object> NonPhLogin(String yearMonth) {
	  HashMap<String, Object> retVal = new HashMap<String,Object>();
	   
	   try {
		   
		   retVal = uMapper.selectNonPhLogin(yearMonth);
		   retVal.put("yearMonth", yearMonth);
		   retVal.put("is_success", true);
		   
	   }catch (Exception e) {
	       retVal.put("totCnt", -999);
		   retVal.put("yearMonth", yearMonth);
		   retVal.put("is_success", false);
	}
	   
	return retVal;
	 
	  
	  
}

  @Override
  public HashMap<String, Object> WirteCnt(String yearMonth,String userId) {
	  HashMap<String, Object> retVal = new HashMap<String,Object>();	
   try {
		   
		   retVal = uMapper.selectWriteCnt(yearMonth, userId);
		   retVal.put("userID",userId);
		   retVal.put("yearMonth", yearMonth);
		   retVal.put("is_success", true);
		   
	   }catch (Exception e) {
	       retVal.put("totCnt", -999);
		   retVal.put("yearMonth", yearMonth);
		   retVal.put("is_success", false);
	}
	   
	return retVal;
	 
	  
  }

@Override
public ArrayList<HashMap<String, Object>> AllWirteCnt(String yearMonth) {

	 List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
	 HashMap<String, Object> map = new HashMap<String,Object>();

	 try {

		 
		 
		 list=uMapper.selectAllWriteCnt(yearMonth);
		
		 
	   }catch (Exception e) {
		 
		   
		   map.put("totCnt", -999);
		   map.put("yearMonth", yearMonth);
		   map.put("is_success", false);
		   
		   list.add(map);
	}
	 
	 return (ArrayList<HashMap<String, Object>>) list;
	
	 	

}

  
}