const routes = {'/' : 'productlist.html','/products/:id' : 'productdetail.html','/add' : 'productadd.html',};

function setActive(path){
  document.querySelectorAll("a[href^='#']").forEach(a=>{
    a.classList.toggle("active", a.getAttribute("href") === "#" + path);
  });
}
async function render(){
  const path = location.hash.slice(1) || "/";
  const file = routes[path];
  const outlet = document.getElementById("outlet");

  setActive(path);

  if (file) {
    try {
      const html = await fetch(file).then(r=>r.text());
      outlet.innerHTML = html;
    } catch (e) {
      outlet.innerHTML = "<h2>خطأ</h2><p>Couldn't Open this Page</p>";
    }
  } else {
    outlet.innerHTML = "<h2>404</h2><p>Not Fount</p>";
  }
}

window.addEventListener("load", render);
window.addEventListener("hashchange", render);
