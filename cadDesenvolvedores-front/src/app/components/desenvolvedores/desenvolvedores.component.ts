import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-desenvolvedores',
  standalone: true,
  imports: [],
  templateUrl: './desenvolvedores.component.html',
  styleUrl: './desenvolvedores.component.css'
})
export class DesenvolvedoresComponent {

  constructor(private router: Router, private route: ActivatedRoute){}

/*
  desenvolvedores: Desenvolvedores [] = [];


      //TABELA  Pageable -----
      sliceProducts(currentPage: number, itemsPerPage: number): Pessoa[] {
        const startIndex = (currentPage - 1) * itemsPerPage;
        const endIndex = startIndex + itemsPerPage;
        return this.pessoas.slice(startIndex, endIndex);
      }

      currentPage = 1;
      itemsPerPage = 10;
      totalPages = Math.ceil(this.pessoas.length / this.itemsPerPage);

      //TABELA  --------------

      */

}
