import { Component, Input, OnInit } from '@angular/core';
import {TicketService} from '../../../services/ticket.service';

@Component({
  selector: 'app-emp-tickets',
  templateUrl: './employee-tickets.component.html',
  styleUrls: ['employee-tickets.component.css']
})
export class EmployeeTicketsComponent implements OnInit {
  tickets;

  constructor(private ticketService: TicketService) {
    
      }
    
      ngOnInit() {
        this.getData();
      }
    
      getData() {
        this.tickets = this.ticketService.getTickets();
        // this.flashcardsObserver = this.flashCardService.data$.subscribe(
        //   requestData => {
        //     console.log(requestData);
        //     this.flashcards = requestData;
        //   },
        //   error => console.log(error)
        // );
    
      }

  updateTicket(ticket, index) {
    console.log(ticket);
    console.log(index)
    this.tickets[index] = ticket;
  }

}

