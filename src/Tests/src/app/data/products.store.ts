import { Product } from "../models/product";


// Using public image URLs. Replace with your own if you like.
export const productsStore: Product[] = [
new Product(
1,
'Stethoscope',
25.5,
'Basic medical stethoscope.',
'https://picsum.photos/200/300'
),
new Product(
2,
'Thermometer',
9.9,
'Digital thermometer.',
'https://picsum.photos/200/300'
),
new Product(
3,
'Blood Pressure Monitor',
49.0,
'Upper-arm BP monitor.',
'https://picsum.photos/200/300'
)
];