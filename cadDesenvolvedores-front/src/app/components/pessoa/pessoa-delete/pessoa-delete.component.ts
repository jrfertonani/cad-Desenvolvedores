import { Component, Input, OnInit, input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Pessoa } from '../../../services/pessoas.model';
import { PessoasService } from '../../../services/pessoas.service';


@Component({
  selector: 'app-pessoa-delete',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './pessoa-delete.component.html',
  styleUrl: './pessoa-delete.component.css'
})
export class PessoaDeleteComponent implements OnInit {
  constructor(private router: Router, private route: ActivatedRoute, private Service: PessoasService) {}

  pessoa!: Pessoa;

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      const id = params.get('id');
      if (id) {
        this.Service.findById(id).subscribe(pessoa => {
          this.pessoa = pessoa
        })
      }
    })
  }




  deletePessoa(): void {
    if (this.pessoa && this.pessoa.id) { // Check if product and id exist
      this.Service.delete(this.pessoa.id).subscribe(() => {
        this.Service.showMessage("Produto excluido com sucesso!");
        this.router.navigate(['/']);
      });
    } else {
      console.error("Product data or ID is missing."); // Handle missing data
    }
  }

  cancel() {
    this.router.navigate(['/pessoas'])
  }
}
