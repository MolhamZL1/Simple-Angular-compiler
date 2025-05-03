import { bootstrapApplication,appConfig } from '@angular/platform-browser';
import {c as appConfig}  from './app/app.config';
import * as AppComponent  from './app/app.component';

const y = (x * 2) + (a ? b : c);
bootstrapApplication(AppComponent, appConfig)
  .catch((err) => console.error(err));
