import { Component } from '@angular/core';

@Component({
  selector: 'app-trial',
  templateUrl: './trial.component.html',
  styleUrls: ['./trial.component.css']
})
export class TrialComponent {

  logo: string ='assets/images/television.jpg'
  altText:string ='television logo'

  laptop: string ='assets/images/laptop.jpg'
  laptopText:string ='Laptop logo'
  firstName:string =''
  isDisabled:boolean =false
  handleClick(){

    this.isDisabled=!this.isDisabled
  }
}
