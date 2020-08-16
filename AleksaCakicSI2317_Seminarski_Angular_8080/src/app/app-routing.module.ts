import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { IgraciComponent } from './igraci/igraci.component';
import { TimoviComponent } from './timovi/timovi.component';

const routes: Routes = [
  { path: 'igraci', component: IgraciComponent },
  { path: 'timovi', component: TimoviComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
