import { Component } from '@angular/core';
import { BuiltInPipesComponent } from './built-in-pipes/built-in-pipes.component';
// import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [BuiltInPipesComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'pipes-demo-app';
}
