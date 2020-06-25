import { Component, OnInit } from '@angular/core';
import { TimService } from '../deljeno-timovi/tim.service';
import { NgForm } from '@angular/forms';
import { NullTemplateVisitor } from '@angular/compiler';

@Component({
  selector: 'app-tim',
  templateUrl: './tim.component.html',
  styleUrls: ['./tim.component.css']
})
export class TimComponent implements OnInit {

  constructor(public timservice : TimService) { }

  ngOnInit() {
    this.ResetForm();
  }

  ResetForm(form? : NgForm) {
    if(form != null)form.reset();
    this.timservice.OdabraniTimovi = {
      tim_id : null,
      tim_ime : '',
      tim_osnovan : null,
      tim_trener : '',
    }
  }

  OnSubmit(form : NgForm) {
    if(form.value.tim_id == null) {
      this.timservice.Posttimovi(form.value).subscribe(data => {
        this.ResetForm(form);
        this.timservice.GetTimovi();
      })
    } else {
      this.timservice.Puttimovi(form.value.tim_id, form.value).subscribe(data => {
        this.ResetForm(form);
        this.timservice.GetTimovi();
      })
    }
  }
}
