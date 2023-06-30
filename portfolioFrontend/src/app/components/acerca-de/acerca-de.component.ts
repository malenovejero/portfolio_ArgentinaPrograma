import { Component, OnInit } from '@angular/core';
import { PortfolioService } from 'src/app/service/portfolio.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit{
  miPortfolio:any;
  user:any;
  constructor(
    private datosPortfolio:PortfolioService,
    private router:Router
  ){}

  ngOnInit(): void {

    this.datosPortfolio.obtenerDatos().subscribe(data=>{
      this.miPortfolio=data;
      this.user=sessionStorage.getItem('currentUser');
    })
  }

  onEditar(event:Event): void {
    this.router.navigate(['edit']);
  }

}
