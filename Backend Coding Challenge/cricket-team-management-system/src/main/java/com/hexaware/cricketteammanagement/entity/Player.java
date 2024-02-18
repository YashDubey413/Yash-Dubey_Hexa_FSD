package com.hexaware.cricketteammanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Player {

	@Id
	private int playerId;
	
	@NotBlank(message="Player Name cannot be blank")
	private String playerName;
	
	@Min(1)
	private int jerseyNumber;
	
	@Pattern(regexp = "(Batsman|Bowler|Keeper|All Rounder)", message = "Invalid player role")
	private String role;
	
	@Min(0)
	private int totalMatches;

	@NotBlank(message="Team Name cannot be blank")
	private String teamName;

	@NotBlank(message="Country Name cannot be blank")
	private String country;

	@NotBlank(message="Description cannot be blank")
	private String description;

	

	public Player(int playerId, @NotBlank String playerName, @Min(1) int jerseyNumber,
			@Pattern(regexp = "(Batsman|Bowler|Keeper|All Rounder)", message = "Invalid player role") String role,
			@Min(0) int totalMatches, @NotBlank String teamName, @NotBlank String country,
			@NotBlank String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.country = country;
		this.description = description;
	}

	public Player() {
		super();
	}


	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", role=" + role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", country="
				+ country + ", description=" + description + "]";
	}

}
