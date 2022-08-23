import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SeriesDataService {

  constructor(
    private http:HttpClient
  ) { }

  public getSeriesNames(){
    return this.http.get("http://localhost:8081/s/series");
  }
  
  public getModelsForSelectedSeries(value){
    return this.http.get("http://localhost:8081/s/model/"+value)
  }

  public getAccessoryForSelectedModels(event){
       return this.http.get("http://localhost:8084/a/access/"+event);
  }

  public getColorsForSelectedModels(event){
    return this.http.get("http://localhost:8083/c/col/"+event);
  }

}
