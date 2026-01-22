-- ===============================
-- CREATE DATABASE
-- ===============================
CREATE DATABASE IF NOT EXISTS address_book__service1;
USE address_book__service1;

-- ===============================
-- CREATE TABLE: address_book1
-- ===============================
CREATE TABLE IF NOT EXISTS address_book1 (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    address VARCHAR(150),
    city VARCHAR(50),
    state VARCHAR(50),
    zip VARCHAR(10),
    phone_number VARCHAR(15),
    email VARCHAR(100),
    date_added TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- ===============================
-- CREATE TABLE: address_books_type (optional, for future extension)
-- ===============================
CREATE TABLE IF NOT EXISTS address_books_type (
    type_id INT AUTO_INCREMENT PRIMARY KEY,
    type_name VARCHAR(50) UNIQUE
);

-- ===============================
-- CREATE TABLE: person_types (optional, for multiple types per person)
-- ===============================
CREATE TABLE IF NOT EXISTS person_types (
    person_id INT,
    type_id INT,
    PRIMARY KEY (person_id, type_id),
    FOREIGN KEY (person_id) REFERENCES address_book1(id),
    FOREIGN KEY (type_id) REFERENCES address_books_type(type_id)
);

-- ===============================
-- INSERT SAMPLE CONTACTS
-- ===============================
INSERT INTO address_book1
(first_name, last_name, address, city, state, zip, phone_number, email)
VALUES
('Vasantha', 'Kumar', 'Mettupatty', 'Dindigul', 'Tamil Nadu', '624001', '9876543211', 'vasantha@gmail.com'),
('Manju', 'Sharma', 'Anguvilas', 'Madurai', 'Tamil Nadu', '624002', '9876543212', 'manju@gmail.com'),
('Manu', 'Patel', 'Kodambakkam', 'Chennai', 'Tamil Nadu', '624003', '9876543213', 'manu@gmail.com'),
('Meena', 'Iyer', 'Anna Nagar', 'Karur', 'Tamil Nadu', '624004', '9876543214', 'meena@gmail.com'),
('Arun', 'Singh', 'Balakrishnapuram', 'Hosur', 'Tamil Nadu', '624005', '9876543215', 'arun@gmail.com'),
('Haritha', 'Rao', 'MG Road', 'Bengaluru', 'Karnataka', '560001', '9876543216', 'haritha@gmail.com');

-- ===============================
-- INSERT SAMPLE TYPES (optional)
-- ===============================
INSERT INTO address_books_type (type_name)
VALUES ('Family'), ('Friends'), ('Professional');

-- ===============================
-- MAP PERSON TO TYPE (optional)
-- ===============================
INSERT INTO person_types (person_id, type_id)
VALUES
(1,1),
(2,3),
(3,2),
(4,3),
(5,2),
(2,1); -- multiple types example

-- ===============================
-- SIMPLE SELECTS
-- ===============================
SELECT * FROM address_book1;
SELECT * FROM address_books_type;
SELECT * FROM person_types;

-- ===============================
-- SAMPLE SEARCH QUERIES
-- ===============================
-- By city
SELECT * FROM address_book1 WHERE city='Chennai';

-- By state
SELECT * FROM address_book1 WHERE state='Tamil Nadu';

-- By city OR state
SELECT * FROM address_book1 WHERE city='Chennai' OR state='Karnataka';

-- Count by city
SELECT city, COUNT(*) AS total_contacts
FROM address_book1
GROUP BY city;

-- Count by state
SELECT state, COUNT(*) AS total_contacts
FROM address_book1
GROUP BY state;

-- Delete a contact example
DELETE FROM address_book1 WHERE first_name='Arun' AND last_name='Singh';