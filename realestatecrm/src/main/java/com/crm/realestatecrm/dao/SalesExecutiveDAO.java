package com.crm.realestatecrm.dao;

import java.util.List;

import com.crm.realestatecrm.entity.LeaderBoard;
import com.crm.realestatecrm.entity.SalesExecutive;

public interface SalesExecutiveDAO {
	boolean save(SalesExecutive salesExecutive);
	
	List<SalesExecutive> getAllSalesExecutives(String email);
	
	SalesExecutive findSalesExecutiveByEmail(String email);
	
	SalesExecutive findSalesExecutiveById(String id);
	
	int getSalesExecutiveCount(String managerId);
	
	void updateSalesExective(SalesExecutive salesExecutive);
	
	List<LeaderBoard> getLeadboradList(String mail);
}
