# SDS6 - DSMovie

DSMovie é uma aplicação construída durante a 6ª edição da Semana Spring React organizada pela DevSuperior.

A aplicação consiste em um catalogo com avaliação de filmes/séries.

<p align="center">
  <img alt="Demonstração web" src="./.github/web.gif">
</p>

---

## 🚀 Tecnologias e Ferramentas

Esse projeto foi desenvolvido com as seguintes tecnologias e ferramentas:

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- HTML / CSS / JavaScript / TypeScript
- ReactJS
- Bootstrap
- Heroku
- Netlify
- PostgreSQL
- Postman
- Visual Studio Code
- Eclipse
- Spring Tool Suite
- Git

---

### Modelo Conceitual

<p align="center">
  <img alt="Modelo Conceitual" src="./.github/sds6-mc.png" width="1000px">
</p>

---

### Layout Web

<p align="center">
  <img alt="Layout Web" src="./.github/layout-web-1.png">
  <img alt="Layout Web" src="./.github/layout-web-2.png">
</p>

---

### Backend

<p align="center">
  <img alt="Requisições API Via Postman" src="./.github/postman.gif">
</p>

[Get All movies](https://sds6-anabalves.herokuapp.com/movies)

``` 
 Parâmetros:

 page -> Passa para a consulta o número da página a ser navegada
 size -> Passa para a consulta o seu respectivo tamanho (quantidade de registros)
 sort -> Indica qual dos campos da entidade vão ser utilizados como referência para ordenação 
 ```

 Exemplos:
 [{{host}}/movies?page=0](https://sds6-anabalves.herokuapp.com/movies?page=0)
 [{{host}}/movies?size=10](https://sds6-anabalves.herokuapp.com/movies?size=10)
 [{{host}}/movies?sort=score,desc](https://sds6-anabalves.herokuapp.com/movies?sort=score,desc)
 [{{host}}/movies?page=0&size=10](https://sds6-anabalves.herokuapp.com/movies?page=0&size=10)
 [{{host}}/movies?size=10&sort=score,desc](https://sds6-anabalves.herokuapp.com/movies?size=10&sort=score,desc)
 [{{host}}/movies?page=0&size=10&sort=score,desc](https://sds6-anabalves.herokuapp.com/movies?page=0&size=10&sort=score,desc)

``` 
 Vale ressaltar um detalhe importante é que a primeira pagina começa do zero não do 1
 ```

[Get Movie By Id](https://sds6-anabalves.herokuapp.com/movies/1)
``` 
 {{host}}/movies/{id}
 ```

[Put Score](https://sds6-anabalves.herokuapp.com/scores)

> A extensão [JSON Viewer](https://chrome.google.com/webstore/detail/json-viewer/gbmdgpbipfallnflgajpaliibnhdgobh/related?hl=pt-BR) proporciona uma experiência mais agradável para visualizar os dados

---

Feito por Ana Beatriz com ensinamentos da escola DevSuperior!
