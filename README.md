# ejemplo_microservicios

### 1. Up locally
```bash
cd emp_control_backend

.\mvnw clean package -e -DskipTests

cd ..

docker compose -f .docker/docker-compose.yml up -d --build

```

### 2. Down locally
```bash
docker compose -f .docker/docker-compose.yml down
```