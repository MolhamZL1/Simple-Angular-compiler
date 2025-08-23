import { Component } from '@angular/core';
import { productsStore } from '../../data/products.store';


@Component({
selector: 'app-product-list',
templateUrl: './product-list.component.html',
styleUrl: './product-list.component.css'
})
export class ProductListComponent {
products: any = productsStore;
p1: any = productsStore.length > 0 ? productsStore[0] : { name: '', price: 0, imageUrl: '', id: 0 };
p2: any = productsStore.length > 1 ? productsStore[1] : { name: '', price: 0, imageUrl: '', id: 0 };
p3: any = productsStore.length > 2 ? productsStore[2] : { name: '', price: 0, imageUrl: '', id: 0 };
}