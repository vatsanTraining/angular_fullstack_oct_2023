import { Component ,Input} from '@angular/core';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-show-vendor',
  templateUrl: './show-vendor.component.html',
  styleUrls: ['./show-vendor.component.css']
})
export class ShowVendorComponent {

  @Input() list:Vendor[] = [];

  headerColor:string='coralColor'

  srchValue:string = ''
  
  constructor(private service:VendorService,private route:Router){
    console.log('value of list in constructor'+this.list)
  }
  ngOnInit(): void {
    console.log('value of list in init method'+this.list)
  }

  remove(element:Vendor){

  
    this.service.remove(element.id).subscribe(data =>{

      let idxPos =this.list.indexOf(element);

      this.list.splice(idxPos, 1);
  
    })
    this.route.navigate(['vendor'])
  }
}
