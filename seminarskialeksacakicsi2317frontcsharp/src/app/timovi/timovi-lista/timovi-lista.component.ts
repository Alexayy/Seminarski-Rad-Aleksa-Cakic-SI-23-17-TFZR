import { Component, OnInit } from '@angular/core';
import { TimService } from '../deljeno-timovi/tim.service';
import { Timovi } from '../deljeno-timovi/timovi';

@Component({
  selector: 'app-timovi-lista',
  templateUrl: './timovi-lista.component.html',
  styleUrls: ['./timovi-lista.component.css']
})
export class TimoviListaComponent implements OnInit {

  constructor(public timservice : TimService) { }

  ngOnInit() {
    this.timservice.GetTimovi();
  }

  showEdit(tim : Timovi) {
    this.timservice.OdabraniTimovi = Object.assign({}, tim);
    this.ngOnInit();
  }

  onDelete(id : number) {
    if(confirm('Da li ste sigurni da zelite da obrisete dati unos?') == true) {
      this.timservice.DeleteTim(id).subscribe(x => {
        this.ngOnInit();
      })
    }
  }
}
