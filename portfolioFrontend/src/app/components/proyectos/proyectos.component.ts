import { Component } from '@angular/core';
import { PortfolioService } from 'src/app/service/portfolio.service';

@Component({
  selector: 'app-proyectos',
  templateUrl: './proyectos.component.html',
  styleUrls: ['./proyectos.component.css']
})
export class ProyectosComponent {
  user:any;
  proyectosList:any;

  constructor(
    private portfolioService:PortfolioService
  ){}

  ngOnInit(): void {
    this.portfolioService.obtenerDatosPro().subscribe(data=>{
      this.proyectosList=data;
      console.log(data);

      this.user=sessionStorage.getItem('currentUser');
    })
  }

}
