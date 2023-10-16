import { Component } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent {

   parentsMessage: string ='Take Good Food'
   sonsSalary:number =72000;
   sonsLoan:number =82000.989;


  childResponse: any;

   handleResponse(value:any):void{

    this.childResponse = value;
   }
}
