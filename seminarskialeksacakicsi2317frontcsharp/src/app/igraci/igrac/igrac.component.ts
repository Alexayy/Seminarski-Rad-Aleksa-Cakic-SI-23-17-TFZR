import { Component, OnInit } from '@angular/core';
import { IgracService } from '../deljeno-igraci/igrac.service';
import { NgForm } from '@angular/forms';
import { NullTemplateVisitor } from '@angular/compiler';

@Component({
  selector: 'app-igrac',
  templateUrl: './igrac.component.html',
  styleUrls: ['./igrac.component.css']
})
export class IgracComponent implements OnInit {

  constructor(public igracservice : IgracService) { }

  ngOnInit() {
    this.ResetForm();
  }

  ResetForm(form? : NgForm) {
    if(form != null)form.reset();
    this.igracservice.OdabraniIgraci = {
      igrac_id : null,
      igrac_ime : '',
      igrac_prezime : '',
      igrac_broj : null,
      igrac_tim : '',
      igrac_godiste : null,
    }
  }

  OnSubmit(form : NgForm) {
    if(form.value.igrac_id == null) {
      this.igracservice.Postigraci(form.value).subscribe(data => {
        this.ResetForm(form);
        this.igracservice.GetIgraci();
        console.log('Aleksa');
      })
    } else {
      this.igracservice.Putigraci(form.value.igrac_id, form.value).subscribe(data => {
        this.ResetForm(form);
        this.igracservice.GetIgraci();
      })
    }
  }

}
