import { Component, OnInit } from '@angular/core';
import { PortfolioService } from 'src/app/service/portfolio.service';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-portfolio',
  templateUrl: './portfolio.component.html',
  styleUrls: ['./portfolio.component.css']
})

export class PortfolioComponent implements OnInit {
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

}
