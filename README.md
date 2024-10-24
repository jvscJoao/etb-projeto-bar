
<h1 align="center"> Projet Bar </h1>

**Descrição**  
Este projeto consiste em um sistema de gestão de comandas que permite adicionar produtos a uma comanda e, ao final, optar por realizar o pagamento ou adicionar o valor ao saldo de fiado do cliente. Caso o cliente não esteja cadastrado no sistema, ele será registrado; se já estiver, o sistema verifica eventuais dívidas anteriores e atualiza o saldo com o novo valor da comanda. O objetivo é facilitar o gerenciamento de comandas e saldos a prazo, garantindo uma experiência simples e eficiente tanto para os estabelecimentos quanto para os clientes.

## 🚩 Status

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)

## 🔰 Funcionalidades

- [ ] C.R.U.D Produto: Permite adicionar, alterar, exlucir e listar produtos.
- [ ] Funcionarios: Permite adicionar, alterar e listar funcionarios.

## 🔨 Tecnologias Utilizadas

- **Java 17**: Linguagem principal do projeto.
- **Spring Boot**: Framework utilizado para desenvolvimento rápido e 
- **Maven**: Gerenciador de dependências e automação de builds.
- **H2**: Banco de dados em memória (será usado para testes).
- **PostgreSql**: Principal banco a ser utilizado no projeto.
  
## ✅ Pré-requisitos

Antes de rodar o projeto, certifique-se de ter as seguintes ferramentas instaladas:

- **Java 17** ou superior
- **Maven**: Para compilar e gerenciar o projeto.
- **PostgreSQL ou H2**: para armazenamento de dados

## 💻 Instalação

1. Clone o repositório:
```bash
    git clone https://github.com/jvscJoao/etb-projeto-bar.git
```

2. Navegue até o diretório do projeto:
```bash
    cd seu-repositorio
```

3. Navegue até o diretório do projeto:
```bash
    mvn clean install
```

## 👌 Executando a aplicação

Para executar a aplicação, utilize o seguinte comando:

```bash
    mvn spring-boot:run
```

## 🔑 Dependencias

Aqui estão as principais dependências utilizadas no projeto, conforme especificado no arquivo pom.xml:

 - Spring Boot Starter Web: Para construção de APIs RESTful.
 - Spring Boot Starter Data JPA: Para integração com banco de dados relacional.
 - H2 Database: Banco de dados em memória (ou persistente) para testes.
 - PostgreSQL: Banco de dado que será usado para persistencia de dados do projeto.
