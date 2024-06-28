import { Component, OnInit, inject } from '@angular/core';
import { ActivatedRoute, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { DesenvolvedoresService } from '../service/desenvolvedores.service';
import { desenvolvedores } from '../desenvolvedores.model';

@Component({
  selector: 'app-desenvolvedoreslist',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule
  ],
  templateUrl: './desenvolvedoreslist.component.html',
  styleUrl: './desenvolvedoreslist.component.css'
})
export class DesenvolvedoreslistComponent implements OnInit{

  lista: desenvolvedores[] = [];


  constructor( private Service: DesenvolvedoresService){}

  ngOnInit(): void {
    this.Service.findAll().subscribe(lista => {
      this.lista = lista
      console.log(lista)
    })


  }

  findAll(){
    this.Service.findAll().subscribe({
      next: lista => {
        this.lista = lista;
      },
      error: _err => {
        alert("Ocorreu algum erro!")
      },
    })
   }

}
