import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router, RouterModule } from '@angular/router';
import { productsStore } from '../../data/products.store';
import { Product } from '../../models/product';


@Component({
selector: 'app-product-add',
standalone: true,
imports: [CommonModule, RouterModule],
templateUrl: './product-add.component.html',
styleUrl: './product-add.component.css'
})
export class ProductAddComponent {
name = '';
price = 0;
description = '';
imageUrl = '';
router: Router;


constructor(router: Router) {
this.router = router;
}


onName(e: any) { this.name = e && e.target ? e.target.value : ''; }
onPrice(e: any) {
const v = e && e.target ? e.target.value : '0';
const n = Number(v);
this.price = isNaN(n) ? 0 : n;
}
onDesc(e: any) { this.description = e && e.target ? e.target.value : ''; }
onImage(e: any) { this.imageUrl = e && e.target ? e.target.value : ''; }


save(): void {
const newId = Date.now();
const product = new Product(newId, this.name, Number(this.price), this.description, this.imageUrl);
productsStore.push(product);
this.router.navigate(['/products', newId]);
}
}