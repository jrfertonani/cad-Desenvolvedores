import { Component, OnInit} from '@angular/core';
import { CurrencyPipe, NgForOf,} from '@angular/common';
import { Pessoa } from '../../services/pessoas.model';
import { PessoasService } from '../../services/pessoas.service';

@Component({
  selector: 'app-pessoa',
  standalone: true,
  imports: [NgForOf, CurrencyPipe],
  templateUrl: './pessoa.component.html',
  styleUrl: './pessoa.component.css'
})
export class PessoaComponent implements OnInit {

  pessoas: Pessoa [] = [];


  constructor(private Service: PessoasService){}


  ngOnInit(): void {
    this.Service.finsAll().subscribe((pessoas: Pessoa[]) => {
      this.pessoas = pessoas;
    })
  }

}
