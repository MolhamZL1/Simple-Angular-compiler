// تعريف البيانات (حمّله قبل routes.js و index.js)
class Product {
  constructor(id, name, price, description, imageUrl) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.description = description;
    this.imageUrl = imageUrl;
  }
}

const productsStore = [
  new Product(
    1,
    "Stethoscope",
    25.5,
    "Basic medical stethoscope.",
    "https://picsum.photos/400/300?1"
  ),
  new Product(
    2,
    "Thermometer",
    9.9,
    "Digital thermometer.",
    "https://picsum.photos/400/300?2"
  ),
  new Product(
    3,
    "Blood Pressure Monitor",
    49.0,
    "Upper-arm BP monitor.",
    "https://picsum.photos/400/300?3"
  ),
];

// (اختياري) توفّرهم صراحةً لباقي الملفات
window.Product = Product;
window.productsStore = productsStore;
