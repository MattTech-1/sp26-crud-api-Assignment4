# Character CRUD API – Spring Boot

Simple REST API for managing character records using Spring Boot, Spring Data JPA, and PostgreSQL.

---

## Requirements

- Java 25
- Maven Wrapper (mvnw or mvnw.cmd)
- VS Code (recommended)

---

## Setup

1. Clone the repository
2. Open the project in VS Code
3. Build the project

### Windows

```cmd
mvnw.cmd clean install
```

### Mac / Linux

```bash
./mvnw clean install
```

---

## Run the Application

1. Open `CurdApiApplication.java`
2. Click **Run → Start Debugging**

The API will run at:

```
http://localhost:8080
```

---

## API Endpoints

Base URL:

```
http://localhost:8080/api/characters
```

---

## Character Fields

- `characterId` (Long, auto-generated)
- `name` (String)
- `description` (String)
- `universe` (String)
- `species` (String)

---

## Endpoints

### Get all characters

```
GET /api/characters
```

### Get character by ID

```
GET /api/characters/{id}
```

Returns:
- `200 OK` if found
- `404 Not Found` if missing

---

### Create character

```
POST /api/characters
```

Example body:

```json
{
   "name": "Samus",
    "role": "Hero",
    "age": 20.0,
    "universe": "Metroid",
    "species": "Human",
    "activeDate": "2026-03-05T05:00:00.000Z",
    "id": 3
}
```

---

### Update character

```
PUT /api/characters/{id}
```

---

### Delete character

```
DELETE /api/characters/{id}
```

Returns:
- `204 No Content`
- `404 Not Found`

---

### Filter by category

```
GET /api/characters/category/{category}?value={value}
```

Supported categories:
- `universe`
- `species`

Invalid category returns:
- `400 Bad Request`

---

### Search by name

```
GET /api/characters/search?name=substring
```

---

## Demo Video

https://uncg-my.sharepoint.com/:v:/g/personal/mdyork3_uncg_edu/IQDMV7jjdOZ3QJhWC-AZUtgeATrmstXefQW8CNTdxlrxttE?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=QOcTce
