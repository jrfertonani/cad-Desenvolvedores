import { Routes } from '@angular/router';
import { NavBarComponent } from './components/views/nav-bar/nav-bar.component';
import { HomeComponent } from './components/views/home/home.component';
import { PessoaComponent } from './components/pessoa/pessoa.component';
import { PessoaCreateComponent } from './components/pessoa/pessoa-create/pessoa-create.component';
import { PessoaUpdateComponent } from './components/pessoa/pessoa-update/pessoa-update.component';
import { PessoaDeleteComponent } from './components/pessoa/pessoa-delete/pessoa-delete.component';

export const routes: Routes = [
  {path:"", component: HomeComponent},
  {path:"pessoas", component: PessoaComponent},
  {path:"pessoas/create", component: PessoaCreateComponent},
  {path:"pessoas/update/:id", component: PessoaUpdateComponent},
  {path:"pessoas/delete/:id", component: PessoaDeleteComponent}
];
