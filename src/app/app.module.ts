import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AngularFireModule } from 'angularfire2';
import { AngularFireDatabaseModule } from 'angularfire2/database';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/shared/header/header.component';
import { FooterComponent } from './components/shared/footer/footer.component';
import { ItemsComponent } from './components/pages/items/items.component';
import { AboutComponent } from './components/pages/about/about.component';
import { ItemDetailComponent } from './components/pages/item-detail/item-detail.component';
import { HttpClientModule } from '@angular/common/http';
import { SearchComponent } from './components/pages/search/search.component';
import { from } from 'rxjs';
import { environment } from '../environments/environment';
import { ArticuloComponent } from './components/articulos/articulo/articulo.component';
import { ArticulosComponent } from './components/articulos/articulos.component';
import { ArticuloListComponent } from './components/articulos/articulo-list/articulo-list.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    ItemsComponent,
    AboutComponent,
    ItemDetailComponent,
    SearchComponent,
    ArticuloComponent,
    ArticuloListComponent,
    ArticulosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    AngularFireModule.initializeApp(environment.firebaseConfig),
    AngularFireDatabaseModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
