## API
Application Programming Interface.
communication between two systems/apps
UI - User Interface

-- set of rules that allows two software applications/ systems communicate with each other.

Web API -- Rest API, SOAP, Graph QL, gRPC
Libraries API -- Collective API

##REST APIs (Representational State Transfer) -- Web Services

build on the Top of HTTP

1. Stateless
2. Client Server architecture
3. Resource Bases
4. Caching
5. HTTP Methods
6. Layered System
7. Uniform System

## Put and PATCH are for update
Put -- you have to update the whole resource
{
"Name" : "yadav"
"Email ID" : "yad@gmail.com"
"Contact" : "1234"
}

PATCH -- to update one part
{
"Name" : "Yadav"
}

Put - update a resource, complete object should be passed like  name email phone
vs
PATCH - just pass the part like email

## How to break URL 
1. Base URL --- https://reqres.in 
2. End request --- /api/users/2 (GET, POST, PATCH, DELETE,PUT)
3. Query Parameter

