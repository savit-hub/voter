package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pojo.VotersPojo;
import utils.dbutils;

public class IvotersDaoImpl implements IVotersDao
{
	private Connection connection;
	private PreparedStatement pst1,pst2;

	public IvotersDaoImpl() throws Exception {
		this.connection = dbutils.getconnection();
		this.pst1=connection.prepareStatement("select * from voters where email=? and password=?");
        this.pst2=connection.prepareStatement("update voters set status =? where id=?");
	}
	@Override
	public VotersPojo verifyvoter(String username, String password) throws Exception 
	{
		pst1.setString(1, username);
		pst1.setString(2, password);
		try(ResultSet rs=pst1.executeQuery())
		{
			if(rs.next())
		     return new VotersPojo(rs.getInt(1),rs.getString(2),username,password,rs.getString(5),rs.getString(6));
		}
		return null;
	}
	
	public void clean() throws Exception
	{
		if(pst1!=null)
		pst1.close();
		if(pst2!=null)
			pst2.close();
		if(connection!=null)
			connection.close();
	}
	public void changestatus(int vid) throws Exception {
		pst2.setString(1,"notavl");
		pst2.setInt(2,vid);
		pst2.executeUpdate();
		
	}
       
}
