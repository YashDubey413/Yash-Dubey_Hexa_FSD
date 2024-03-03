import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Player } from './Player';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private httpClient:HttpClient) { }

  baseURL="http://localhost:8080/api/players/";

  getPlayerByRoleMaxMatches():Observable<Player[]>{

    return this.httpClient.get<Player[]>(this.baseURL+"getplayerbyrolemaxmatches");

  }
}
