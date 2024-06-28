import { Component, Input, OnInit, input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pessoa-create',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './pessoa-create.component.html',
  styleUrl: './pessoa-create.component.css',
})
export class PessoaCreateComponent implements OnInit {
  constructor(private router: Router) {}

  ngOnInit(): void {}
















  createPessoa() {
    throw new Error('Method not implemented.');
  }

  cancel() {
    throw new Error('Method not implemented.');
  }
}
