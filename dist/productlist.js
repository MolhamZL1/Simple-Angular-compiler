

document.getElementById('span_2687968457400').textContent = String(p1.name);
document.getElementById('span_2687973986600').textContent = String(p1.price);
document.getElementById('span_2687974196400').textContent = String(p2.name);
document.getElementById('span_2687974235300').textContent = String(p2.price);
document.getElementById('span_2687974386000').textContent = String(p3.name);
document.getElementById('span_2687974494200').textContent = String(p3.price);


var products = productsStore;
var p1 = ((productsStore.length) > (0)) ? (productsStore[0]) : ({name: '', price: 0, imageUrl: '', id: 0});
var p2 = ((productsStore.length) > (1)) ? (productsStore[1]) : ({name: '', price: 0, imageUrl: '', id: 0});
var p3 = ((productsStore.length) > (2)) ? (productsStore[2]) : ({name: '', price: 0, imageUrl: '', id: 0});

