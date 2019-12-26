package beans;

import dao.IvotersDaoImpl;
import pojo.VotersPojo;

public class VoterBean {
	
	private String email,password;
	private VotersPojo voterDetails;
	private IvotersDaoImpl dao;
	private String message;
	
	public VoterBean() throws Exception 
	{
	this.dao=new IvotersDaoImpl();
	}
	
	
	
public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public VotersPojo getVoterDetails() {
		return voterDetails;
	}



	public void setVoterDetails(VotersPojo voterDetails) {
		this.voterDetails = voterDetails;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getVoterDetails() {
//		return voterDetails;
//	}
//	public String getMessage() {
//		return message;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
	public void changeStatus() throws Exception
	{
		voterDetails=dao.verifyvoter(email, password);
        dao.changestatus(voterDetails.getId());		
	}
	
	public String statusType() throws Exception
	{
		voterDetails=dao.verifyvoter(email, password);
		if(voterDetails!=null)
    	{
    		if(voterDetails.getRole().equals("voter"))
    		{
    			if(voterDetails.getStatus().equals("avl"))
    			{
    			return "thankyou you for voting will meet you in  2024";	
    			}
    			else
    			{
    				return "you have already voted meet you in  2024";
    			}
    		}
    	}
		return null;
	}
	
    public String authenticate() throws Exception
    {
    	System.out.println("in authenticate "+email+" "+password);
    	
    	voterDetails=dao.verifyvoter(email, password);
    	if(voterDetails!=null)
    	{
    		if(voterDetails.getRole().equals("voter"))
    		{
    			if(voterDetails.getStatus().equals("avl"))
    			{
    				message="welcome to 2019 voting";
    				return "candidates";
    			}
    			else
    			{
    				message="welcome to status page";
    				return "status";
    			}
    		}
    		else
    		{
    			message="hie welcome to admin page ";
    			return "admin";
    		}
    		
    	}
    	else
    	{
    		message="invalid login please try again later";
    		return "login";
    	}
    }

}
