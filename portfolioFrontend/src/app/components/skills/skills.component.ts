import { Component } from '@angular/core';
import { PortfolioService } from 'src/app/service/portfolio.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})

export class SkillsComponent {
  user: any;
  skillsList: any;

  constructor(
    private portfolioService:PortfolioService,
  ){}

  ngOnInit(): void {
    this.portfolioService.obtenerDatosSki().subscribe(data=>{
      this.skillsList=data;
      this.user=sessionStorage.getItem('currentUser');
    })
  }
}
