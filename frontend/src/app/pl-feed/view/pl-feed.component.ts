import { Component, ElementRef, HostListener, OnInit, ViewChild } from '@angular/core';
import { FeedService } from 'src/app/services/feed.service';

@Component({
  selector: 'app-pl-feed',
  templateUrl: './pl-feed.component.html',
  styleUrls: ['./pl-feed.component.scss']
})
export class PlFeedComponent implements OnInit {

  page = 0;
  postList = Array<any>();

  constructor(
    private feedService: FeedService
  ) {

  }
  ngOnInit() {
    this.getFeed();
  }

  isCallApi = false;

  @HostListener('window:scroll', ['$event'])
  onScroll(elem: any) {

    // console.log(window.innerHeight + window.scrollY);
    // console.log(document.body.scrollHeight);
    // console.log(document.body.scrollHeight);
    // console.log(window.scrollY / document.body.scrollHeight);
    // console.log('==');

    if ((window.innerHeight + window.scrollY) >= (document.body.scrollHeight + 90)) {
      console.log('end');

      this.page++;
      this.getFeed();
    }
  }

  getFeed() {
    return this.feedService.getFeed(this.page).toPromise().then((res: any) => {
      console.log(res);
      this.postList.push(...res)
    })
  }



}
