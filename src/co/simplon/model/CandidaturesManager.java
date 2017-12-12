package co.simplon.model;

import java.util.ArrayList;
import java.util.List;

public class CandidaturesManager {

	private final static CandidaturesManager INSTANCE = new CandidaturesManager();
	private List<Client> candidatures = new ArrayList<Client>();
	
	private CandidaturesManager() {
	}

	public List<Client> getCandidatures() {
		return candidatures;
	}

	public void setCandidatures(List<Client> candidatures) {
		this.candidatures = candidatures;
	}

	public static CandidaturesManager getInstance() {
		return INSTANCE;
	}
	
	public void addClient(Client clientInfo) {
		candidatures.add(clientInfo);
	}
}
