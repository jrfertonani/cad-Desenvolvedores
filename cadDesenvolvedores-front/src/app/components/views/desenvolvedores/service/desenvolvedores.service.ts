import { Injectable, inject } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { desenvolvedores } from '../desenvolvedores.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DesenvolvedoresService {

  http = inject(HttpClient);

  API = "http://localhost:3001/desenvolvedores"


  constructor() { }


  findAll(): Observable<desenvolvedores[]>{
    return this.http.get<desenvolvedores[]>(this.API);
  }

}
