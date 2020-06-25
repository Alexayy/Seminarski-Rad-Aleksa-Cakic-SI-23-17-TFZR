import { Injectable } from '@angular/core';
import { Timovi } from '../deljeno-timovi/timovi';
import { Http, Response, Headers, RequestOptions, RequestMethod } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';

@Injectable({
  providedIn: 'root'
})
export class TimService {
OdabraniTimovi : Timovi;
ListaTimova : Timovi[];
  constructor(public http : Http) { }

  Posttimovi(tim : Timovi) {
    var body = JSON.stringify(tim);
    var headerpotion = new Headers({ "Content-Type" : "application/json" });
    var requestoption = new RequestOptions({ method : RequestMethod.Post, headers: headerpotion });
    return this.http.post('https://localhost:44309/api/timovis', body, requestoption).map(x => x.json());
  }

  Puttimovi(id, tim) {
    var body = JSON.stringify(tim);
    var headerpotion = new Headers({ "Content-Type" : "application/json" });
    var requestoption = new RequestOptions({ method : RequestMethod.Put, headers: headerpotion });
    return this.http.put('https://localhost:44309/api/timovis/' + id, body, requestoption).map(x => x.json());
  }

  GetTimovi() {
    this.http.get('https://localhost:44309/api/timovis').map((data : Response) => {
      return data.json() as Timovi[];
    }).toPromise().then(x => {
      this.ListaTimova = x;
    })
  }

  DeleteTim(id : number) {
    return this.http.delete('https://localhost:44309/api/timovis/' + id).map(res => res.json());
  }
}
