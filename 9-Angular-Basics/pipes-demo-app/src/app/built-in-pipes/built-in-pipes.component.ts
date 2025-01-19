import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { SummaryPipe } from '../custom-pipes/summary.pipe';

@Component({
  selector: 'app-built-in-pipes',
  imports: [CommonModule, SummaryPipe],
  templateUrl: './built-in-pipes.component.html',
  styleUrl: './built-in-pipes.component.css'
})
export class BuiltInPipesComponent {
  course = {
    title: "Java Full Stack with Angular",
    description: "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Veniam ut perferendis velit earum repellendus libero facere rem ratione, expedita rerum optio qui quisquam non officia, error culpa inventore, asperiores beatae.",
    numberOfStudents: 34545,
    rating: 4.5678,
    price: 787685,
    startDate: new Date()
  }
}
