package dao;

import java.util.List;

import pojo.CandidatesPojo;
import pojo.VotersPojo;

public interface ICandidatesDao {
	
	List<CandidatesPojo> getCandidates() throws Exception;

}
