# Java

Library Management System

#Clone from git:  https://github.com/flakronademi/Java

#How to run This Project

1.Import database from library.sql

2.Open Project

3.Go to src/main/com.example.demo/demoApplication.java

4.Run Demo Application

#Endpoint

#Costumer endpoint - these are just examples :

1.URL: http://localhost:8080/costumer Get all Costumer - METHOD = GET

Response: [{ "id": 1,"name": "Flakron","surname": "Ademi"}, {"id": 4,"name": "Driton","surname": "Adili" }]

2.URL: http://localhost:8080/costumer/ Get Costumer by id - METHOD = GET

Response: {"id": 4,"name": "Driton","surname": "Adili" }

3.URL: http://localhost:8080/costumer/ Edit Costumer by id - METHOD = PUT

Response: { "id": 4, "name": "Flakron", "surname": "Ademi" }

4.URL: http://localhost:8080/costumer/ Add Costumer- METHOD = POST

Response: { "id": 5, "name": "Driton", "surname": "Adili" }

5.URL: http://localhost:8080/costumer/ Delete Costumer by id- METHOD = DELETE

#Book Endpoint

1.URL: http://localhost:8080/book Get all Book - METHOD = GET

Response: {"id": 11, "name": "Lorem", "author": "Flakron Ademi", "description": "Lorem ipsum dolor sit amet"}

2.URL: http://localhost:8080/book/ Get Book by id - METHOD = GET

Response: {"id": 11, "name": "Ipsum", "author": "Driton Adili", "description": "Lorem ipsum dolor sit amet"}

3.URL: http://localhost:8080/book/ Edit Book by id - METHOD = PUT

Response: { "id": 11, "name": "Dolor", "author": "Flakron Ademi", "description": "Lorem ipsum dolor sit amet" }

4.URL: http://localhost:8080/book/ Add Book- METHOD = POST

Response: { "id": 12, "name": "Sit", "author": "Driton Adili", "description": "Lorem ipsum dolor sit amet" }

5.URL: http://localhost:8080/book/ Delete Book by id- METHOD = DELETE

#Booking endpoint

1.URL: http://localhost:8080/booking Get all Booking - METHOD = GET

Response: [{"id": 2,"bookid": {"id": 2,"name": "Lorem","author": "Flakron Ademi","description": "Lorem ipsum dolor sit amet"},"costumerid": {"id": 1,"name": "Flakron","surname": "Ademi"},"loaned": "2023-03-12","returned": "2023-04-17"},{ "id": 7,"bookid": { "id": 11,"name": "Lorem","author": "Flakron Ademi","description": "Lorem ipsum dolor sit amet"},"costumerid": {"id": 5,"name": "Driton ","surname": "Adili"},"loaned": "2023-12-03","returned": "2023-12-23"}]

2.URL: http://localhost:8080/booking/ Get Booking by id - METHOD = GET

Response: { "id": 7,"bookid": { "id": 11,"name": "Ipsum","author": "Flakron Ademi","description": "Lorem ipsum dolor sit amet"},"costumerid": {"id": 5,"name": "Driton ","surname": "Adili"},"loaned": "2023-02-10","returned": "2023-03-25"}

3.URL: http://localhost:8080/booking/ Edit Booking by id - METHOD = PUT

Response: {"id": 7,"bookid": { "id": 11,"name": "Dolor","author": "Flakron Ademi","description": "Lorem ipsum dolor sit amet"},"costumerid": {"id": 5,"name": "Flakron ","surname": "Ademi"},"loaned": "2023-12-08","returned": "2023-12-28"}

4.URL: http://localhost:8080/booking/ Add Booking- METHOD = POST

Response: { "id":8 "bookid": { "id": 2, "name": "Elit", "author": "Flakron Ademi", "description": "Lorem ipsum dolor sit amet"}, "costumerid": { "id": 1, "name": "Flakron", "surname": "Ademi" }, "loaned": "2023-11-10", "returned": "2023-01-27" }

5.URL: http://localhost:8080/booking/ Delete Booking by id- METHOD = DELETE
