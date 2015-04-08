CREATE TABLE `users` (
  `id` INTEGER(11) NOT NULL AUTO_INCREMENT,
  `age` INTEGER(11) DEFAULT NULL,
  `createdDate` DATETIME DEFAULT NULL,
  `isAdmin` BIT(1) DEFAULT NULL,
  `name` VARCHAR(255) COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB
AUTO_INCREMENT=27 CHARACTER SET 'utf8' COLLATE 'utf8_general_ci'
;
COMMIT;

/* Data for the 'users' table  (Records 1 - 22) */

INSERT INTO users (id, age, createdDate, isAdmin, name) VALUES

  (1, 37, NULL, 0, 'Ермаков'),
  (2, 42, NULL, 0, 'Иванов'),
  (4, 37, NULL, 1, 'Рачик'),
  (5, 23, '2014-12-31 23:59:59', 0, 'Дурнев'),
  (9, 32, NULL, 0, 'Лисица'),
  (10, 27, NULL, 0, 'Белый'),
  (11, 48, NULL, 1, 'Прудник'),
  (12, 26, NULL, 0, 'Касаткин'),
  (13, NULL, NULL, 0, 'Иванской'),
  (14, 17, NULL, 0, 'Чапаев'),
  (15, NULL, '2014-10-31 23:59:59', 0, 'Сахаров'),
  (16, NULL, '2014-12-31 23:59:59', 0, 'Сахаридзе'),
  (17, 55, NULL, 0, 'Чуев'),
  (18, NULL, NULL, 0, 'Михалов'),
  (19, 37, '2014-12-31 23:59:59', 0, 'Цукерман'),
  (20, 33, '2014-12-31 23:59:59', 1, 'Дятлов'),
  (21, 27, '2014-12-31 23:59:59', 0, 'Кирпичов'),
  (22, NULL, '2014-12-31 23:59:59', 0, 'Шевченко'),
  (23, 49, NULL, 1, 'Яресько'),
  (24, 44, NULL, 0, 'Палкин'),
  (25, 25, NULL, 0, 'Семенов'),
  (26, 26, '2014-12-31 23:59:59', 1, 'Кравченко');