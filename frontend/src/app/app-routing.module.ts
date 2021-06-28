import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PlFeedModule } from './pl-feed/pl-feed.module';
import { UserComponent } from './user/view/user.component';

const routes: Routes = [
  {
    path: '', 
    redirectTo: '/pl-feed',
    pathMatch: 'full'
  },
  {
    path: 'user',
    loadChildren: () =>
      import('./user/user.module').then((m) => m.UserModule),
  },
  {
    path: 'pl-feed',
    loadChildren: () =>
      import('./pl-feed/pl-feed.module').then((m) => m.PlFeedModule),
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
