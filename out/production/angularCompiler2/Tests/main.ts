import { bootstrapApplication,appConfig } from '@angular/platform-browser';
import {c as appConfig}  from './app/app.config';
import * as AppComponent  from './app/app.component';
import {HeaderComponent} from "./app/components/header/header.component";

@Component({
    selector: 'app-root',
    standalone: true,
    imports: [RouterOutlet,HeaderComponent],
    templateUrl: './app.component.html',
    styleUrl: './app.component.css'
})