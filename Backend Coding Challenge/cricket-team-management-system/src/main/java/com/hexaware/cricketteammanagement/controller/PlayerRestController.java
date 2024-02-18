package com.hexaware.cricketteammanagement.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cricketteammanagement.dto.PlayerDTO;
import com.hexaware.cricketteammanagement.entity.Player;
import com.hexaware.cricketteammanagement.exceptions.PlayerNotFoundException;
import com.hexaware.cricketteammanagement.service.IPlayerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/players")
public class PlayerRestController {

	@Autowired
	IPlayerService service;
	
	
	Logger logger=LoggerFactory.getLogger(PlayerRestController.class);

	@PostMapping("/add")
	Player addPlayer(@RequestBody @Valid  PlayerDTO playerDto) {
		
		return service.addPlayer(playerDto);		
	}

	
	@GetMapping("/getall")
	List<Player> getAllPlayers(){
		
		return service.getAllPlayers();
	}

	@GetMapping("/getbyid/{playerId}")
	Player getPlayerById(@PathVariable int playerId) throws PlayerNotFoundException {
		
		return service.getPlayerById(playerId);
	}

	
	@DeleteMapping("/delete/{playerId}")
	String deletePlayerById(@PathVariable int playerId) throws PlayerNotFoundException {
		
		boolean isDeleted=service.deletePlayerById(playerId);
		return isDeleted?"Player has been deleted":"Deletion unsuccessful";
	}

	
	@PutMapping("/update")
	Player updatePlayer(@RequestBody @Valid  PlayerDTO playerDto) throws PlayerNotFoundException {
		return service.updatePlayer(playerDto);
	}
	
	
	@GetMapping("/getplayerbyrolemaxmatches")
	public List<Player> getPlayerByRoleMaxMatches(){
		
		return service.getPlayerByRoleMaxMatches();

	}
	
	
	
	
	
	
	
	
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Player not found")
	@ExceptionHandler(PlayerNotFoundException.class)
	public void exceptionHandler() {
		
	}
	
	
	

}
