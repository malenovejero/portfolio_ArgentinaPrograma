import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/service/authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
  form: FormGroup;
  errorLogIn = false;
  constructor(
    private formBuilder:FormBuilder,
    private authenticationService:AuthenticationService,
    private router:Router
  ){
    this.form=this.formBuilder.group(
    {
      username:["",[Validators.required]],
      password:["",[]]
    })
  }

  ngOnInit(): void {
  }


  get Username(){
    return this.form.get("username");
  }

  get Password(){
    return this.form.get("password");
  }

  onEnviar(event:Event){
    event.preventDefault;
    this.authenticationService.IniciarSesion(this.form.value).subscribe(data=>{
      console.log('currentUser: ' + JSON.stringify(data));
      if (data) {
        this.router.navigate(['/portfolio']);
      } else {
        this.errorLogIn = true;
      }
    })
  }

}
