import { Component ,Input} from '@angular/core';
import { Vendor } from '../vendor';

@Component({
  selector: 'app-show-vendor',
  templateUrl: './show-vendor.component.html',
  styleUrls: ['./show-vendor.component.css']
})
export class ShowVendorComponent {

  @Input() list:Vendor[] = [];

  headerColor:string='coralColor'

  srchValue:string = ''
  
  constructor(){
    console.log('value of list in constructor'+this.list)
  }
  ngOnInit(): void {
    console.log('value of list in init method'+this.list)
  }

  
}
