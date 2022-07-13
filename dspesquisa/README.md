<p align="center">
  <a href="https://dspesquisa-anabalves.netlify.app/">
    <img src="./.github/logo.svg" height="150" width="175" alt="Logo da DS Pesquisa" />
  </a>
</p>

<h1 align="center">DSPesquisa - Big Game Survey</h1>

# 📖 Sobre

[Big Game Survey](https://dspesquisa-anabalves.netlify.app/) é uma aplicação construída durante a Semana Spring React organizada pela DevSuperior.

A aplicação consiste em uma pesquisa de preferência de jogos, os dados são coletados via app mobile e depois listados na aplicação web, que possui uma dashboard com gráficos baseados nesses dados.

Durante o desenvolvimento foi criada uma API com três métodos:

- GET /games: retorna todos os games disponíveis para votação;
- GET /records: retorna todos os registros de votação;
- POST /records: cria um novo voto;

<p align="center">
  <img alt="Demonstração web" src="./.github/web.gif">
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
- React Native
- Apex Charts
- Expo
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

# Layouts

## 📱 Layout Mobile

<p align="center">
  <img alt="Layout Mobile" src="./.github/layout-mobile-1.png">
  <img alt="Layout Mobile" src="./.github/layout-mobile-2.png">
  <img alt="Layout Mobile" src="./.github/layout-mobile-3.png">
</p>

## 💻 Layout Web

<p align="center">
  <img alt="Layout Web" src="./.github/layout-web-1.png">
  <img alt="Layout Web" src="./.github/layout-web-2.png">
  <img alt="Layout Web" src="./.github/layout-web-3.png">
</p>

# Backend

<p align="center">
  <img alt="Requisições API Via Postman" src="./.github/postman.gif">
</p>

[Swagger](https://dspesquisa-anabalves.herokuapp.com/swagger-ui/)

# Como executar o projeto

## Backend
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/anabalves/full-stack-projects

# entrar na pasta do projeto dspesquisa
cd dspesquisa

# entrar na pasta do projeto backend
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front web
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/anabalves/full-stack-projects

# entrar na pasta do projeto dspesquisa
cd dspesquisa

# entrar na pasta do projeto front web
cd front-web

# instalar dependências
yarn install

# executar o projeto
npm start
```

## Front mobile
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/anabalves/full-stack-projects

# entrar na pasta do projeto dspesquisa
cd dspesquisa

# entrar na pasta do projeto front mobile
cd front-mobile

# instalar dependências
yarn install

# executar o projeto
npm start

# abrir a url disponibilizada no console no celular
```


Feito por Ana Beatriz com ensinamentos da escola DevSuperior!