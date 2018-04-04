import { Routes } from '@angular/router';

import {HttpCachedComponent} from './components/http-cached/http-cached.component';


// our app
import {EmployeeComponent} from './components/employee/employee.component';
import {EmployeeTicketsComponent} from './components/employee/tickets/employee-tickets.component';
import {NewTicketComponent} from './components/employee/new-ticket/new-ticket.component';
import {LoginComponent} from './components/login/login.component';
import {MentorComponent} from './components/mentor/mentor.component';
import {AdminComponent} from './components/admin/admin.component';

export const appRoutes: Routes = [
  // our routes
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'employee',
    component: EmployeeComponent,
    children: [
      {
        path: 'tickets',
        component: EmployeeTicketsComponent
      },
      {
        path: 'new-ticket',
        component: NewTicketComponent
      },
      {
        path: '',
        component: EmployeeTicketsComponent
      },
      {
        path: '**',
        redirectTo: 'tickets',
        pathMatch: 'full'
      }
    ]
  },
  {
    path:'mentor',
    component: MentorComponent
  },
  {
    path:'admin',
    component: AdminComponent
  },
  { path: '',
    redirectTo: '/employee',
    pathMatch: 'full'
  },
  {
    path: '**',
    redirectTo: '/employee',
    pathMatch: 'full'
  }
];
