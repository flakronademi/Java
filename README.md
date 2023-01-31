# Java

Library Management System

#Clone from git:  https://github.com/flakronademi/Java

#How to run This Project

1.Import database from library.sql

2.Open Project

3.Go to src/main/com.example.library/DemoApplication.java

4.Run Demo Application

#Endpoint

#Costumer endpoint - these are just examples :

1.URL: http://localhost:8080/libraryCostumer Get all Costumer - METHOD = GET

Response: 
{
"id": 1,
"name": "John",
"surname": "Doe"
},
{
"id": 2,
"name": "Jane",
"surname": "Doe"
},
{
"id": 3,
"name": "Jack",
"surname": "Smith"
},
{
"id": 4,
"name": "Jill",
"surname": "Johnson"
},
{
"id": 5,
"name": "Jim",
"surname": "Brown"
}


2.URL: http://localhost:8080/librarycostumer/ Get Costumer by id - METHOD = GET

Response: {
"id": 1,
"name": "John",
"surname": "Doe"
}

3.URL: http://localhost:8080/librarycostumer/ Edit Costumer by id - METHOD = PUT

Response:{ 
"id": 1,
"name": "Flakron",
"surname": "Ademi" 
}

4.URL: http://localhost:8080/libraryCostumer/ Add Costumer- METHOD = POST

Response: { 
"id": 6, 
"name": "Driton",
"surname": "Adili" 
}

5.URL: http://localhost:8080/libraryCostumer/ Delete Costumer by id- METHOD = DELETE

Response : true

#LibraryBook Endpoint

1.URL: http://localhost:8080/librarybook Get all Book - METHOD = GET

Response: 
{
"id": 2,
"name": "The Old Man and the Sea",
"author": "Ernest Hemingway",
"description": "A novel about an old fisherman who goes on a journey to catch a big fish."
},
{
"id": 3,
"name": "To Kill a Mockingbird",
"author": "Harper Lee",
"description": "A novel about a young girl in the 1930s who learns about prejudice and injustice in her community."
},
{
"id": 4,
"name": "Pride and Prejudice",
"author": "Jane Austen",
"description": "A novel about the relationships between members of the landed gentry in early 19th-century England."
},
{
"id": 5,
"name": "Moby Dick",
"author": "Herman Melville",
"description": "A novel about a sailor’s obsessive hunt for a white whale."
},
{
"id": 6,
"name": "The Great Gatsby",
"author": "F. Scott Fitzgerald",
"description": "A novel about the decadence and excess of the Roaring Twenties in America."
}

2.URL: http://localhost:8080/librarybook/ Get Book by id - METHOD = GET

Response: {
"id": 6,
"name": "The Great Gatsby",
"author": "F. Scott Fitzgerald",
"description": "A novel about the decadence and excess of the Roaring Twenties in America."
}
3.URL: http://localhost:8080/librarybook/ Edit Book by id - METHOD = PUT

Response: {
"id": 5,
"name": "Test",
"author": "Test Test",
"description": "Test"
}
4.URL: http://localhost:8080/librarybook/ Add Book- METHOD = POST

Response: 
{ "id": 7,
"name": "Sit",
"author": "Driton Adili",
"description": "Lorem ipsum dolor sit amet"
}

5.URL: http://localhost:8080/librarybook/ Delete Book by id- METHOD = DELETE

Response : true

#Booking endpoint

1.URL: http://localhost:8080/librarybooking Get all Booking - METHOD = GET

Response: {
"id": 2,
"bookid": {
"id": 2,
"name": "The Old Man and the Sea",
"author": "Ernest Hemingway",
"description": "A novel about an old fisherman who goes on a journey to catch a big fish."
},
"costumerid": {
"id": 1,
"name": "John",
"surname": "Doe"
},
"loaned": "2023-01-01",
"returned": "2023-01-07"
},
{
"id": 3,
"bookid": {
"id": 2,
"name": "The Old Man and the Sea",
"author": "Ernest Hemingway",
"description": "A novel about an old fisherman who goes on a journey to catch a big fish."
},
"costumerid": {
"id": 1,
"name": "John",
"surname": "Doe"
},
"loaned": "2023-01-01",
"returned": "2023-01-07"
},
{
"id": 4,
"bookid": {
"id": 2,
"name": "The Old Man and the Sea",
"author": "Ernest Hemingway",
"description": "A novel about an old fisherman who goes on a journey to catch a big fish."
},
"costumerid": {
"id": 1,
"name": "John",
"surname": "Doe"
},
"loaned": "2023-01-01",
"returned": "2023-01-07"
}

2.URL: http://localhost:8080/librarybooking/ Get Booking by id - METHOD = GET

Response: {
"id": 4,
"bookid": {
"id": 2,
"name": "The Old Man and the Sea",
"author": "Ernest Hemingway",
"description": "A novel about an old fisherman who goes on a journey to catch a big fish."
}

3.URL: http://localhost:8080/libraryBooking/ Edit Booking by id - METHOD = PUT

Response: {
"id": 4,
"bookid": {
"id": 2,
"name": "test",
"author": "test test",
"description": "A novel about an old fisherman who goes on a journey to catch a big fish."
}
4.URL: http://localhost:8080/librarybooking/ Add Booking- METHOD = POST

Response:  {
"id": 4,
"bookid": {
"id": 2,
"name": "test",
"author": "test test",
"description": "A novel about an old fisherman who goes on a journey to catch a big fish."
}

5.URL: http://localhost:8080/libraryBooking/ Delete Booking by id- METHOD = DELETE

Response : true

