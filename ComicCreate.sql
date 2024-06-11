
-- Create Users table
CREATE TABLE Users (
    userName NVARCHAR(255) NOT NULL,
	fullName NVARCHAR(255) NOT NULL,
    password NVARCHAR(255) NOT NULL,
    email NVARCHAR(255) UNIQUE NOT NULL,
    roleID NVARCHAR(255) NOT NULL,
    status BIT NOT NULL
);

-- Create Comics table
CREATE TABLE Comics (
    comicID NVARCHAR(255) NOT NULL,
    name NVARCHAR(255) NOT NULL,
    description NVARCHAR(MAX) NOT NULL,
	artist NVARCHAR(255) NOT NULL,
    price int NOT NULL,
    quantity INT NOT NULL,
    image NVARCHAR(MAX) NOT NULL
);

-- Create Order table
CREATE TABLE Orders (
    orderID INT PRIMARY KEY,
    userName NVARCHAR(250),
    orderDate DATETIME,
    total FLOAT,
    status VARCHAR(255),
	shippingAddress NVARCHAR(MAX),
	phoneNumber NVARCHAR(MAX),
    -- Other fields like shipping address, payment details, etc.
);

CREATE TABLE OrderDetails (
    orderDetailID INT PRIMARY KEY ,
    orderID INT,
    comicID NVARCHAR(255),
    price FLOAT,
    quantity INT
    -- Add constraints
    FOREIGN KEY (orderID) REFERENCES Orders(orderID),
    FOREIGN KEY (comicID) REFERENCES Comics(comicID)
);