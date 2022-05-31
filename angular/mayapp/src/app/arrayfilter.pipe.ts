import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'arrayfilter'
})
export class ArrayfilterPipe implements PipeTransform {

  transform(value: [], searchText: any): any {
    console.log(value,searchText);
    //if searchtext has value return the filtered array or return the entire array.
    if(searchText == ""){
      return value;
    }
    let filterArray = value.filter((o:string)=>o['name'].startsWith(searchText));
    return filterArray;
  }

}
