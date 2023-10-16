import { Directive,ElementRef,Renderer2 ,HostListener, Input} from '@angular/core';

@Directive({
  selector: '[appHighLight]'
})
export class HighLightDirective {

  @Input('appHighLight') choice: string=''
  
  constructor(private elementRef:ElementRef,private renderer:Renderer2) { }

 @HostListener('mouseover')    over(){

      this.renderer.addClass(this.elementRef.nativeElement,this.choice);

     }

     @HostListener('mouseout')   out(){

      this.renderer.removeClass(this.elementRef.nativeElement,this.choice);

     }
}


