import { Component } from '@angular/core';
import { HomeComponent } from "../views/home/home.component";
import { RouterOutlet } from '@angular/router';

@Component({
    selector: 'app-nav-bar',
    standalone: true,
    templateUrl: './nav-bar.component.html',
    styleUrl: './nav-bar.component.css',
    imports: [HomeComponent, RouterOutlet]
})
export class NavBarComponent {

}
