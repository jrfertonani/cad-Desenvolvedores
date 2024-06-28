import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NavBarComponent } from "./components/views/nav-bar/nav-bar.component";
import { CommonModule } from '@angular/common';

@Component({
    selector: 'app-root',
    standalone: true,
    templateUrl: './app.component.html',
    styleUrl: './app.component.css',
    imports: [
      RouterOutlet,
      NavBarComponent,
      CommonModule,
    ]
})
export class AppComponent {
  title = 'cadDesenvolvedores-front';
}
