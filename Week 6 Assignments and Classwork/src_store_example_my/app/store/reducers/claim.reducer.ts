import { createReducer, on } from "@ngrx/store";
import { Claim } from "src/app/models/claim.model";
import { addclaimAction } from "../actions/claim.action";



export interface ClaimState{
    claims:Claim[];
}

export const initialState:ClaimState={
    claims:[ {
        claimid:'abc',
        claimStatus:'Pending',
        claimAmount:10000
    }]
}

export const claimReducer=createReducer(
    initialState,
    on(addclaimAction,(state,{claim})=>({
    ...state,
    claims:[...state.claims,claim]
        }))
)
