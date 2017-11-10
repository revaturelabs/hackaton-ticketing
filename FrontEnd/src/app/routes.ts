import { Routes } from '@angular/router';

import {HttpCachedComponent} from './components/http-cached/http-cached.component';


// our app
import {EmployeeComponent} from './components/employee/employee.component';
import {EmployeeTicketsComponent} from './components/employee/tickets/employee-tickets.component';
import {NewTicketComponent} from './components/employee/new-ticket/new-ticket.component';

export const appRoutes: Routes = [
  // our routes
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
