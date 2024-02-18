package com.hexaware.cricketteammanagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.hexaware.cricketteammanagement.entity.Player;



@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{

	@Query(value="select * from player where role=(select role from player group by role"
			+ " order by sum(total_matches) desc limit 1)",nativeQuery=true)
	List<Player> getPlayerByRoleMaxMatches(); 
	
}
