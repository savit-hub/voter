package dao;

import pojo.VotersPojo;

public interface IVotersDao {
	VotersPojo verifyvoter(String username,String password) throws Exception;

}
