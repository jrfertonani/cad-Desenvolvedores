import { Component, Input, OnInit, input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { PessoasService } from '../../../services/pessoas.service';
import { Pessoa } from '../../../services/pessoas.model';


@Component({
  selector: 'app-pessoa-update',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './pessoa-update.component.html',
  styleUrl: './pessoa-update.component.css'
})
export class PessoaUpdateComponent implements OnInit {

  pessoa!:Pessoa;

  constructor(
    private Service: PessoasService,
    private router: Router,
    private route: ActivatedRoute) {}

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      const id = params.get('id');
       if (id) {
        this.Service.findById(id).subscribe(pessoa => {
        this.pessoa = pessoa;
        });
      }
    });
  }


  updatePessoa(): void {
    this.Service.update(this.pessoa).subscribe(() => {
      this.Service.showMessage("Ok!");

      this.router.navigate(['/pessoas'])
    })
  }

  cancel() {
    this.router.navigate(['/pessoas'])
  }
}
