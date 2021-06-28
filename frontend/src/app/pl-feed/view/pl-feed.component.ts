import { Component, ElementRef, HostListener, OnInit, ViewChild } from '@angular/core';

@Component({
  selector: 'app-pl-feed',
  templateUrl: './pl-feed.component.html',
  styleUrls: ['./pl-feed.component.scss']
})
export class PlFeedComponent implements OnInit {

  ngOnInit() {
  }


  @HostListener('scroll', ['$event'])
  onScroll(event: any) {
      // visible height + pixel scrolled >= total height 
      if (event.target.offsetHeight + event.target.scrollTop >= event.target.scrollHeight) {
        console.log("End");
      }
  }

}
