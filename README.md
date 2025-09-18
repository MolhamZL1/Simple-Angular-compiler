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

## Project Structure
