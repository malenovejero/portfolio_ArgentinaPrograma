import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PortfolioComponent } from './components/portfolio/portfolio.component';
import { LoginComponent } from './components/login/login.component';
import { EditableComponent } from './components/editable/editable.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { SkillsComponent } from './components/skills/skills.component';
import { ProyectosComponent } from './components/proyectos/proyectos.component';
import { ExpEditableComponent } from './components/exp-editable/exp-editable.component';
import { EdEditableComponent } from './components/ed-editable/ed-editable.component';

const routes: Routes = [
  {path: "portfolio",component:PortfolioComponent},
  {path: "login",component:LoginComponent},
  {path:"",redirectTo:"portfolio",pathMatch:"full"},
  {path:"edit", component:EditableComponent},
  {path:"editExp", component:ExpEditableComponent},
  {path:"editExp/:id", component:ExpEditableComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
