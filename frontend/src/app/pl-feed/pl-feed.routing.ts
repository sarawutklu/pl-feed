import { Routes, RouterModule } from '@angular/router';
import { PlFeedComponent } from './view/pl-feed.component';

const routes: Routes = [
  {
    path: "",
    component: PlFeedComponent
  },
];

export const PlFeedRoutes = RouterModule.forChild(routes);
