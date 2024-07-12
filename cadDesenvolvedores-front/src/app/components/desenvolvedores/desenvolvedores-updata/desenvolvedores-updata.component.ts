import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { DesenvolvedoresService } from '../../../services/Desenvolvedores/desenvolvedores.service';
import { Desenvolvedores } from '../../../services/Desenvolvedores/desenvolvedores.Model';
import { FormsModule } from '@angular/forms';
import { __param } from 'tslib';

@Component({
  selector: 'app-desenvolvedores-updata',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './desenvolvedores-updata.component.html',
  styleUrl: './desenvolvedores-updata.component.css'
})
export class DesenvolvedoresUpdataComponent implements OnInit {

  desenvolvedor!: Desenvolvedores;



  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private Service: DesenvolvedoresService
   ) {}


  ngOnInit(){
    this.route.paramMap.subscribe(params => {
      const id = params.get('id');
      if(id){
        this.Service.findById(id).subscribe(desenvolvedor => {
          this.desenvolvedor = desenvolvedor;
        })
      }
    })
  }


  updateDesenvolvedores(): void {
    this.Service.update(this.desenvolvedor).subscribe(() => {
      this.Service.showMessage("Produto atualizado com sucesso!")

      console.log("Erro1")
    });
    this.router.navigate(['/desenvolvedores'])
    console.log("Erro2")
  }



  cancelar() {
    this.router.navigate(['/desenvolvedores'])
  }




}
