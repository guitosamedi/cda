CREATE TABLE `article` (
  `id` int(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `ref` VARCHAR(13) NOT NULL,
  `designation` VARCHAR(255),
  `prix` DECIMAL(7,2) NOT NULL DEFAULT 0,
  `id_fou` int(10) NOT NULL
);

CREATE TABLE `fournisseur` (
  `id` int(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `nom` VARCHAR(255) NOT NULL
);

CREATE TABLE `bon` (
  `id` int(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `numero` int(10) NOT NULL,
  `delai` int(10) NOT NULL DEFAULT 0, 
  `date_cmde` timestamp NOT NULL DEFAULT current_timestamp(),
  `id_fou` int(10) NOT NULL
);

CREATE TABLE `compo` (
 `id` INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
 `qte` int(10) NOT NULL,
 `id_art` int(10) NOT NULL,
 `id_bon` INTEGER NOT NULL,
  FOREIGN KEY (id_art) REFERENCES article(id) ON DELETE RESTRICT,
  FOREIGN KEY (id_bon) REFERENCES bon(id) ON DELETE RESTRICT
);