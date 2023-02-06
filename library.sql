SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

CREATE DATABASE IF NOT EXISTS library DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_General_ci;
USE library;

CREATE TABLE libraryBooking
(
    id         int(11) NOT NULL,
    bookid     int(11) NOT NULL,
    costumerid int(11) NOT NULL,
    loaned     date    NOT NULL,
    returned   date    NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

INSERT INTO libraryBooking (id, bookid, costumerid, loaned, returned)
VALUES (2, 2, 1, '2023-01-01', '2023-01-07'),
       (3, 2, 1, '2023-01-01', '2023-01-07'),
       (4, 2, 1, '2023-01-01', '2023-01-07');

CREATE TABLE libraryBooks
(
    id          int(11)      NOT NULL,
    name        varchar(50)  NOT NULL,
    author      varchar(50)  NOT NULL,
    description varchar(150) NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

INSERT INTO libraryBooks (id, name, author, description)
VALUES (2, 'The Old Man and the Sea', 'Ernest Hemingway',
        'A novel about an old fisherman who goes on a journey to catch a big fish.'),
       (3, 'To Kill a Mockingbird', 'Harper Lee',
        'A novel about a young girl in the 1930s who learns about prejudice and injustice in her community.'),
       (4, 'Pride and Prejudice', 'Jane Austen',
        'A novel about the relationships between members of the landed gentry in early 19th-century England.'),
       (5, 'Moby Dick', 'Herman Melville', 'A novel about a sailor’s obsessive hunt for a white whale.'),
       (6, 'The Great Gatsby', 'F. Scott Fitzgerald',
        'A novel about the decadence and excess of the Roaring Twenties in America.');

CREATE TABLE libraryCostumer
(
    id      int(11)     NOT NULL,
    name    varchar(50) NOT NULL,
    surname varchar(50) NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;
INSERT INTO libraryCostumer (id, name, surname)
VALUES (1, 'John', 'Doe'),
       (2, 'Jane', 'Doe'),
       (3, 'Jack', 'Smith'),
       (4, 'Jill', 'Johnson'),
       (5, 'Jim', 'Brown');

ALTER TABLE `libraryBooking`
    ADD PRIMARY KEY (`id`),
    ADD KEY `bookid` (`bookid`),
    ADD KEY `costumerid` (`costumerid`);


ALTER TABLE `libraryBooks`
    ADD PRIMARY KEY (`id`);

ALTER TABLE `libraryCostumer`
    ADD PRIMARY KEY (`id`);

ALTER TABLE `libraryBooking`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

ALTER TABLE `libraryBooks`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;


ALTER TABLE `libraryCostumer`
    MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

ALTER TABLE `libraryBooking`
    ADD CONSTRAINT `booking_ibfk_1` FOREIGN KEY (`bookid`) REFERENCES `libraryBooks` (`id`),
    ADD CONSTRAINT `booking_ibfk_2` FOREIGN KEY (`costumerid`) REFERENCES `libraryCostumer` (`id`);
COMMIT;