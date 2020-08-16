import { Component, OnInit } from '@angular/core';
import { IgracService } from './deljeno-igraci/igrac.service';

@Component({
  selector: 'app-igraci',
  templateUrl: './igraci.component.html',
  styleUrls: ['./igraci.component.css']
})
export class IgraciComponent implements OnInit {

  constructor(public igracservice : IgracService) { }

  ngOnInit() {
  }

}
