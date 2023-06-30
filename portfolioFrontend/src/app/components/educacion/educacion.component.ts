import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { PortfolioService } from 'src/app/service/portfolio.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent {
  user:any;
  educacionList:any;

  constructor(
    private datosPortfolio:PortfolioService,
    private router:Router
  ){}

  ngOnInit(): void {
    this.datosPortfolio.obtenerDatosEd().subscribe(data=>{
      this.educacionList=data;
      console.log(data);

      this.user=sessionStorage.getItem('currentUser');
    })
  }

}
