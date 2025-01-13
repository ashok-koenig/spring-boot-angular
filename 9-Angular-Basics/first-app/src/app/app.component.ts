import { Component } from '@angular/core';
import { WelcomeComponent } from './welcome/welcome.component';
// import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [WelcomeComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title:string = 'This is First App Title';
  price: number = 50;
  quantity: number = 4;
}
