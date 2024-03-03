import { Component } from '@angular/core';
import { Store } from '@ngrx/store';
import { Claim } from 'src/app/models/claim.model';
import { addclaimAction } from 'src/app/store/actions/claim.action';

@Component({
  selector: 'app-claim-list',
  templateUrl: './claim-list.component.html',
  styleUrls: ['./claim-list.component.css']
})
export class ClaimListComponent {

  newClaimAmount !: number;

  claimsList!: Claim[];

  constructor(private store:Store<{claims:{claims:Claim[]}}>) {
    store.select('claims').subscribe((ClaimState:{claims:Claim[]})=>
    {this.claimsList=ClaimState.claims;
    console.log(this.claimsList);
  })
   }

   addClaim(){

    if(this.newClaimAmount === 0) {


        return;
    
    }

     const claim: Claim = {

      claimid: Date.now().toString(),
      claimStatus: 'Pending',
      claimAmount: this.newClaimAmount
     }

     this.store.dispatch(addclaimAction({claim}));
     this.newClaimAmount = 0;

  }

  

}
