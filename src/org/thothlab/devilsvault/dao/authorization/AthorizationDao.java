package org.thothlab.devilsvault.dao.authorization;

import java.util.List;

import javax.sql.DataSource;

import org.thothlab.devilsvault.db.model.Authorization;

public interface AthorizationDao {
	
	public void setDataSource(DataSource dataSource);
	
	public List<Authorization> getAllPendingAuthorization(int id);
	
	public List<Authorization> getAllCompleteAuthorization(int id);
	
	public boolean isExist(int internal_userID,int external_userID, String auth_Type);
	
	public Boolean save(int internal_userID,int external_userID, String auth_Type);
	
}