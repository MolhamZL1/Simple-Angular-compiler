# Angular-to-HTML/JS Compiler

## Overview
This project is a custom **Angular-like compiler** built from scratch using **ANTLR** and **Java**.  
The compiler takes Angular-style source code (TypeScript + HTML templates) as input and generates clean, standalone **HTML** and **JavaScript** files as output.  

It implements the full compilation pipeline:
1. **Lexical Analysis** – using a custom AngularLexer.  
2. **Parsing** – using AngularParser with grammar rules for components, classes, decorators, and templates.  
3. **AST Construction** – building a structured Abstract Syntax Tree (AST) with typed nodes.  
4. **Semantic Analysis** – including symbol tables and scope management to detect semantic errors.  
5. **Code Generation** – each AST node implements a `codeGenerate()` method to produce the final HTML/JS via a `CodeResult` pattern.  

---

## Features
- ✅ Custom **ANTLR grammar** for Angular (components, imports, decorators, templates).  
- ✅ **Symbol Table** with nested scopes for semantic checks.  
- ✅ Code generation into **separate HTML and JS files**.  
- ✅ Support for Angular decorators like `@Component`.  
- ✅ Modular design with `FileManager`, `LogHandler`, and `CodeResult`.  

---

## Example

### Input
```ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-hello',
  template: `<h1>Hello, {{ name }}</h1>`
})
class HelloComponent {
  name: string = "World";
}
```

### Output

**hello.html**
```html
<h1>Hello, {{ name }}</h1>
```

**hello.js**
```js
class HelloComponent {
  constructor() {
    this.name = "World";
  }
}
```

---

## How to Run
1. Clone this repo:
   ```bash
   git clone https://github.com/your-username/angular-compiler.git
   cd angular-compiler
   ```
2. Build with Maven/Gradle (depending on your setup).  
3. Run the compiler on an Angular file:
   ```bash
   java -jar compiler.jar examples/hello.ts
   ```
4. Generated HTML/JS will be placed in the `dist/` folder.  

---

## Future Work
- [ ] Support Angular routing.  
- [ ] Add advanced semantic error checks.  
- [ ] Optimize generated code for performance.  
- [ ] Expand template engine features (loops, conditionals).  

---

## License
This project is licensed under the MIT License.  
Feel free to use, modify, and distribute.  

---

## Author
👤 **Molham Al-Sheikh Ali**
