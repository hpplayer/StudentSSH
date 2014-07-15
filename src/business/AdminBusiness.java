package business;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import service.AdminService;

import database.DataSource;

import bean.Admin;

public class AdminBusiness implements AdminService{
	public boolean login(Admin admin) throws Exception{
		// 从数据库中读取数据
		Connection connection=DataSource.getConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from admin where name='"+admin.getName()+"' and password='"+admin.getPassword()+"'");
		if(resultSet.next()){
			return true;
		}
		else {
			return false;
		}
	}

}
