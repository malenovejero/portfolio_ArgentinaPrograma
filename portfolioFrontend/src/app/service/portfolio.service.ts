import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PortfolioService {
  url:string='http://localhost:8080/see/about/2';
  url2:string="http://localhost:8080/see/experience";
  url3:string="http://localhost:8080/see/education";
  url4:string="http://localhost:8080/see/skills";
  url5:string="http://localhost:8080/see/projects";



  constructor(private http:HttpClient) { }

  obtenerDatos():Observable<any>{
    return this.http.get<any>(this.url);
  }

  obtenerDatosExp():Observable<any>{
    return this.http.get<any>(this.url2);
  }

  obtenerDatosSkills():Observable<any>{
    return this.http.get<any>(this.url4);
  }

  obtenerExp(id:any):Observable<any>{
    return this.http.get<any>(this.url2 + "/" + id);
  }

  obtenerDatosEd():Observable<any>{
    return this.http.get<any>(this.url3);
  }

  obtenerDatosSki():Observable<any>{
    return this.http.get<any>(this.url4);
  }

  obtenerDatosPro():Observable<any>{
    return this.http.get<any>(this.url5);
  }

  save(value:any):void{
    this.http.put<any>('http://localhost:8080/about/save/2', value).subscribe();
  }

  saveExp(value:any, id:any):void {
    if (id) {
      this.http.put<any>('http://localhost:8080/experience/save/' + id, value).subscribe();
    } else {
      this.http.post<any>('http://localhost:8080/experience/save', value).subscribe();
    }
  }

  deleteExp(id:any): void{
    this.http.delete<any>('http://localhost:8080/experience/delete/' + id).subscribe();
  }
}
