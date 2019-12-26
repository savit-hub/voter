package beans;

import java.util.List;

import dao.CandidatesDaoImpl;
import pojo.CandidatesPojo;

public class CandidateBean {

	private CandidatesDaoImpl dao;
	private int cid;
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public List<CandidatesPojo> showMax2() throws Exception
	{
		return dao.showmax2();
	}


	public CandidateBean() throws Exception {
	this.dao=new CandidatesDaoImpl();
	}
	
	
	public List<CandidatesPojo> AllCandidate() throws Exception
	{
        return dao.getCandidates();	
	}
	
	public void addVotes() throws Exception
	{
		dao.addvotes(cid);
	}
	
}
