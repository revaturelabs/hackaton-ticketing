import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html'
})
export class LoginComponent implements OnInit {
  public user = {
    username: '',
    password: ''
  };

  constructor(private router: Router) {

  }

  ngOnInit() {

  }

  signIn() {
    if (this.user.username === 'employee') {
      this.router.navigate(['/employee']);
    } else if (this.user.username === 'mentor') {
      this.router.navigate(['/mentor']);
    } else if (this.user.username === 'admin') {
      this.router.navigate(['admin']);
    }
  }
}
