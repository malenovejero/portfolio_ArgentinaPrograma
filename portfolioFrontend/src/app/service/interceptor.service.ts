import { Injectable } from '@angular/core';
import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from "@angular/common/http";
import { Observable } from 'rxjs';
import { AuthenticationService } from './authentication.service';


@Injectable({
  providedIn: 'root'
})
export class InterceptorService implements HttpInterceptor{

  constructor(private authenticationService:AuthenticationService) { }

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {

    var currentUser=this.authenticationService.UsuarioAutenticado;
    if (currentUser && currentUser.accessToken) {
      req=req.clone({
        setHeaders:{
          Authorization: `Bearer ${currentUser.accesToken}`
        }
      })
    }
    console.log("El interceptor esta corriendo "+JSON.stringify(currentUser));
    return next.handle(req);
  }
}
