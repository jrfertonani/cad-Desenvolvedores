import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-desenvolvedores-updata',
  standalone: true,
  imports: [],
  templateUrl: './desenvolvedores-updata.component.html',
  styleUrl: './desenvolvedores-updata.component.css'
})
export class DesenvolvedoresUpdataComponent implements OnInit {


  constructor(
    private router: Router,
    private route: ActivatedRoute) {}


  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }




  updateDesenvolvedores() {
    throw new Error('Method not implemented.');
  }


  cancel() {
    throw new Error('Method not implemented.');
  }




}
