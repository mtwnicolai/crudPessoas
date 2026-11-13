
# CRUD Pessoas

API REST desenvolvida em Java com Spring Boot para gerenciamento de pessoas, permitindo realizar operações de cadastro, consulta, atualização e exclusão de registros.

O projeto foi criado com o objetivo de praticar o desenvolvimento de APIs REST, persistência de dados e organização de aplicações utilizando o ecossistema Spring.

## Tecnologias

- Java 21
- Spring Boot 4.1.2
- Spring Data JPA
- PostgreSQL
- Maven

## Funcionalidades

- Cadastro de pessoas
- Listagem de registros
- Consulta de pessoas
- Atualização de informações
- Exclusão de registros
- Persistência de dados em PostgreSQL

## Endpoints

A API utiliza apenas a rota base `/pessoas`.
| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/pessoas` | Lista as pessoas cadastradas |
| GET | `/pessoas/{id}` | Consulta uma pessoa pelo ID |
| POST | `/pessoas` | Cadastra uma nova pessoa |
| PUT | `/pessoas/{id}` | Atualiza os dados de uma pessoa |
| DELETE | `/pessoas/{id}` | Remove uma pessoa |

## Executando o projeto

### Pré-requisitos

- Java 21
- PostgreSQL

### Configuração

Configure as seguintes variáveis de ambiente:

```env
DATABASE_URL=jdbc:postgresql://localhost:5432/pessoas
DATABASE_USER=postgres
DATABASE_PASSWORD=sua_senha
```

### Inicialização

Clone o repositório:

```bash
git clone https://github.com/mtwnicolai/crudPessoas.git
cd crudPessoas
```

Execute a aplicação utilizando o Maven Wrapper:

**Windows:**
```bash
.\mvnw.cmd spring-boot:run
```

**Linux/macOS:**
```bash
./mvnw spring-boot:run
```

Por padrão, a API estará disponível em:

`http://localhost:8080`

## Objetivo

Este repositório faz parte dos meus estudos em desenvolvimento backend com Java, com foco em APIs REST, integração com bancos de dados relacionais e boas práticas de desenvolvimento.

## Autor

Desenvolvido por [Matheus Nicolai](https://github.com/mtwnicolai).
