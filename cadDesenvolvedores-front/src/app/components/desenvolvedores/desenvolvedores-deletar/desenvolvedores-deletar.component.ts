import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { DesenvolvedoresService } from '../../../services/Desenvolvedores/desenvolvedores.service';
import { Desenvolvedores } from '../../../services/Desenvolvedores/desenvolvedores.Model';

@Component({
  selector: 'app-desenvolvedores-deletar',
  standalone: true,
  imports: [],
  templateUrl: './desenvolvedores-deletar.component.html',
  styleUrl: './desenvolvedores-deletar.component.css'
})
export class DesenvolvedoresDeletarComponent implements OnInit {

  desenvolvedores!: Desenvolvedores;

  constructor(private router: Router, private route: ActivatedRoute, private Service: DesenvolvedoresService) {}



  ngOnInit(){
    this.route.paramMap.subscribe(params => {
      const id = params.get('id');
      if(id){
        this.Service.findById(id).subscribe(desenvolvedores =>{
          this.desenvolvedores = desenvolvedores;
        });
      }
    });
  }





cancelar() {
  this.router.navigate(['/desenvolvedores'])
}


deleteDesenvolvedores(): void {
if (this.desenvolvedores && this.desenvolvedores.id){
  this.Service.delete(this.desenvolvedores.id).subscribe(() => {
    this.Service.showMessage("Produco excluido!");
  });
  this.router.navigate(['/desenvolvedores']);
}else {
  console.error("Produto data or ID in missing.")
}
}




}
