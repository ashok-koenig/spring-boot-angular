import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-structural-directive',
  imports: [CommonModule],
  templateUrl: './structural-directive.component.html',
  styleUrl: './structural-directive.component.css'
})
export class StructuralDirectiveComponent {
  // friends: string[] = ["John", "Peter", "Smith", "Bob", "Ana"]
  friends: string[] = []
  isVisible: boolean = true;
  dayOfWeek: number = 1
  toggleVisibility(): void {
    this.isVisible = !this.isVisible;
  }
}
