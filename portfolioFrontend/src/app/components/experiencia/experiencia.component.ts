import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { PortfolioService } from 'src/app/service/portfolio.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent {
  experienciaList: any;
  user:any;
  constructor(
    private portfolioService:PortfolioService,
    private router:Router
  ){}

  ngOnInit(): void {
    this.portfolioService.obtenerDatosExp().subscribe(data=>{
      this.experienciaList=data;

      this.user=sessionStorage.getItem('currentUser');
    })
  }

  onEditar(id:any): void {
    this.router.navigate(['editExp', id]);
  }

  onClickCreateExp() {
    this.router.navigate(['editExp']);
  }

  onDelete(id:any, title:any): void{
    if(confirm("¿Seguro quieres eliminar "+title+"?")) {
      console.log("Implement delete functionality here");
      this.portfolioService.deleteExp(id);
      window.location.reload()
    }

  }

}
