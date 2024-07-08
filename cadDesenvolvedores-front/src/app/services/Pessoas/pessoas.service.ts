import { Injectable, inject } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Pessoa } from './pessoas.model';

@Injectable({
  providedIn: 'root'
})
export class PessoasService {

  http = inject(HttpClient);

  URL = 'http://localhost:8080/pessoas';

  constructor() { }


  showMessage(arg0: string) {
    throw new Error('Method not implemented.');
  }

  create(pessoa: Pessoa): Observable<Pessoa>{
    return this.http.post<Pessoa>(this.URL, pessoa);
  }

  finsAll(): Observable<Pessoa[]>{
    return this.http.get<Pessoa[]>(this.URL);
  }

  findById(id: string): Observable<Pessoa>{
    const url = `${this.URL}/${id}`
    return this.http.get<Pessoa>(url);
  }

  update(pessoa: Pessoa): Observable<Pessoa>{
    const url = `${this.URL}/${pessoa.id}`
    return this.http.put<Pessoa>(url,pessoa)
  }

  delete(id: number): Observable<Pessoa>{
    const url = `${this.URL}/${id}`
    return this.http.delete<Pessoa>(url);
  }



}
