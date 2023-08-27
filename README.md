# Odoo Inventory Resupply API

this api is a small demo app to see how a stock resupply
Mobile app might work for a small Mom & Pop's shop using Odoo.

![swaggerui](assets/swagger.png)

## Tools used

- Spring Boot
- Postgres
- Swagger UI / OpenAPI 3.0

## Docker Compose
```yaml
services:
  postgres:
    image: 'postgres:latest'
    environment:
      - 'POSTGRES_DB=mydatabase'
      - 'POSTGRES_PASSWORD=secret'
      - 'POSTGRES_USER=myuser'
    ports:
      - '5432:5432'

  backend:
    image: ghcr.io/josuablejeru/resupply-api:latest
    ports:
      - '8080:8080'
```

## Development

Endpoints:

- [Swagger UI](http://localhost:8080/swagger-ui/index.html)
- [OpenAPI 3.0](http://localhost:8080/v1/docs)
