import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ButtonModule } from 'primeng/button';
import {ImageModule} from 'primeng/image';
import {DropdownModule} from 'primeng/dropdown';
import {FormControl, FormGroup, FormsModule, NgForm} from "@angular/forms";
import { AppService } from './app.service';
import { Subscription } from 'rxjs';
import { CompensatingActivity } from './models/CompensatingActivity';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    FormsModule,
    ButtonModule,
    ImageModule,
    DropdownModule
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'karbonApp';
  private subscription: Subscription = new Subscription();
  protected compensatingActivites: CompensatingActivity[] = [];
  constructor(private appService: AppService){}
  onSubmit(f:NgForm):void{
    this.subscription = this.appService.sendActivity(f).subscribe((data:any) => {
      this.appService.getCompensations(data).subscribe(data => this.compensatingActivites = data)
    });
  }
}
