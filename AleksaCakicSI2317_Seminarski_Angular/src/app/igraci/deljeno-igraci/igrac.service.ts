import { Injectable } from '@angular/core';
import { Igraci } from '../deljeno-igraci/igraci';
import { Http, Response, Headers, RequestOptions, RequestMethod } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';

@Injectable({
  providedIn: 'root'
})
export class IgracService {
OdabraniIgraci : Igraci;
ListaIgraca : Igraci[];
  constructor(public http : Http) { }

  Postigraci(igrac : Igraci) {
    var body = JSON.stringify(igrac);
    var headerpotion = new Headers({ "Content-Type" : "application/json" });
    var requestoption = new RequestOptions({ method : RequestMethod.Post, headers: headerpotion });
     return this.http.post('https://localhost:44309/api/igracis/napravi', body, requestoption).map(x => x.json());
    //return this.http.post('http://localhost:8080/api/igracis/napravi', body, requestoption).map(x => x.json());
  }
  8080
  Putigraci(id, igrac) {
    var body = JSON.stringify(igrac);
    var headerpotion = new Headers({ "Content-Type" : "application/json" });
    var requestoption = new RequestOptions({ method : RequestMethod.Put, headers: headerpotion });
    return this.http.put('https://localhost:44309/api/igracis' + id, body, requestoption).map(x => x.json());
    //return this.http.put('http://localhost:8080/api/igracis/' + id, body, requestoption).map(x => x.json());
  }

  GetIgraci() {
     this.http.get('https://localhost:44309/api/igracis').map((data : Response) => {
    //this.http.get('http://localhost:8080/api/igracis').map((data : Response) => {
      return data.json() as Igraci[];
    }).toPromise().then(x => {
      this.ListaIgraca = x;
    })
  }

  DeleteIgrac(id : number) {
    return this.http.delete('https://localhost:44309/api/igracis/' + id).map(res => res.json());
    //return this.http.delete('http://localhost:8080/api/igracis/' + id).map(res => res.json());
  }
}
