







document.getElementById('span_11489777534400').textContent = String(products.length);






(function(){
  const container = document.getElementById('ngfor_11489899524400');
  const __items = productItems\";
  if (!container) return;
  for (let product of (__items || [])) {
    const el = document.createElement('div');
    el.textContent = String(product);
    container.appendChild(el);
  }
})();
var __el = document.getElementById('el_11489910981300');
if(__el){
  __el.src = String(__val(product.images[0]));
}
document.getElementById('span_11489911630400').textContent = String(product.name);
document.getElementById('span_11489911672800').textContent = String(product.price);
(function(){
  const container = document.getElementById('ngfor_11489911732100');
  const __items = Array(product.rating).fill(0);
  if (!container) return;
  for (let item of (__items || [])) {
    const el = document.createElement('div');
    el.textContent = String(item);
    container.appendChild(el);
  }
})();
document.getElementById('span_11489912009300').textContent = String(product.description[0]);
var __el = document.getElementById('el_11489912083700');
if(__el){
  (function(v){ if(typeof v==='string'){ __el.classList.add(...v.split(/\s+/).filter(Boolean)); }
    else if(Array.isArray(v)){ __el.classList.add(...v); }
    else if(v && typeof v==='object'){ for (var k in v){ if(v[k]) __el.classList.add(k); else __el.classList.remove(k);} }
  })("product.availableQty > 0 ? 'btn-primary' : 'btn-secondary'");
}
document.getElementById('el_11489912989500').addEventListener('click', function(event){  try { "selectedProduct = product"; } catch(e) { console.error(e); }});
document.getElementById('span_11489913313900').textContent = String(selectedProduct.name);




(function(){
  var el = document.getElementById('ngif_11489960474700');
  if (!("product !== null") && el) el.style.display = 'none';
})();
(function(){
  const container = document.getElementById('ngfor_11489963922300');
  const __items = product.images;
  if (!container) return;
  for (let image of (__items || [])) {
    const el = document.createElement('div');
    el.textContent = String(image);
    container.appendChild(el);
  }
})();
document.getElementById('el_11489964478700').addEventListener('click', function(event){  try { "selectedImage = image"; } catch(e) { console.error(e); }});
document.getElementById('span_11489964618100').textContent = String(product.name);
(function(){
  const container = document.getElementById('ngfor_11489964702300');
  const __items = Array(product.rating).fill(0);
  if (!container) return;
  for (let item of (__items || [])) {
    const el = document.createElement('div');
    el.textContent = String(item);
    container.appendChild(el);
  }
})();
document.getElementById('span_11489965106700').textContent = String(product.price);
var __el = document.getElementById('el_11489965198400');
if(__el){
  (function(v){ if(typeof v==='string'){ __el.classList.add(...v.split(/\s+/).filter(Boolean)); }
    else if(Array.isArray(v)){ __el.classList.add(...v); }
    else if(v && typeof v==='object'){ for (var k in v){ if(v[k]) __el.classList.add(k); else __el.classList.remove(k);} }
  })("\"
\n                  product.availableQty > 0
\n                    ? 'text-bg-success'
\n                    : 'text-bg-danger'
\n                \"");
}
document.getElementById('span_11489965309300').textContent = String(product.availableQty);


var product = null;
var selectedImage;
var selectedMaterial;
var selectedColor;
console.log()function ngOnInit(){
}
function ngOnChanges(){
this.selectedImagethis.product.images[0]this.selectedColorthis.product.colors[0].idthis.selectedMaterialthis.product.materials[0].id}



var arrayEmitter = {
  __target: null,
  bind: function(el){ this.__target = el; },
  emit: function(value){
    try {
      var tgt = this.__target || document;
      tgt.dispatchEvent(new CustomEvent('arrayEmitter', { detail: value }));
    } catch(e) { console.error(e); }
  }
};
var selectedProduct;
var productItems = [{"id": 1, "name": "Black T-shirt", "images": ["https://nobero.com/cdn/shop/files/black_e4d19185-c19d-4e7c-a14a-8d2a29c7bad3.jpg", "https://i.pinimg.com/736x/8e/90/29/8e9029a8a715269cdf5742eac35894fd.jpg"], "price": 100, "description": ["Comfortable black cotton t-shirt", "Slim fit"], "rating": 4, "materials": [{"id": 1, "name": "Cotton"}, {"id": 2, "name": "Polyester"}, {"id": 3, "name": "Elastane"}], "colors": [{"id": 1, "name": "Black"}, {"id": 2, "name": "Gray"}, {"id": 3, "name": "White"}], "availableQty": 20}, {"id": 2, "name": "White T-shirt", "images": ["https://assets.designhill.com/resize_img.php?atyp=st_page_file&pth=ft_bt_th7igwli_org||BT304112||two_heading_7images_gallery_with_link_image6_img&flp=1577447847-13660527105e05f1a7202e79-89455419.jpg", "https://i.pinimg.com/736x/8e/90/29/8e9029a8a715269cdf5742eac35894fd.jpg"], "price": 120, "description": ["Classic white t-shirt", "Crew neck"], "rating": 5, "materials": [{"id": 1, "name": "Cotton"}, {"id": 2, "name": "Linen"}, {"id": 3, "name": "Spandex"}], "colors": [{"id": 1, "name": "White"}, {"id": 2, "name": "Blue"}, {"id": 3, "name": "Red"}], "availableQty": 0}, {"id": 3, "name": "Gray T-shirt", "images": ["https://img.freepik.com/premium-vector/tshirt-design-new-tshirt-design-modern-tshirt-design-illustratior_955289-2621.jpg", "https://i.pinimg.com/736x/8e/90/29/8e9029a8a715269cdf5742eac35894fd.jpg"], "price": 110, "description": ["Soft gray t-shirt", "Regular fit"], "rating": 3, "materials": [{"id": 1, "name": "Cotton"}, {"id": 2, "name": "Nylon"}, {"id": 3, "name": "Rayon"}], "colors": [{"id": 1, "name": "Gray"}, {"id": 2, "name": "Black"}, {"id": 3, "name": "Green"}], "availableQty": 25}, {"id": 4, "name": "Navy Blue T-shirt", "images": ["https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRV-ReDzCB815-68cShEv-ZOJKa0EcuQOKvvw&s", "https://i.pinimg.com/736x/8e/90/29/8e9029a8a715269cdf5742eac35894fd.jpg"], "price": 105, "description": ["Navy blue t-shirt with pocket", "Casual style"], "rating": 4, "materials": [{"id": 1, "name": "Polyester"}, {"id": 2, "name": "Cotton"}, {"id": 3, "name": "Spandex"}], "colors": [{"id": 1, "name": "Navy"}, {"id": 2, "name": "White"}, {"id": 3, "name": "Black"}], "availableQty": 10}, {"id": 5, "name": "Red T-shirt", "images": ["https://veirdo.in/cdn/shop/files/8_2be593bf-344e-4f3a-8a4b-bed67331917f.jpg?v=1725445401", "https://i.pinimg.com/736x/8e/90/29/8e9029a8a715269cdf5742eac35894fd.jpg"], "price": 130, "description": ["Vibrant red t-shirt", "V-neck"], "rating": 5, "materials": [{"id": 1, "name": "Cotton"}, {"id": 2, "name": "Rayon"}, {"id": 3, "name": "Elastane"}], "colors": [{"id": 1, "name": "Red"}, {"id": 2, "name": "Black"}, {"id": 3, "name": "White"}], "availableQty": 18}, {"id": 6, "name": "Green T-shirt", "images": ["https://urbantheka.in/cdn/shop/files/bandana-white-print-tshirt.jpg?v=1704188069", "https://i.pinimg.com/736x/8e/90/29/8e9029a8a715269cdf5742eac35894fd.jpg"], "price": 115, "description": ["Forest green t-shirt", "Relaxed fit"], "rating": 4, "materials": [{"id": 1, "name": "Cotton"}, {"id": 2, "name": "Spandex"}, {"id": 3, "name": "Polyester"}], "colors": [{"id": 1, "name": "Green"}, {"id": 2, "name": "Black"}, {"id": 3, "name": "White"}], "availableQty": 12}, {"id": 7, "name": "Yellow T-shirt", "images": ["https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYTEL2ADxDJOJlXpicSIHkMXe6S4CwRHYelg&s", "https://i.pinimg.com/736x/8e/90/29/8e9029a8a715269cdf5742eac35894fd.jpg"], "price": 125, "description": ["Bright yellow t-shirt", "Round neck"], "rating": 4, "materials": [{"id": 1, "name": "Linen"}, {"id": 2, "name": "Cotton"}, {"id": 3, "name": "Rayon"}], "colors": [{"id": 1, "name": "Yellow"}, {"id": 2, "name": "Orange"}, {"id": 3, "name": "White"}], "availableQty": 22}];
this.selectedProductthis.productItems[0]
function addToCart(product){
this.arrayEmitter.emit()}

(function(){
  var el = document.getElementById('ngif_11489971600600');
  if (!("products.length > 0") && el) el.style.display = 'none';
})();
(function(){
  const container = document.getElementById('ngfor_11489971693900');
  const __items = products\";
  if (!container) return;
  for (let product of (__items || [])) {
    const el = document.createElement('div');
    el.textContent = String(product);
    container.appendChild(el);
  }
})();
var __el = document.getElementById('el_11489971917800');
if(__el){
  __el.src = String(__val(product.images[0]));
}
document.getElementById('span_11489971975500').textContent = String(product.name);
document.getElementById('el_11489972024600').addEventListener('click', function(event){  try { "changeQuantity(product.id,false)"; } catch(e) { console.error(e); }});


var newItemEvent = {
  __target: null,
  bind: function(el){ this.__target = el; },
  emit: function(value){
    try {
      var tgt = this.__target || document;
      tgt.dispatchEvent(new CustomEvent('newItemEvent', { detail: value }));
    } catch(e) { console.error(e); }
  }
};
var products = [];
var qty = 1;
var total = 0;
function receiveProduct(product){
this.products.some()const isAdded = this.products.some();
if (isAdded) {
window.alert()}
else {
product['qty']product['total']product.pricethis.products.push()this.totalPriceOfCheckout()}
}
function deleteProduct(id){
this.productsthis.products.filter()this.totalPriceOfCheckout()}
function changeQuantity(id, isIncrease){
this.products.find()const product = this.products.find();
if (product) {
product.qtyproduct.qtyif ((product.qty) < (1)){
product.qty}
product.totalproduct.price * product.qtythis.totalPriceOfCheckout()}
}
function totalPriceOfCheckout(){
this.totalthis.products.forEach()}



var title = 'OnlineShoping';

