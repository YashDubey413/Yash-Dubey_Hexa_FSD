import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ReactivepracticeComponent } from './reactivepractice/reactivepractice.component';


@NgModule({
  declarations: [
    AppComponent,
    ReactivepracticeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [ReactivepracticeComponent,AppComponent]
})
export class AppModule { }
