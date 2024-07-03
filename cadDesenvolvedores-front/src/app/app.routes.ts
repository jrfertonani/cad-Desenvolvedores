import { Routes } from '@angular/router';
import { HomeComponent } from './components/views/home/home.component';
import { PessoaComponent } from './components/pessoa/pessoa.component';
import { PessoaCreateComponent } from './components/pessoa/pessoa-create/pessoa-create.component';
import { PessoaUpdateComponent } from './components/pessoa/pessoa-update/pessoa-update.component';
import { PessoaDeleteComponent } from './components/pessoa/pessoa-delete/pessoa-delete.component';
import { DesenvolvedoresComponent } from './components/desenvolvedores/desenvolvedores.component';
import { DesenvolvedoresCreateComponent } from './components/desenvolvedores/desenvolvedores-create/desenvolvedores-create.component';
import { DesenvolvedoresUpdataComponent } from './components/desenvolvedores/desenvolvedores-updata/desenvolvedores-updata.component';
import { DesenvolvedoresDeletarComponent } from './components/desenvolvedores/desenvolvedores-deletar/desenvolvedores-deletar.component';

export const routes: Routes = [
  {path:"", component: HomeComponent},
  {path:"pessoas", component: PessoaComponent},
  {path:"pessoas/create", component: PessoaCreateComponent},
  {path:"pessoas/update/:id", component: PessoaUpdateComponent},
  {path:"pessoas/delete/:id", component: PessoaDeleteComponent},

  {path:"desenvolvedores", component: DesenvolvedoresComponent},
  {path:"desenvolvedores/create", component: DesenvolvedoresCreateComponent},
  {path:"desenvolvedores/update/:id", component: DesenvolvedoresUpdataComponent},
  {path:"desenvolvedores/delete/:id", component: DesenvolvedoresDeletarComponent},
];
