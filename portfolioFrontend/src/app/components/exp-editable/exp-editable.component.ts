import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { PortfolioService } from 'src/app/service/portfolio.service';

@Component({
  selector: 'app-exp-editable',
  templateUrl: './exp-editable.component.html',
  styleUrls: ['./exp-editable.component.css']
})
export class ExpEditableComponent implements OnInit{
  miPortfolio:any;
  id: any;
  formEdit: FormGroup;

  constructor(
    private datosPortfolio:PortfolioService,
    private formBuilder:FormBuilder,
    private router:Router,
    private activatedRoute: ActivatedRoute
  ){
    this.formEdit = this.formBuilder.group({
      //id:["",[Validators.required]],
      title:["",[]],
      date:["",[]],
      description:["",[]],
      photoUrl: ["",[]]
    });
    this.id = this.activatedRoute.snapshot.paramMap.get('id');
  }

  ngOnInit(): void {
    if (!sessionStorage.getItem('currentUser')) {
      this.router.navigate(['portfolio'])
    }
    if (!this.id) {
      return;
    }
    this.datosPortfolio.obtenerExp(this.id).subscribe(data=>{
      this.miPortfolio=data;
      this.formEdit.setValue({
        title: this.miPortfolio.title,
        description: this.miPortfolio.description,
        photoUrl: this.miPortfolio.photoUrl,
        date: this.miPortfolio.date
      })
    })

  }

  onSave () {
    this.datosPortfolio.saveExp(this.formEdit.value, this.id);
    this.router.navigate(['/portfolio']);
  }

  onCancel (){
    this.router.navigate(['/portfolio']);
  }

}
