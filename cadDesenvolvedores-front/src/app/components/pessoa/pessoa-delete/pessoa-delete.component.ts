import { Component, Input, OnInit, input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-pessoa-delete',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './pessoa-delete.component.html',
  styleUrl: './pessoa-delete.component.css'
})
export class PessoaDeleteComponent implements OnInit {
  constructor(private router: Router) {}

  ngOnInit(): void {}
















  deleteProduct() {
    throw new Error('Method not implemented.');
  }

  cancel() {
    throw new Error('Method not implemented.');
  }
}
