import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { DesenvolvedoresService } from '../../../services/Desenvolvedores/desenvolvedores.service';
import { Desenvolvedores } from "../../../services/Desenvolvedores/desenvolvedores.Model";

@Component({
  selector: 'app-desenvolvedores-create',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './desenvolvedores-create.component.html',
  styleUrl: './desenvolvedores-create.component.css'
})
export class DesenvolvedoresCreateComponent implements OnInit{

  desenvolvedor: Desenvolvedores = {
    nome: '',
    niveis: ''
  }

  constructor(
        private router: Router,
        private Service: DesenvolvedoresService,

  ){}


  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }




  createDesenvolvedores(): void {
    this.Service.create(this.desenvolvedor).subscribe(() =>{
      this.Service.showMessage('Salvo');
    });

    this.router.navigate(['/desenvolvedores'])
  }

  cancel() {
    throw new Error('Method not implemented.');
  }


}
