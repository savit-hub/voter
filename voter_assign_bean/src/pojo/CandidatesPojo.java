package pojo;

public class CandidatesPojo {
	private int id;
	private String name,political_party;
	private  int votes;
	public CandidatesPojo() {
	
	}
	public CandidatesPojo(int id, String name, String political_party, int votes) {
		super();
		this.id = id;
		this.name = name;
		this.political_party = political_party;
		this.votes = votes;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPolitical_party() {
		return political_party;
	}
	public void setPolitical_party(String political_party) {
		this.political_party = political_party;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	@Override
	public String toString() {
		return "CandidatesPojo [id=" + id + ", name=" + name + ", political_party=" + political_party + ", votes="
				+ votes + "]";
	}
	

}
