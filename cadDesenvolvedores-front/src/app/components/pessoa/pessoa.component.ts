import { Component, OnInit} from '@angular/core';
import { CurrencyPipe, NgForOf,} from '@angular/common';

@Component({
  selector: 'app-pessoa',
  standalone: true,
  imports: [NgForOf, CurrencyPipe],
  templateUrl: './pessoa.component.html',
  styleUrl: './pessoa.component.css'
})
export class PessoaComponent implements OnInit {


  ngOnInit(): void {
  }

}
