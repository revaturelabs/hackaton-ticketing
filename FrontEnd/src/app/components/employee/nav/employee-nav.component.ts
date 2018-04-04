import { Component } from '@angular/core';

@Component({
  selector: 'app-emp-nav',
  templateUrl: './employee-nav.component.html',
  styleUrls: ['./employee-nav.component.css']
})
export class EmployeeNavComponent {
  hideNav = true;
  toggleCollapse(): void {
    this.hideNav = !this.hideNav;
  }
}
