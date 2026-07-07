# Documentación API - Ecommerce

API REST desarrollada con Spring Boot para la gestión de **Artículos** y **Clientes**. Devuelve y recibe datos en formato **JSON**.

**Base URL:** `http://localhost:8080`

---

## Artículos

Endpoints para gestionar los productos del catálogo.

| Método | Endpoint             | Descripción                     |
| ------ | -------------------- | ------------------------------- |
| GET    | `/api/products`      | Lista todos los artículos       |
| GET    | `/api/products/{id}` | Obtiene un artículo por su ID   |
| POST   | `/api/products`      | Crea un nuevo artículo          |
| PUT    | `/api/products/{id}` | Actualiza un artículo existente |
| DELETE | `/api/products/{id}` | Elimina un artículo por su ID   |

### Modelo `Articulo`

```json
{
  "id": 1,
  "nombre": "Cuaderno",
  "precio": 1500.0,
  "descripcion": "Tapa dura A4"
}
```

### Ejemplos

**GET** `/api/products`
Devuelve un array con todos los artículos registrados.

**GET** `/api/products/1`
Devuelve el artículo con `id = 1`. Si no existe, responde `404 Not Found`.

**POST** `/api/products`
Body (raw JSON):

```json
{
  "nombre": "Cuaderno",
  "precio": 1500.0,
  "descripcion": "Tapa dura A4"
}
```

Respuesta: `201 Created` + el artículo creado (con su `id` asignado).

**PUT** `/api/products/1`
Body (raw JSON):

```json
{
  "nombre": "Cuaderno Actualizado",
  "precio": 1800.0,
  "descripcion": "Tapa dura A4"
}
```

Respuesta: `200 OK` + el artículo actualizado.

**DELETE** `/api/products/1`
Elimina el artículo.

---

## Clientes

Endpoints para gestionar los clientes registrados. Funciona con la misma lógica que Artículos.

| Método | Endpoint            | Descripción                    |
| ------ | ------------------- | ------------------------------ |
| GET    | `/api/clients`      | Lista todos los clientes       |
| GET    | `/api/clients/{id}` | Obtiene un cliente por su ID   |
| POST   | `/api/clients`      | Crea un nuevo cliente          |
| PUT    | `/api/clients/{id}` | Actualiza un cliente existente |
| DELETE | `/api/clients/{id}` | Elimina un cliente por su ID   |

### Modelo `Cliente`

```json
{
  "id": 1,
  "nombre": "Juan Pérez",
  "email": "juan.perez@mail.com",
  "dni": "1122334455"
}
```

### Ejemplos

**GET** `/api/clients`
Devuelve un array con todos los clientes registrados.

**GET** `/api/clients/1`
Devuelve el cliente con `id = 1`. Si no existe, responde `404 Not Found`.

**POST** `/api/clients`
Body (raw JSON):

```json
{
  "nombre": "Juan Pérez",
  "email": "juan.perez@mail.com",
  "dni": "11223344"
}
```

Respuesta: `201 Created` + el cliente creado (con su `id` asignado).

**PUT** `/api/clients/1`
Body (raw JSON):

```json
{
  "nombre": "Juan Pérez Actualizado",
  "email": "juan.perez@mail.com",
  "dni": "11334455"
}
```

Respuesta: `200 OK` + el cliente actualizado.

**DELETE** `/api/clients/1`
Elimina el cliente.

---
