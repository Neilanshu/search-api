# **Search API**

This project is a Spring Boot-based Search API for Makersharks. It allows buyers to search for manufacturers based on customized requirements, such as location, nature of business, and manufacturing processes. The API includes features like input validation, pagination, exception handling, and security practices.

## **Table of Contents**

- [Project Overview](#project-overview)
- [Installation](#installation)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Configuration](#configuration)
- [Testing](#testing)

## **Project Overview**

The Search API for Makersharks provides a flexible and secure way to search for manufacturers. It is designed to handle various queries efficiently and return relevant results based on user input.

## **Installation**

1. **Clone the repository:**

    ```bash
    git clone https://github.com/Neilanshu/search-api.git
    ```

2. **Navigate to the project directory:**

    ```bash
    cd search-api
    ```

3. **Build the project:**

    Using Maven:
    ```bash
    ./mvnw clean install
    ```

    Using Gradle:
    ```bash
    ./gradlew build
    ```

4. **Run the application:**

    Using Maven:
    ```bash
    ./mvnw spring-boot:run
    ```

    Using Gradle:
    ```bash
    ./gradlew bootRun
    ```

    The application will start on `http://localhost:8080`.

## **Usage**

### **Running the API**

Once the application is running, you can access the API endpoints using a tool like Postman or cURL.

### **Example POST Request**

To search for manufacturers, you can send a POST request to the `/manufacturers/search` endpoint:

**cURL Command:**

```bash
curl -X POST "http://localhost:8080/manufacturers/search" \
-H "Content-Type: application/json" \
-d '{
  "location": "New York",
  "nature_of_business": "Automotive",
  "manufacturing_processes": ["CNC machining", "Injection molding"]
}'
```

**Response Example:**

```json
{
  "manufacturers": [
    {
      "supplier_id": "123",
      "company_name": "ABC Manufacturing",
      "website": "http://www.abcmfg.com",
      "location": "New York",
      "nature_of_business": "Automotive",
      "manufacturing_processes": ["CNC machining", "Injection molding"]
    }
  ]
}
```

## **Endpoints**

### **`/manufacturers/search` - POST**

**Description:** Retrieve a list of manufacturers based on location, nature of business, and manufacturing processes.

**Request URL:**

```bash
http://localhost:8080/manufacturers/search
```

**Request Body:**

```json
{
  "location": "string",
  "nature_of_business": "string",
  "manufacturing_processes": ["string"]
}
```

**Parameters:**
- `location`: (Optional) String - The location to search in.
- `nature_of_business`: (Optional) String - The nature of business.
- `manufacturing_processes`: (Optional) List of Strings - The manufacturing processes.

**Response:**

Returns a list of manufacturers that match the criteria.

**Response Example:**

```json
[
  {
    "supplier_id": "string",
    "company_name": "string",
    "website": "string",
    "location": "string",
    "nature_of_business": "string",
    "manufacturing_processes": ["string"]
  }
]
```

## **Configuration**

Configuration settings can be found in `src/main/resources/application.properties`. Modify these settings as needed for your environment.

## **Testing**

To run tests, use the following command:

Using Maven:
```bash
./mvnw test
```

Using Gradle:
```bash
./gradlew test
```
