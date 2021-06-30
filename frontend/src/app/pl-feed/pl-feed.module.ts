import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PlFeedRoutes } from './pl-feed.routing';
import { PlFeedComponent } from './view/pl-feed.component';
import { TimeagoCustomFormatter, TimeagoFormatter, TimeagoIntl, TimeagoModule } from 'ngx-timeago';

@NgModule({
  imports: [
    CommonModule,
    PlFeedRoutes,
    TimeagoModule.forRoot({
      intl: { provide: TimeagoIntl},
      formatter: { provide: TimeagoFormatter, useClass: TimeagoCustomFormatter },
    })
  ],
  declarations: [PlFeedComponent]
})
export class PlFeedModule { }
