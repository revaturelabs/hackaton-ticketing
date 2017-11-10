import { Component, Input } from '@angular/core';
import {TicketService} from '../../../services/ticket.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-new-ticket',
  templateUrl: './new-ticket.component.html',
  styleUrls: ['new-ticket.component.css']
})
export class NewTicketComponent {
  ticket = {
    id: 0,
    title: '',
    issue: '',
    comments: []
  }

  constructor(private ticketService: TicketService, public router: Router) {

  }
  addTicket() {
    this.ticketService.getTickets().push(this.ticket);
    this.router.navigate(['tickets']);
  }

}

