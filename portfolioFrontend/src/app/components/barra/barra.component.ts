import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-barra',
  templateUrl: './barra.component.html',
  styleUrls: ['./barra.component.css']
})
export class BarraComponent {

  currentUser:any;

  constructor(private router:Router) {
    this.currentUser = sessionStorage.getItem('currentUser');
  }

  onClickLogout() {
    sessionStorage.removeItem('currentUser');
    window.location.reload()
  }

}
