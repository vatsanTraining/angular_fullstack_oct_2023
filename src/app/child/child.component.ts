import { Component,Input,Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

     @Input({required:true}) momsMessage:string='';
      @Output() response:EventEmitter<string> = new EventEmitter<string>();

      sendMessage(){

        this.response.emit('yaa mom i took paradise briyani')
      }
}
