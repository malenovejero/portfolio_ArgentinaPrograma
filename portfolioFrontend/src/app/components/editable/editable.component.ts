import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { PortfolioService } from 'src/app/service/portfolio.service';

@Component({
  selector: 'app-editable',
  templateUrl: './editable.component.html',
  styleUrls: ['./editable.component.css']
})
export class EditableComponent implements OnInit {
  miPortfolio:any;
  formEdit: FormGroup;

  constructor(
    private datosPortfolio:PortfolioService,
    private formBuilder:FormBuilder,
    private router:Router
  ){
    this.formEdit = this.formBuilder.group({
      nameSurname:["",[Validators.required]],
      email:["",[]],
      location:["",[]],
      profession:["",[]],
      description:["",[]],
      imageLink: ["",[]]
    });
  }

  ngOnInit(): void {
    if (!sessionStorage.getItem('currentUser')) {
      this.router.navigate(['portfolio'])
    }
    this.datosPortfolio.obtenerDatos().subscribe(data=>{
      this.miPortfolio=data;
      this.formEdit.setValue({
        nameSurname: this.miPortfolio.nameSurname,
        location: this.miPortfolio.location,
        email: this.miPortfolio.email,
        profession: this.miPortfolio.profession,
        description: this.miPortfolio.description,
        imageLink: this.miPortfolio.imageLink
      })
    })
  }

  onSave () {
    this.datosPortfolio.save(this.formEdit.value);
    this.router.navigate(['/portfolio']);
  }

  onCancel (){
    this.router.navigate(['/portfolio']);
  }
}
