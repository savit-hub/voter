package dao;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.CandidatesPojo;
import pojo.VotersPojo;
import utils.dbutils;

public class CandidatesDaoImpl implements ICandidatesDao
{
	private Connection connection;
	private PreparedStatement pst1,pst2,pst3;

	public CandidatesDaoImpl() throws Exception {
		this.connection = dbutils.getconnection();
		this.pst1=connection.prepareStatement("select * from candidates");
  this.pst2=connection.prepareStatement("update candidates set votes=votes+1 where id=? ");
	this.pst3=connection.prepareStatement("select * from candidates order by votes desc limit 2");
	
	}
	public void clean() throws Exception
	{
		if(pst1!=null)
		pst1.close();
		if(pst3!=null)
			pst3.close();
		if(pst2!=null)
			pst2.close();
		if(connection!=null)
			connection.close();
	}
	@Override
	public List<CandidatesPojo> getCandidates() throws Exception {
	List<CandidatesPojo> list=new ArrayList<>();
      
		          try(ResultSet rs = this.pst1.executeQuery())
				{
			        while(rs.next())
			        {
			        	list.add(new CandidatesPojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
				
			        }
				}
	
		return list;
	}
	public void addvotes(int cid) throws Exception {
	   pst2.setInt(1, cid);
	   pst2.executeUpdate();
		
	}
	
	public List<CandidatesPojo> showmax2() throws Exception
	{
		List<CandidatesPojo> l=new ArrayList<>();
		try(ResultSet rs = pst3.executeQuery())
		{
			while(rs.next())
			{
			CandidatesPojo  cand=new CandidatesPojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			l.add(cand);
			}
			return l;
		}
		
		
		
	}
	
		
	}
       

