import { createAction, props } from "@ngrx/store";
import { Claim } from "src/app/models/claim.model";



export const addclaimAction=createAction(
    '[Claims] Add Claim',
    props<{ claim: Claim }>()
)

