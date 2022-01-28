package GamingPlatfform.entities.concretes;

import java.time.LocalDate;
import java.util.ArrayList;

import GamingPlatfform.entities.abstracts.Entity;

public class Campaign implements Entity{
	private int id;
	private String name;
	private String description;
	private LocalDate startingTime;
	private LocalDate endingTime;
	private double percentageOfDiscount;
	private ArrayList<Game> games;
	
	public Campaign() {
		super();
	}

	public Campaign(int id, String name, String description, LocalDate startingTime, LocalDate endingTime,
			double percentageOfDiscount, ArrayList<Game> games) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.startingTime = startingTime;
		this.endingTime = endingTime;
		this.percentageOfDiscount = percentageOfDiscount;
		this.games = games;
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

	public LocalDate getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(LocalDate startingTime) {
		this.startingTime = startingTime;
	}

	public LocalDate getEndingTime() {
		return endingTime;
	}

	public void setEndingTime(LocalDate endingTime) {
		this.endingTime = endingTime;
	}

	public double getPercentageOfDiscount() {
		return percentageOfDiscount;
	}

	public void setPercentageOfDiscount(double percentageOfDiscount) {
		this.percentageOfDiscount = percentageOfDiscount;
	}

	public ArrayList<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
	
	
}
