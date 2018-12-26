package com.ibm.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	public void executeQuery(String tab_name,String column_name,String name_p) throws SQLException
	{
		
Connection c=DriverManager.getConnection("jdbc:mysql://foodsonfinger.com:3306/foodsonfinger_atozgroceries","foodsonfinger_atoz","welcome@123");
Statement s=c.createStatement();

ResultSet rs=s.executeQuery("SELECT * FROM "+tab_name+" WHERE "+column_name+"='"+name_p+"'");
if(rs.next())
{
	String p_id =rs.getString("product_id");
	String mdl=rs.getString("model");
	String nm=rs.getString(column_name);
	System.out.println(p_id+" "+mdl+" "+nm);
}
else
{
	System.out.println("Product has been deleted");
}


	}
}
