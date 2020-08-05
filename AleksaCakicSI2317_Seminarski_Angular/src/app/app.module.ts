import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IgraciComponent } from './igraci/igraci.component';
import { IgracComponent } from './igraci/igrac/igrac.component';
import { IgraciListaComponent } from './igraci/igraci-lista/igraci-lista.component';

import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { TimoviComponent } from './timovi/timovi.component';
import { TimComponent } from './timovi/tim/tim.component';
import { TimoviListaComponent } from './timovi/timovi-lista/timovi-lista.component';

@NgModule({
  declarations: [
    AppComponent,
    IgraciComponent,
    IgracComponent,
    IgraciListaComponent,
    TimoviComponent,
    TimComponent,
    TimoviListaComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
