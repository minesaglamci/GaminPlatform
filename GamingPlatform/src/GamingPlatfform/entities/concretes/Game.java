package GamingPlatfform.entities.concretes;

import java.time.LocalDate;
import java.util.ArrayList;

import GamingPlatfform.entities.abstracts.Entity;

public class Game implements Entity{
	private int id;
	private String name;
	private String description;
	private String[] images;
	private double gamePrice;
	private int releaseYear;
	private int gameScore;
	private Campaign campaign;
	private ArrayList<Gamer> gamers;
	
	public Game() {
		super();
	}

	public Game(int id, String name, String description, String[] images, double gamePrice, int i,
			int gameScore, Campaign campaign) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.images = images;
		this.gamePrice = gamePrice;
		this.releaseYear = i;
		this.gameScore = gameScore;
		this.campaign = campaign;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getGameScore() {
		return gameScore;
	}

	public void setGameScore(int gameScore) {
		this.gameScore = gameScore;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public ArrayList<Gamer> getGamers() {
		return gamers;
	}

	public void setGamers(ArrayList<Gamer> gamers) {
		this.gamers = gamers;
	}
	
	

}
