import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-desenvolvedores-create',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './desenvolvedores-create.component.html',
  styleUrl: './desenvolvedores-create.component.css'
})
export class DesenvolvedoresCreateComponent implements OnInit{



  constructor(
        private router: Router
  ){}


  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }





  createDesenvolvedores() {
    throw new Error('Method not implemented.');
  }

  cancel() {
    throw new Error('Method not implemented.');
  }


}
