import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';

//routing config
const routes: Routes = [
  {path:'',"component":HomeComponent},//default page
  {path:'home',"component":HomeComponent},
  {path:'about',"component":AboutComponent},
  {path:'contact',"component":ContactComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
