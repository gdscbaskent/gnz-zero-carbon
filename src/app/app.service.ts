import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})

export class AppService{
    constructor(private http:HttpClient){
    }

    sendActivity(formData:any):any{
        return this.http.get<any>(`http://10.7.28.212:8080/api/carbonfootprint/calculate?activityName=${formData.value.selection}&amount=${formData.value.quantity}`)
      };

      getCompensations(emission:any){
        return this.http.get<any>(`http://10.7.28.212:8080/api/carbonfootprint/suggestCompensations?totalEmissions=${emission}`)
      }
    }
