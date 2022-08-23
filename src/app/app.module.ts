import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { OrderCreationComponent } from './order-creation/order-creation.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {NgMultiSelectDropDownModule} from 'ng-multiselect-dropdown';
import { HttpClientModule } from '@angular/common/http';
import {SeriesDataService} from './service/data/series-data.service';

@NgModule({
  declarations: [
    AppComponent,
    OrderCreationComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    NgMultiSelectDropDownModule.forRoot(),
    HttpClientModule
  ],
  providers: [SeriesDataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
