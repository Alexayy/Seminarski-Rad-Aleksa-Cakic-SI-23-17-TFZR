import { Component, OnInit } from '@angular/core';
import { IgracService } from '../deljeno-igraci/igrac.service';
import { Igraci } from '../deljeno-igraci/igraci';

@Component({
  selector: 'app-igraci-lista',
  templateUrl: './igraci-lista.component.html',
  styleUrls: ['./igraci-lista.component.css']
})
export class IgraciListaComponent implements OnInit {

  constructor(public igracservice : IgracService) { }

  ngOnInit() {
    this.igracservice.GetIgraci();
  }

  showEdit(igrac : Igraci) {
    this.igracservice.OdabraniIgraci = Object.assign({}, igrac);
    this.ngOnInit();
  }

  onDelete(id : number) {
    if(confirm('Da li ste sigurni da zelite da obrisete dati unos?') == true) {
      this.igracservice.DeleteIgrac(id).subscribe(x => {
        this.ngOnInit();
      })
    }
  }
}
