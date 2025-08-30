import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ActivatedRoute, Router, RouterModule } from '@angular/router';
import { productsStore } from '../../data/products.store';
import { Product } from '../../models/product';


@Component({
selector: 'app-product-detail',
standalone: true,
imports: [CommonModule, RouterModule],
templateUrl: './product-detail.component.html',
styleUrl: './product-detail.component.css'
})
export class ProductDetailComponent {
product: Product = new Product(0, '', 0, '', '');
found = false;
route: ActivatedRoute;
router: Router;


constructor(route: ActivatedRoute, router: Router) {
this.route = route;
this.router = router;


let idParam = '';
if (this.route && this.route.snapshot && this.route.snapshot['params']) {
idParam = this.route.snapshot['params']['id'];
}


const id = idParam ? Number(idParam) : NaN;
const match = productsStore.find((p) => p.id === id);
if (match) {
this.product = match;
this.found = true;
} else {
this.found = false;
}
}
}