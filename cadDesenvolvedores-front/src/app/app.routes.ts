import { Routes } from '@angular/router';
import { HomeComponent } from './components/views/home/home.component';
import { DesenvolvedoreslistComponent } from './components/views/desenvolvedores/desenvolvedoreslist/desenvolvedoreslist.component';

export const routes: Routes = [
  {path:"",component: HomeComponent},
  {path:"desenvolvedores", component: DesenvolvedoreslistComponent},
];
