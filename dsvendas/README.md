<p align="center">
  <a href="https://dsvendas-anabalves.netlify.app/">
    <img src="./.github/logo.svg" height="150" width="175" alt="Logo da DS Vendas" />
  </a>
</p>

<h1 align="center">DSVendas</h1>

# 📖 Sobre

[DSVendas](https://dsvendas-anabalves.netlify.app/) é uma aplicação construída durante a Semana Spring React organizada pela DevSuperior.

A aplicação consiste em exibir uma Dashboard contendo informações sobre as vendas realizadas por um time de vendedores. Essas informações são obtidas a partir de dados fornecidos por um Backend construído com Spring Boot.

Durante o desenvolvimento foi criada uma API com quatros métodos:

- GET /sellers: retorna todos os vendedores;
- GET /sales: retorna todos as vendas;
- GET /sales/amount-by-seller: retorna a soma das vendas por vendedor;
- GET /sales/success-by-seller: retorna informações de sucesso de vendas agrupados por vendedor.

<p align="center">
  <img alt="Demonstração web" src="./.github/desktop.gif">
  <img alt="Demonstração mobile" src="./.github/mobile.gif">
</p>

# 🚀 Tecnologias e Ferramentas

Esse projeto foi desenvolvido com as seguintes tecnologias e ferramentas:

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- HTML / CSS / JavaScript / TypeScript
- ReactJS
- Apex Charts
- Heroku
- Netlify
- PostgreSQL
- Postman
- Visual Studio Code
- IntelliJ IDEA
- Git

# 🎲 Modelo Conceitual

<p align="center">
  <img alt="Modelo Conceitual" src="./.github/mc.png" width="1000px">
</p>

# Padrão camadas adotado
<p align="center">
  <img alt="Camadas Projeto" src="./.github/camadas.png" width="1000px">
</p>

# 📱 Layout

<p align="center">
  <img alt="Layout Web" src="./.github/dsvendas-home.png">
  <img alt="Layout Web" src="./.github/dsvendas-dashboard.png">
</p>

# Backend

[Swagger](https://dsvendas-anabalves.herokuapp.com/swagger-ui/)

# Como executar o projeto

## Backend
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/anabalves/full-stack-projects

# entrar na pasta do projeto dsvendas
cd dsvendas

# entrar na pasta do projeto backend
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Frontend
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/anabalves/full-stack-projects

# entrar na pasta do projeto dsvendas
cd dsvendas

# entrar na pasta do projeto frontend
cd frontend

# instalar dependências
yarn install

# executar o projeto
npm start
```

Feito por Ana Beatriz com ensinamentos da escola DevSuperior!
