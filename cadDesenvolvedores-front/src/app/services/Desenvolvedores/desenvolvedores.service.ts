import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Desenvolvedores } from './desenvolvedores.Model';


@Injectable({
  providedIn: 'root'
})
export class DesenvolvedoresService {

  http = inject(HttpClient);

  URL = 'http://localhost:8080/desenvolvedores';

  constructor() { }


  showMessage(arg0: string) {
    throw new Error('Method not implemented.');
  }


  findAll(): Observable<Desenvolvedores[]>{
    return this.http.get<Desenvolvedores[]>(this.URL);
  }

  create(desenvolvedor: Desenvolvedores): Observable<Desenvolvedores>{
    return this.http.post<Desenvolvedores>(this.URL, desenvolvedor)
  }


  update(desenvolvedor: Desenvolvedores): Observable<Desenvolvedores>{
    const url = `${this.URL}/${desenvolvedor.id}`
    return this.http.put<Desenvolvedores>(url,desenvolvedor)
  }

  findById(id: string): Observable<Desenvolvedores>{
    const url = `${this.URL}/${id}`
    return this.http.get<Desenvolvedores>(url);
  }

  delete(id: number): Observable<Desenvolvedores>{
    const url = `${this.URL}/${id}`
    return this.http.delete<Desenvolvedores>(url);
  }






}
