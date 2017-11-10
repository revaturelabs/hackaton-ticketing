// modules
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { UIRouterModule } from '@uirouter/angular';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import {LocationStrategy, HashLocationStrategy} from '@angular/common';

// components
import {AppComponent} from './app.component';

// our app
import {EmployeeNavComponent} from './components/employee/nav/employee-nav.component';
import {EmployeeComponent} from './components/employee/employee.component';
import {EmployeeTicketsComponent} from './components/employee/tickets/employee-tickets.component';
import {NewTicketComponent} from './components/employee/new-ticket/new-ticket.component';
import {TicketComponent} from './components/ticket/ticket.component';

// services
import {FlashcardService} from './services/flashcard.service';
import {TicketService} from './services/ticket.service';

// pipes
import {CompletedPipe} from './pipes/completed.pipe';


import {appRoutes} from './routes';

@NgModule({
  imports: [
    BrowserModule,
    HttpModule,
    NgbModule.forRoot(),
    RouterModule.forRoot(appRoutes, { useHash: true }),
    FormsModule
  ],
  declarations: [
    // components
    AppComponent,

    // our app
    EmployeeNavComponent,
    EmployeeComponent,
    EmployeeTicketsComponent,
    NewTicketComponent,
    TicketComponent,
    
    // pipes
    CompletedPipe,
   ],
  providers: [
     // services
     FlashcardService,
     TicketService,
   ],
  bootstrap: [AppComponent]
})
export class AppModule { }
