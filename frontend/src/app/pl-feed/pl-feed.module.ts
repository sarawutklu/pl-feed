import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PlFeedRoutes } from './pl-feed.routing';
import { PlFeedComponent } from './view/pl-feed.component';

@NgModule({
  imports: [
    CommonModule,
    PlFeedRoutes
  ],
  declarations: [PlFeedComponent]
})
export class PlFeedModule { }
