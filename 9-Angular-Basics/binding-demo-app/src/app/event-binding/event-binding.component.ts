import { Component } from '@angular/core';

@Component({
  selector: 'app-event-binding',
  imports: [],
  templateUrl: './event-binding.component.html',
  styleUrl: './event-binding.component.css'
})
export class EventBindingComponent {
  count: number = 0

  picUrl = "images/pic1.jpg"
  picHeight = 150

  increment(step:number = 1){
    this.count +=step;
  }

  changeImageUrl(){
    this.picUrl = "images/pic2.jpg"
  }
}
