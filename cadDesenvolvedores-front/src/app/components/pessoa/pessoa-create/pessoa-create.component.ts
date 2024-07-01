import { Component, Input, OnInit, input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { Pessoa } from '../../../services/pessoas.model';
import { PessoasService } from '../../../services/pessoas.service';

@Component({
  selector: 'app-pessoa-create',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './pessoa-create.component.html',
  styleUrl: './pessoa-create.component.css',
})
export class PessoaCreateComponent implements OnInit {

  pessoa: Pessoa = {
    nome: '',
  }

  constructor(
    private Service: PessoasService,
    private router: Router
  ){}


  ngOnInit(): void {
    this.Service.showMessage("ok!!!")
  }


  createPessoa(): void {
    this.Service.create(this.pessoa).subscribe(() => {
      this.Service.showMessage('Salvo');
    });

    this.router.navigate(['/pessoas']);
  }

  cancel(): void {
    this.router.navigate(['/pessoas'])
  }
}
