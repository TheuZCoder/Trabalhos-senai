import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InicioComponent } from './view/inicio/inicio.component';
import { CurriculosComponent } from './view/curriculos/curriculos.component';
import { PainelVagasComponent } from './view/painel-vagas/painel-vagas.component';
import { VagasComponent } from './view/vagas/vagas.component';
import { PainelCurriculosComponent } from './view/painel-curriculos/painel-curriculos.component';

const routes: Routes = [
  {path: '', component: InicioComponent},
  {path: 'curriculos', component: CurriculosComponent},
  {path: 'painelCurriculos', component: PainelCurriculosComponent},
  {path: 'vagas', component: VagasComponent},
  {path: 'painel', component: PainelVagasComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
