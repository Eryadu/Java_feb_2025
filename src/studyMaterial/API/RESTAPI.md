## REST API (Representational State Transfer API) is a widely used architectural style for designing networked 
   applications. It relies on a stateless, client-server communication model, where clients interact with resources 
   (data or services) on a server using standard HTTP methods (GET, POST, PUT, DELETE, etc.). REST APIs are simple, 
   scalable, and widely adopted for building web services.

## API basically a two set of systems
## Def : REST API Specially its built on HTML method like (GET, POST, PUT, DELETE, etc.) and it is based on client-server 
   communication model, where clients interact with resources(data or services) on a server using standard HTTP methods
   Example of API. Google Map api, payment system , weather map, Yahoo api
   sky-scanner , online e-commerce app ,zomato, uber, skip-the-dishes.

## Key Principles of REST APIs:
1. Stateless:Each request from the client to the server must contain all the information needed to understand and process 
   the request.
   --The server does not store any client context between requests (Client-Server).
2. Client-Server Architecture:The client and server are separate entities that communicate over HTTP.
   -- The client is responsible for the user interface, while the server handles data storage and business logic.
3. Uniform Interface:REST APIs use a consistent and standardized way to interact with resources.
   This includes:
   -- Resource identification (via URIs/URLs).
   -- Resource manipulation (via HTTP methods).
   -- Self-descriptive messages (via HTTP headers and status codes/ HTTP Response Code).
4. Resource-Based:Everything in a REST API is treated as a resource (e.g., users, products, orders).
   Resources are identified by URIs (Uniform Resource Identifiers), such as:
   https://api.example.com/users
   https://api.example.com/products/123
5. HTTP Methods:
   REST APIs use standard HTTP methods to perform CRUD (Create, Read, Update, Delete) operations on resources:
   GET: Retrieve a resource or a list of resources.
   POST: Create a new resource.
   PUT: Update an existing resource.
   DELETE: Remove a resource.
   PATCH: Partially update a resource.
6. Stateless Communication:Each request is independent, and the server does not store any session data about the client.
   Authentication is typically handled using tokens (e.g., JWT) or API keys.
7. Representation:Resources can be represented in different formats, such as JSON, XML, or HTML.
   JSON (JavaScript Object Notation) is the most commonly used format due to its simplicity and readability.

## Breakage of URL
## https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}

-- https://api.openweathermap.org          - Base URL
-- data/2.5/weather                        - ENDPOINT (Resource)
-- lat={lat}&lon={lon}&appid={API key}     - Query Parameter

## How REST APIs Work:
   A client sends an HTTP request to a specific URL (endpoint) on the server.
   The server processes the request and performs the required action (e.g., retrieving data, updating a resource).
   The server sends back an HTTP response, typically containing HTTP Response Code:
   A status code (e.g., 200 for success, 404 for not found).
   Data in a specific format (e.g., JSON).

## Example of a REST API: Let’s say you have a REST API for managing users in a system:
Endpoints:
GET /users → Retrieve a list of all users.
GET /users/{id} → Retrieve details of a specific user.
POST /users → Create a new user.
PUT /users/{id} → Update an existing user.
DELETE /users/{id} → Delete a user.

## Key Components of REST APIs:
-- Endpoints:URLs that represent resources (e.g., /users, /products).
-- HTTP Methods (GET, POST, PUT, PATCH):Define the action to be performed on the resource.
-- Headers:Provide metadata about the request or response (e.g., Content-Type: application/json).
-- Status Codes:Indicate the result of the request:
   2xx: Success (e.g., 200 OK, 201 Created).
   3xx: Redirection (e.g., 301 Moved Permanently).
   4xx: Client errors (e.g., 400 Bad Request, 404 Not Found).
   5xx: Server errors (e.g., 500 Internal Server Error).
## https://www.restapitutorial.com/introduction/httpmethods // for HTTP Response Code
   https://www.w3schools.com/tags/ref_httpmessages.asp // for HTTP Response Code
-- Request/Response Body:Contains the data being sent or received (usually in JSON format).

## Benefits of REST APIs:
-- Simplicity:Easy to understand and use, leveraging standard HTTP protocols.
-- Scalability:Stateless nature allows for easy scaling of services.
-- Flexibility:Can be used with any programming language or platform.
-- Separation of Concerns:Clear separation between client and server responsibilities.
-- Wide Adoption:Supported by almost all modern frameworks and tools.

## Challenges of REST APIs:
-- Over-fetching or Under-fetching:Clients may receive more or less data than needed.
-- Latency:Multiple requests may be required to fetch related data.
-- Versioning:Managing changes to the API without breaking existing clients.
-- Security:Requires proper authentication and authorization mechanisms (e.g., OAuth, JWT).

## REST API vs. Other API Styles:
Feature                 	REST API	            SOAP	                     GraphQL
Protocol	               HTTP/HTTPS	          HTTP, SMTP, etc.	           HTTP/HTTPS
Data Format	                JSON, XML	             XML	                     JSON
Flexibility	                Moderate	            Rigid	                     High
Performance	                  Good	            Slower (due to XML)	           High (queries are optimized)
Use Case	    General-purpose web services	Enterprise-level services	  Complex queries and relationships

## Tools for Working with REST APIs:
-- Testing Tools:
   Postman, Insomnia, cURL, Bruno.
-- Documentation Tools:
   Swagger/OpenAPI, API Blueprint.
-- Frameworks:
   Express.js (Node.js), Django REST Framework (Python), Spring Boot (Java).

## In summary, REST APIs are a simple, scalable, and widely used way to build web services. They are ideal for modern 
   applications due to their flexibility, statelessness, and ease of use.
   
