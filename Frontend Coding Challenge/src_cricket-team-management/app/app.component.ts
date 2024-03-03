import { Component } from '@angular/core';
import { PlayerService } from './player.service';
import { Player } from './Player';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';
  playersRoleMaxMatchesList:Player[]=[];

  constructor(private playerService: PlayerService){

  }

  getPlayerByRoleMaxMatches(){
    this.playerService.getPlayerByRoleMaxMatches().subscribe((players)=>{this.playersRoleMaxMatchesList=players});
  }



}
