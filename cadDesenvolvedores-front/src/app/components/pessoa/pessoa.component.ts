import { Component, OnInit} from '@angular/core';
import { CurrencyPipe, NgForOf,} from '@angular/common';
import { Pessoa } from '../../services/pessoas.model';
import { PessoasService } from '../../services/pessoas.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-pessoa',
  standalone: true,
  imports: [NgForOf, CurrencyPipe],
  templateUrl: './pessoa.component.html',
  styleUrl: './pessoa.component.css'
})
export class PessoaComponent implements OnInit {



  pessoas: Pessoa [] = [];


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



  constructor(private Service: PessoasService,private router: Router, private route: ActivatedRoute){}


  ngOnInit(): void {
    this.Service.finsAll().subscribe(pessoas => {
      this.pessoas = pessoas;
    })
  }








}
