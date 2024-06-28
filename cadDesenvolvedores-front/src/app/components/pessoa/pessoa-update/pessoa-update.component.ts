import { Component, Input, OnInit, input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pessoa-update',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './pessoa-update.component.html',
  styleUrl: './pessoa-update.component.css'
})
export class PessoaUpdateComponent implements OnInit {
  constructor(private router: Router) {}

  ngOnInit(): void {}
















  updatePessoa() {
    throw new Error('Method not implemented.');
  }

  cancel() {
    throw new Error('Method not implemented.');
  }
}
