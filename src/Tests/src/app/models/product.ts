export class Product {
id: number;
name: string;
price: number;
description: string;
imageUrl: string; // URL string (not optional)


constructor(id: number, name: string, price: number, description: string, imageUrl: string) {
this.id = id;
this.name = name;
this.price = price;
this.description = description;
this.imageUrl = imageUrl;
}
}