import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {

  transform(values: any[], ...args: any[]): any {

     
     if(!values) return [];

     if(!args[1] || !values) return values

    return values.filter(element => element[args[0]]===args[1]);
  }

}
