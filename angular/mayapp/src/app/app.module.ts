import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { HeaderComponent } from './header/header.component';

import { FormsModule } from '@angular/forms';//two way data binding.
import { HttpClientModule } from '@angular/common/http';
import { SquarePipe } from './square.pipe';
import { ArrayfilterPipe } from './arrayfilter.pipe';
import { FooterComponent } from './footer/footer.component';//http api integration.


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactComponent,
    AboutComponent,
    HeaderComponent,
    SquarePipe,
    ArrayfilterPipe,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
