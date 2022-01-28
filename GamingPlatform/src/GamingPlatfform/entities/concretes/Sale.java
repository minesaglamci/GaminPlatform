package GamingPlatfform.entities.concretes;

import java.util.ArrayList;

import GamingPlatfform.entities.abstracts.Entity;

public class Sale implements Entity{
	private int id;
	private ArrayList<Game> game;
	private Gamer gamer;
	private Campaign campaign;
	
	public Sale() {
		super();
	}

	public Sale(int id, ArrayList<Game> game, Gamer gamer, Campaign campaign) {
		super();
		this.id = id;
		this.game = game;
		this.gamer = gamer;
		this.campaign = campaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Game> getGame() {
		return game;
	}

	public void setGame(Entity game1) {
		this.game = (ArrayList<Game>) game1;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	

}
