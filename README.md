<h1 align="center">
  TODO List
</h1>

API para gerenciar tarefas (CRUD) que faz
parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para pessoas desenvolvedoras
backend júnior, que se candidataram para a Simplify.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [PostgreSQL](https://www.postgresql.org/download/)
- [MapStruct](https://mapstruct.org/documentation/installation/)

## Práticas adotadas

- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Conversão de Entity para DTO.

## Como executar o projeto

- Clonar repositório do git
- Construir o projeto:

```
$ ./mvnw clean package
```

- Executar a aplicação:

```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [Postman](https://www.postman.com/downloads/):

- Criar uma tarefa

```
POST: http://localhost:8080/todo

{
    "name": "Teste 1",
    "description": Teste primeira requisição,
    "accomplished": true,
    "priority": "Alta"
}

```

- Listar todas as tarefas
```
GET: http://localhost:8080/

[
  }
      "id": 2,
      "name": "Teste 2",
      "description": "Teste segunda requisição",
      "accomplished": true,
      "priority": "Média"
  },
  {
      "id": 3,
      "name": "Teste 3",
      "description": "Teste terceira requisição",
      "accomplished": true,
      "priority": "Alta"
  },
]
```
- Listar uma tarefa
```
GET: http://localhost:8080/todo/1
{
    "id": 1,
    "name": "Teste 1",
    "description": "Teste primeira requisição",
    "accomplished": false,
    "priority": "Média"
}
```

- Atualizar Tarefa

```
PUT:  http://localhost:8080/todo/1

{
    "id": 1,
    "name": "Teste 1",
    "description": "Teste primeira requisição",
    "accomplished": false,
    "priority": "Média"
}
```

- Remover Tarefa

```
DELETE: http://localhost:8080/todo/1

[ ]
```