CREATE TABLE `products` (
  `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `code` varchar(100) DEFAULT NULL,
  `label` varchar(100) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `price` decimal(18,2) DEFAULT 0.00,
  `version` int(11) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `products` (`id`, `code`, `label`, `category_id`, `price`, `version_id`, `img`, `created_at`, `updated_at`) VALUES
(1, '4321', 'Calzone', 1, 25.00, 2, 'images/products/pizza-2.jpg', '2023-05-03 22:00:00', '2023-05-03 22:00:00'),
(2, '1234', 'Reine', 1, 14.00, 1, 'images/products/pizza-1.jpg', '2023-05-03 22:00:00', '2023-05-03 22:00:00'),

CREATE TABLE `categories` (
  `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `category_name` varchar(100) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `categories` (`id`, `category_name`,`created_at`, `updated_at`) VALUES
(1, 'Blanche', '2023-05-03 22:00:00', '2023-05-03 22:00:00'),
(2, 'Rouge', '2023-05-03 22:00:00', '2023-05-03 22:00:00'),

CREATE TABLE `ingredients` (
  `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `ingredient_name` varchar(100) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `ingredients` (`id`, `ingredient_name`,`created_at`, `updated_at`) VALUES
(1, 'Tomate', '2023-05-03 22:00:00', '2023-05-03 22:00:00'),
(2, 'Fromage', '2023-05-03 22:00:00', '2023-05-03 22:00:00'),


CREATE TABLE ingredient_products (
  id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
  ingredient_id INTEGER NOT NULL,
  product_id INTEGER NOT NULL,
  FOREIGN KEY (ingredient_id) REFERENCES ingredients(id) ON DELETE RESTRICT,
  FOREIGN KEY (product_id) REFERENCES products(id) ON DELETE RESTRICT
);

CREATE TABLE `deliverers` (
  `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `firtname` varchar(100) DEFAULT NULL,
  `lastname` varchar(100) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `deliverers` (`id`, `firtname`, `lastname`,`created_at`, `updated_at`) VALUES
(1, 'François','Hollande', '2023-05-03 22:00:00', '2023-05-03 22:00:00'),
(2, 'Luigi', 'Bros','2023-05-03 22:00:00', '2023-05-03 22:00:00')


CREATE TABLE `customers` (
  `id` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `firtname` varchar(100) DEFAULT NULL,
  `lastname` varchar(100) DEFAULT NULL,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(15),
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `customers` (`id`, `firtname`, `lastname`, `email`, `password`, `phone`,`created_at`, `updated_at`) VALUES
(1, 'John','Doe', 'test@test.com', 'test', '06006060606', '2023-05-03 22:00:00', '2023-05-03 22:00:00'),
(2, 'Edward', 'Smith', 'test@test.com', 'test', '06006060606', '2023-05-03 22:00:00', '2023-05-03 22:00:00')

CREATE TABLE `addresses` (
  id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `address` VARCHAR(255) NOT NULL,
  customer_id INTEGER NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
  FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE RESTRICT
);

INSERT INTO `addresses` (`id`, `address`, `customer_id`, `created_at`, `updated_at`) VALUES
(1, '113 rue du Bac paris','1', '2023-05-03 22:00:00', '2023-05-03 22:00:00'),
(2, '58 Avenue  Lodeve  Montpellier', '2', '2023-05-03 22:00:00', '2023-05-03 22:00:00'),
(3, '10 Boulevard Diderot  Lyon', '1', '2023-05-03 22:00:00', '2023-05-03 22:00:00')


CREATE TABLE customer_addresses (
  id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
  address_id INTEGER NOT NULL,
  customer_id INTEGER NOT NULL,
  FOREIGN KEY (address_id) REFERENCES addresses(id) ON DELETE RESTRICT,
  FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE RESTRICT
);

INSERT INTO `customer_addresses` (`id`, `address`, `customer_id`, `created_at`, `updated_at`) VALUES
(1, '113 rue du Bac paris','1', '2023-05-03 22:00:00', '2023-05-03 22:00:00'),
(2, '58 Avenue  Lodeve  Montpellier', '2', '2023-05-03 22:00:00', '2023-05-03 22:00:00')
(3, '10 Boulevard Diderot  Lyon', '1', '2023-05-03 22:00:00', '2023-05-03 22:00:00')

CREATE TABLE orders (
  id INTEGER(11)  PRIMARY KEY NOT NULL AUTO_INCREMENT,
  customer_id INTEGER(11) NOT NULL,
  deliverer_id INTEGER(11) NOT NULL,
   `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
  FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE RESTRICT
  FOREIGN KEY (deliverer_id) REFERENCES deliverers(id) ON DELETE RESTRICT
);