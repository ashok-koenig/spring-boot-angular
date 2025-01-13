import { Component } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  imports: [],
  templateUrl: './property-binding.component.html',
  styleUrl: './property-binding.component.css'
})
export class PropertyBindingComponent {
  webUrl:string = "https://www.google.com"
  picUrl = "images/pic1.jpg"
  picHeight = 150
  isDisabled = true
}
