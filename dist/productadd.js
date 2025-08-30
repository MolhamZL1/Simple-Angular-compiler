




document.getElementById('span_2695141279700').textContent = String(description);


var name = '';
var price = 0;
var description = '';
var imageUrl = '';
var router;
function onName(e){
}
function onPrice(e){
const v = ((e) && (e.target)) ? (e.target.value) : ('0');
const n = Number(v);
}
function onDesc(e){
}
function onImage(e){
}
function save(){
const newId = Date.now();
const product = new Product(newId, this.name, Number(this.price), this.description, this.imageUrl);
}

