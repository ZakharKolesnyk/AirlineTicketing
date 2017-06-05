-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1
-- Время создания: Июн 05 2017 г., 16:22
-- Версия сервера: 10.1.19-MariaDB
-- Версия PHP: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `airline_ticketing`
--

-- --------------------------------------------------------

--
-- Структура таблицы `airports`
--

CREATE TABLE `airports` (
  `id_airport` int(11) NOT NULL,
  `id_city` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `airports`
--

INSERT INTO `airports` (`id_airport`, `id_city`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10),
(11, 11),
(12, 12),
(13, 13),
(14, 14),
(15, 15),
(16, 16),
(17, 17),
(18, 18),
(19, 19),
(20, 20),
(21, 21),
(22, 22),
(23, 23),
(24, 24),
(25, 25),
(26, 26),
(27, 27),
(28, 28),
(29, 29),
(30, 30),
(31, 31),
(32, 32),
(33, 33),
(34, 34),
(35, 35),
(36, 36),
(37, 37),
(38, 38),
(39, 39),
(40, 40),
(41, 41),
(42, 42),
(43, 43),
(44, 44);

-- --------------------------------------------------------

--
-- Структура таблицы `cities`
--

CREATE TABLE `cities` (
  `id_city` int(11) NOT NULL,
  `id_country` int(11) NOT NULL,
  `name_city` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `cities`
--

INSERT INTO `cities` (`id_city`, `id_country`, `name_city`) VALUES
(1, 1, 'New York'),
(2, 1, 'Los Angeles'),
(3, 1, 'Las Vegas'),
(4, 1, 'Washington'),
(5, 1, 'Miami'),
(6, 2, 'London'),
(7, 2, 'Liverpool'),
(8, 2, 'Cambridge'),
(9, 2, 'Oxford'),
(10, 3, 'Berlin'),
(11, 3, 'Hamburg'),
(12, 3, 'Dresden'),
(13, 3, 'Munchen'),
(14, 3, 'Dortmund'),
(15, 4, 'Paris'),
(16, 4, 'Marcel'),
(17, 4, 'Versailles'),
(18, 4, 'Toulouse'),
(19, 5, 'Kyiv'),
(20, 5, 'Kharkov'),
(21, 5, 'Lvov'),
(22, 6, 'Moscow'),
(23, 6, 'Saint-Petersburg'),
(24, 6, 'Sochi'),
(25, 7, 'Warszawa'),
(26, 7, 'Lublin'),
(27, 7, 'Krakov'),
(28, 7, 'Gdansk'),
(29, 7, 'Poznan'),
(30, 8, 'Rome'),
(31, 8, 'Firenze'),
(32, 8, 'Rimini'),
(33, 8, 'Milano'),
(34, 8, 'Palermo'),
(35, 8, 'Venezia'),
(36, 8, 'Verona'),
(37, 9, 'Winnipeg'),
(38, 9, 'Victoria'),
(39, 9, 'Vancouver'),
(40, 9, 'Montreal'),
(41, 9, 'Toronto'),
(42, 10, 'Pekin'),
(43, 10, 'Hong Kong'),
(44, 10, 'Hangzhou');

-- --------------------------------------------------------

--
-- Структура таблицы `countries`
--

CREATE TABLE `countries` (
  `id_country` int(11) NOT NULL,
  `name_country` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `countries`
--

INSERT INTO `countries` (`id_country`, `name_country`) VALUES
(9, 'Canada'),
(10, 'China'),
(4, 'France'),
(3, 'Germany'),
(2, 'Great Britain'),
(8, 'Italy'),
(7, 'Poland'),
(6, 'Russian Federation'),
(5, 'Ukraine'),
(1, 'USA');

-- --------------------------------------------------------

--
-- Структура таблицы `enum_seats`
--

CREATE TABLE `enum_seats` (
  `id_enum_seat` int(11) NOT NULL,
  `name_seat` varchar(8) NOT NULL,
  `type_seat` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `enum_seats`
--

INSERT INTO `enum_seats` (`id_enum_seat`, `name_seat`, `type_seat`) VALUES
(1, 'A1', 0),
(2, 'A2', 0),
(3, 'B1', 0),
(4, 'B2', 0),
(5, 'C1', 1),
(6, 'C2', 1),
(7, 'C3', 1),
(8, 'D1', 1),
(9, 'D2', 1),
(10, 'D3', 1),
(11, 'E1', 1),
(12, 'E2', 1),
(13, 'E3', 1),
(14, 'F1', 1),
(15, 'F2', 1),
(16, 'F3', 1);

-- --------------------------------------------------------

--
-- Структура таблицы `flights`
--

CREATE TABLE `flights` (
  `id_flight` int(11) NOT NULL,
  `id_departure_airport` int(11) NOT NULL,
  `id_destination_airport` int(11) NOT NULL,
  `departure_date` varchar(32) NOT NULL,
  `arrival_date` varchar(32) NOT NULL,
  `range_flight` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `flights`
--

INSERT INTO `flights` (`id_flight`, `id_departure_airport`, `id_destination_airport`, `departure_date`, `arrival_date`, `range_flight`) VALUES
(1, 1, 2, '2017-05-29 23:30:00', '2017-05-30 13:30:00', 2800);

-- --------------------------------------------------------

--
-- Структура таблицы `seats`
--

CREATE TABLE `seats` (
  `id_seat` int(11) NOT NULL,
  `id_flight` int(11) NOT NULL,
  `price` double NOT NULL,
  `id_enum_seat` int(11) NOT NULL,
  `reserved` tinyint(4) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `seats`
--

INSERT INTO `seats` (`id_seat`, `id_flight`, `price`, `id_enum_seat`, `reserved`) VALUES
(1, 1, 200, 1, 0),
(2, 1, 200, 2, 0),
(3, 1, 200, 3, 0),
(4, 1, 200, 4, 0),
(5, 1, 100, 5, 0),
(6, 1, 100, 6, 0),
(7, 1, 100, 7, 0),
(8, 1, 100, 8, 0),
(9, 1, 100, 9, 0),
(10, 1, 100, 10, 0),
(11, 1, 100, 11, 0),
(12, 1, 100, 12, 0);

-- --------------------------------------------------------

--
-- Структура таблицы `tickets`
--

CREATE TABLE `tickets` (
  `id_ticket` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_flight` int(11) NOT NULL,
  `id_seat` int(11) NOT NULL,
  `date_order` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `cost` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `tickets`
--

INSERT INTO `tickets` (`id_ticket`, `id_user`, `id_flight`, `id_seat`, `date_order`, `cost`) VALUES
(1, 1, 1, 1, '2017-06-05 14:14:54', 1800);

-- --------------------------------------------------------

--
-- Структура таблицы `users`
--

CREATE TABLE `users` (
  `id_user` int(11) NOT NULL,
  `first_name` varchar(32) NOT NULL,
  `last_name` varchar(32) NOT NULL,
  `email` varchar(64) NOT NULL,
  `identity_number` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Дамп данных таблицы `users`
--

INSERT INTO `users` (`id_user`, `first_name`, `last_name`, `email`, `identity_number`) VALUES
(1, 'John', 'Chima', 'john@mail.co', '12674512712'),
(2, 'Jim', 'Times', 'tim@mail.co', '56418461242');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `airports`
--
ALTER TABLE `airports`
  ADD PRIMARY KEY (`id_airport`),
  ADD KEY `airports_cities_id_city_fk` (`id_city`);

--
-- Индексы таблицы `cities`
--
ALTER TABLE `cities`
  ADD PRIMARY KEY (`id_city`),
  ADD KEY `cities_countries_id_country_fk` (`id_country`);

--
-- Индексы таблицы `countries`
--
ALTER TABLE `countries`
  ADD PRIMARY KEY (`id_country`),
  ADD UNIQUE KEY `countries_name_country_uindex` (`name_country`);

--
-- Индексы таблицы `enum_seats`
--
ALTER TABLE `enum_seats`
  ADD PRIMARY KEY (`id_enum_seat`),
  ADD UNIQUE KEY `names_seats_name_seat_uindex` (`name_seat`);

--
-- Индексы таблицы `flights`
--
ALTER TABLE `flights`
  ADD PRIMARY KEY (`id_flight`),
  ADD KEY `flights_airports_id_dprtr_airport_fk` (`id_departure_airport`),
  ADD KEY `flights_airports_id_dstnt_airport_fk` (`id_destination_airport`);

--
-- Индексы таблицы `seats`
--
ALTER TABLE `seats`
  ADD PRIMARY KEY (`id_seat`),
  ADD KEY `seats_flights_id_flight_fk` (`id_flight`),
  ADD KEY `seats_enum_seats_id_enum_seat_fk` (`id_enum_seat`);

--
-- Индексы таблицы `tickets`
--
ALTER TABLE `tickets`
  ADD PRIMARY KEY (`id_ticket`),
  ADD KEY `tickets_flights_id_flight_fk` (`id_flight`),
  ADD KEY `tickets_seats_id_seat_fk` (`id_seat`),
  ADD KEY `tickets_users_id_user_fk` (`id_user`);

--
-- Индексы таблицы `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `users_email_uindex` (`email`),
  ADD UNIQUE KEY `users_identity_number_uindex` (`identity_number`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `airports`
--
ALTER TABLE `airports`
  MODIFY `id_airport` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;
--
-- AUTO_INCREMENT для таблицы `cities`
--
ALTER TABLE `cities`
  MODIFY `id_city` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;
--
-- AUTO_INCREMENT для таблицы `countries`
--
ALTER TABLE `countries`
  MODIFY `id_country` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT для таблицы `enum_seats`
--
ALTER TABLE `enum_seats`
  MODIFY `id_enum_seat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT для таблицы `flights`
--
ALTER TABLE `flights`
  MODIFY `id_flight` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT для таблицы `seats`
--
ALTER TABLE `seats`
  MODIFY `id_seat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT для таблицы `tickets`
--
ALTER TABLE `tickets`
  MODIFY `id_ticket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT для таблицы `users`
--
ALTER TABLE `users`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `airports`
--
ALTER TABLE `airports`
  ADD CONSTRAINT `airports_cities_id_city_fk` FOREIGN KEY (`id_city`) REFERENCES `cities` (`id_city`);

--
-- Ограничения внешнего ключа таблицы `cities`
--
ALTER TABLE `cities`
  ADD CONSTRAINT `cities_countries_id_country_fk` FOREIGN KEY (`id_country`) REFERENCES `countries` (`id_country`);

--
-- Ограничения внешнего ключа таблицы `flights`
--
ALTER TABLE `flights`
  ADD CONSTRAINT `flights_airports_id_airport_fk` FOREIGN KEY (`id_departure_airport`) REFERENCES `airports` (`id_airport`),
  ADD CONSTRAINT `flights_airports_id_dprtr_airport_fk` FOREIGN KEY (`id_departure_airport`) REFERENCES `airports` (`id_airport`),
  ADD CONSTRAINT `flights_airports_id_dstnt_airport_fk` FOREIGN KEY (`id_destination_airport`) REFERENCES `airports` (`id_airport`);

--
-- Ограничения внешнего ключа таблицы `seats`
--
ALTER TABLE `seats`
  ADD CONSTRAINT `seats_enum_seats_id_enum_seat_fk` FOREIGN KEY (`id_enum_seat`) REFERENCES `enum_seats` (`id_enum_seat`),
  ADD CONSTRAINT `seats_flights_id_flight_fk` FOREIGN KEY (`id_flight`) REFERENCES `flights` (`id_flight`);

--
-- Ограничения внешнего ключа таблицы `tickets`
--
ALTER TABLE `tickets`
  ADD CONSTRAINT `tickets_flights_id_flight_fk` FOREIGN KEY (`id_flight`) REFERENCES `flights` (`id_flight`),
  ADD CONSTRAINT `tickets_seats_id_seat_fk` FOREIGN KEY (`id_seat`) REFERENCES `seats` (`id_seat`),
  ADD CONSTRAINT `tickets_users_id_user_fk` FOREIGN KEY (`id_user`) REFERENCES `users` (`id_user`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
