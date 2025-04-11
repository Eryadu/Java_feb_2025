Practice open weather API with latitude, longitude, and API Key

400 Bad request ?
due to Invalid data
Error 404

HTPPs response Code (https://www.w3schools.com/tags/ref_httpmessages.asp) ?

401 ?? Unauthorised

500? Internal server error i.e. configuration error, database error

Single Sign authentication ?? if you sign in by google account then if you try to login any other site by using google then 
it send the request that google already authenticate so you don't need to worry about this, so you can sign in by using same credential



Swagger ? API Doc, API testing
editor.swagger.io




Rest API ?

two set of systems

API

HTTP

client - server

Example of API. Google Map api, payment system , weather map, Yahoo api

skyscanner , online e commerce app ,zomato, uber, skipthedishes.

Uber - google map , payment system, Twillio to send notifications

Postman , Bruno , IntelliJ api client

api testing tool ?

Web app ---

FE - API testing tool --- BE

A -- B - BE app

GET POST PUT PATCH DELETE

difference between PUT and PATCH ? - IMPORTANT INTERVIEW PUT and PATCH are for update, put - you have to update the whole resource. \

PUT { "Name" : "Yadav Gupta", "Email" : "yadav@gmail.com", "course" : "Java" }

PATCH

{ "Name" : "Yadav Gupta" }

openweather map api ?

## https://api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}

-- https://api.openweathermap.org          - Base URL 
-- data/2.5/weather                        - ENDPOINT 
-- lat={lat}&lon={lon}&appid={API key}     - Query Parameter

Authentication API Key : authorization : 10753073fb906174c195f1663a489d81

## Latitude and longitude
check google to access lat and lon of any location

400 Bad Request : 401 : Unauthorized Error 404

Book api on github

access token : 99f5dada3a84e90ce0e7497ee8ecd6229877e091657d08f3ae17897975f17903

response :

{ "created": true, "orderId": "LAKehhP_ltE2fKkJ5RpVf" }

vault key b99312882650f058b2de14e5063341caeb8512c2d4ad7f444c0b311f8c30ab2b



## API doc

swagger ?

## Environment

dev / QA / test staging / pre prod prod UAT