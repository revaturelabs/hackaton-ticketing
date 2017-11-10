import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-ticket',
  templateUrl: './ticket.component.html',
  styleUrls: ['ticket.component.css']
})
export class TicketComponent {
  @Input()
  public ticket;
  public display = false;
  showComments = false;
  newComment = {
   comment: ''
  };

  @Output() ticketChange: EventEmitter<any>;

  constructor() {
    this.ticketChange = new EventEmitter<any>();
  }

  public toggleDisplay() {
    this.display = !this.display;
  }

  public toggleComments() {
    this.showComments = !this.showComments;
  }

  addComment() {
    console.log(this.newComment);
    console.log(this.ticket.comments)
    if (this.newComment) {
      this.ticket.comments.push(this.newComment);
      this.newComment = {
        comment: ''
      };
      this.ticketChange.emit(this.ticket);
    }
  }
}

