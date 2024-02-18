package com.hexaware.cricketteammanagement.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricketteammanagement.dto.PlayerDTO;
import com.hexaware.cricketteammanagement.entity.Player;
import com.hexaware.cricketteammanagement.exceptions.PlayerNotFoundException;
import com.hexaware.cricketteammanagement.repository.PlayerRepository;


@Service
public class PlayerServiceImp implements IPlayerService{

	@Autowired
	PlayerRepository repo;
	
	Logger logger=LoggerFactory.getLogger(PlayerServiceImp.class);
	
	
	@Override
	public Player addPlayer(PlayerDTO playerDto) {
		Player player=new Player(playerDto.getPlayerId(),playerDto.getPlayerName(),
				playerDto.getJerseyNumber(),playerDto.getRole(),
				playerDto.getTotalMatches(),playerDto.getTeamName(),
				playerDto.getCountry(),playerDto.getDescription());

		logger.info("Player with id:{} added successfully",player.getPlayerId());
		return repo.save(player);
	}

	@Override
	public List<Player> getAllPlayers() {
		logger.info("All player details fetched");
		return repo.findAll();
	}

	@Override
	public Player getPlayerById(int playerId) throws PlayerNotFoundException {

		Player player=repo.findById(playerId).orElse(null);
		if(player==null) {
			throw new PlayerNotFoundException("Player with id "+playerId+" does not exist");
		}else {
			logger.info("Player with id:{} fetched successfully",playerId);
			return player;
		}
		
		
	}


	@Override
	public boolean deletePlayerById(int playerId) throws PlayerNotFoundException {
		repo.findById(playerId).
				orElseThrow(()-> new PlayerNotFoundException("Player with id "+playerId+" does not exist"));
		
			repo.deleteById(playerId);
			logger.warn("Player with id:{} deleted successfully",playerId);
			return repo.findById(playerId).orElse(null)==null;
		
	}

	@Override
	public Player updatePlayer(PlayerDTO playerDto) throws PlayerNotFoundException {
		repo.findById(playerDto.getPlayerId()).
		orElseThrow(()-> new PlayerNotFoundException("Player with id "+playerDto.getPlayerId()+" does not exist"));

		Player player=new Player(playerDto.getPlayerId(),playerDto.getPlayerName(),
				playerDto.getJerseyNumber(),playerDto.getRole(),
				playerDto.getTotalMatches(),playerDto.getTeamName(),
				playerDto.getCountry(),playerDto.getDescription());
		
		logger.info("Player with id:{} updated successfully",player.getPlayerId());
		return repo.save(player);
	}

	@Override
	public List<Player> getPlayerByRoleMaxMatches() {
		
		return repo.getPlayerByRoleMaxMatches();
	}

}
