import { Component, inject, Injectable, OnInit, } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Desenvolvedores } from '../../services/Desenvolvedores/desenvolvedores.Model';
import { DesenvolvedoresService } from '../../services/Desenvolvedores/desenvolvedores.service';
import { CurrencyPipe, NgForOf } from '@angular/common';

@Component({
  selector: 'app-desenvolvedores',
  standalone: true,
  imports: [NgForOf, CurrencyPipe],
  templateUrl: './desenvolvedores.component.html',
  styleUrl: './desenvolvedores.component.css'
})

export class DesenvolvedoresComponent implements OnInit{



  constructor(private router: Router, private route: ActivatedRoute, private Service: DesenvolvedoresService){}

    lista: Desenvolvedores[] = [];

    ngOnInit(): void {
      this.Service.findAll().subscribe(lista => {
        this.lista = this.lista;
        console.log(lista)
      })
    }



      //TABELA  Pageable -----
      sliceProducts(currentPage: number, itemsPerPage: number): Desenvolvedores[] {
        const startIndex = (currentPage - 1) * itemsPerPage;
        const endIndex = startIndex + itemsPerPage;
        return this.lista.slice(startIndex, endIndex);
      }

      currentPage = 1;
      itemsPerPage = 10;
      totalPages = Math.ceil(this.lista.length / this.itemsPerPage);

      //TABELA  --------------





}
