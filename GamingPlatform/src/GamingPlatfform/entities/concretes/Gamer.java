package GamingPlatfform.entities.concretes;

import java.time.LocalDate;
import java.util.ArrayList;

import GamingPlatfform.entities.abstracts.Entity;

public class Gamer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String nationalIdentity;
	private LocalDate dateOfBirth;
	private String nickname;
	private String password;
	private ArrayList<Game> games;
	
	public Gamer() {
		super();
	}

	public Gamer(int id, String firstName, String lastName, String email, String nationalIdentity,
			LocalDate dateOfBirth, String nickname, String password, ArrayList<Game> games) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.nationalIdentity = nationalIdentity;
		this.dateOfBirth = dateOfBirth;
		this.nickname = nickname;
		this.password = password;
		this.games = games;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
	
	

}
