package com.hexaware.cricketteammanagement.service;

import java.util.List;

import com.hexaware.cricketteammanagement.dto.PlayerDTO;
import com.hexaware.cricketteammanagement.entity.Player;
import com.hexaware.cricketteammanagement.exceptions.PlayerNotFoundException;


public interface IPlayerService {

	Player addPlayer(PlayerDTO playerDto);
	
	List<Player> getAllPlayers();
	
	Player getPlayerById(int playerId) throws PlayerNotFoundException;
	
	boolean deletePlayerById(int playerId)throws PlayerNotFoundException;
	
	Player updatePlayer(PlayerDTO playerDto)throws PlayerNotFoundException;
	
	List<Player> getPlayerByRoleMaxMatches(); 
	
}
