# WebSpringJPA 🚀

Este é um projeto simples em Java utilizando **Spring Boot** e **JPA (Java Persistence API)**. Ele demonstra a criação de um sistema backend com funcionalidades básicas de CRUD (Create, Read, Update, Delete) para gerenciar entidades, conectando-se a um banco de dados relacional.

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **H2 Database** (banco de dados em memória para testes)
- **Maven**
![Captura de tela 2024-12-13 234805](https://github.com/user-attachments/assets/2619974e-c695-4474-bc6f-355cec6b97c0)

## ✨ Funcionalidades

1. Gerenciamento de Entidades:
   - Listar todas as entidades.
   - Buscar uma entidade pelo ID.
   - Criar uma nova entidade.
   - Atualizar uma entidade existente.
   - Deletar uma entidade pelo ID.

2. **APIs RESTful**:
   - Endpoints disponíveis para todas as operações CRUD.

3. **Banco de Dados H2**:
   - A aplicação utiliza um banco de dados em memória (H2) para testes, com uma interface web acessível em `http://localhost:8080/h2-console`.

## 📂 Estrutura do Projeto

```plaintext
src/main/java
 ├── com.example.webspringjpa
 │   ├── controller
 │   ├── service
 │   ├── repository
 │   └── entity
```

- **Controller**: Define os endpoints da API.
- **Service**: Contém a lógica de negócios.
- **Repository**: Interface para acesso ao banco de dados.
- **Entity**: Representa as tabelas do banco de dados.

## 🔍 Diagramas do Projeto

### Domain Model 📋
![Captura de tela 2024-12-13 234827](https://github.com/user-attachments/assets/13315fb1-6ebc-4f09-bf99-06b2d99bd5cd)

### Domain Instance 🛠️
![Captura de tela 2024-12-13 234915](https://github.com/user-attachments/assets/4ab05f3a-caf3-4745-8194-4a3f4aa956d6)

### Logical Layers 🏗️
![Captura de tela 2024-12-13 234947](https://github.com/user-attachments/assets/24524171-e8cb-4fea-85da-d25f656d0aff)

## 🚀 Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/eduardomoraesduarte/WebSpringJPA.git
   cd WebSpringJPA
   ```

2. Configure o ambiente:
   - Certifique-se de ter o **JDK 17** e o **Maven** instalados.

3. Compile e execute o projeto:

   ```bash
   mvn spring-boot:run
   ```

4. Acesse os endpoints da API em `http://localhost:8080`.

## 📖 Endpoints Principais

| Método HTTP | Endpoint         | Descrição                     |
|-------------|------------------|-------------------------------|
| GET         | `/entities`      | Listar todas as entidades     |
| GET         | `/entities/{id}` | Buscar uma entidade pelo ID   |
| POST        | `/entities`      | Criar uma nova entidade       |
| PUT         | `/entities/{id}` | Atualizar uma entidade        |
| DELETE      | `/entities/{id}` | Deletar uma entidade pelo ID  |

## 📬 Contato

[Eduardo Moraes Duarte](https://github.com/eduardomoraesduarte)
