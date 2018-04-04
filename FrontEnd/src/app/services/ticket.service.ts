import { Injectable, Inject } from '@angular/core';
import { Http, Response } from '@angular/http';
import { BehaviorSubject } from 'rxjs/Rx';
import { Observable } from 'rxjs/Observable';
import { environment } from '../../environments/environment';

@Injectable()
export class TicketService {

  private dataSubject = new BehaviorSubject([]);
  data$: Observable<any> = this.dataSubject.asObservable();

  private tickets = [
    {
      id: 1,
      title: 'This is a ticket title',
      issue: 'this is the tickets issue',
      comments: [
        {
          comment: 'This is a comment'
        },
        {
          comment: 'This is another comment'
        }
      ]
    },
    {
      id: 2,
      title: 'This is another ticket title',
      issue: 'this is another tickets issue',
      comments: []
    }
  ];

  private prom;

  constructor(@Inject(Http) public http: Http) {
    // this.fetch();
  }

  getTickets() {
    return this.tickets;
  }

  // fetch(): void {
  //   this.tickets = this.http.get(environment.context + 'tickets').map(
  //     resp => resp.json(),
  //     err => console.log(err)
  //   )
  //   .subscribe(
  //     resp => {
  //       this.dataSubject.next(resp);
  //     },
  //     err => {
  //       console.log('error occurred loading flashcards' + err);
  //     }
  //   );
  // }

}
