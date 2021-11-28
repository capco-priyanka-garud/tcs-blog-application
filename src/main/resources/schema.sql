
DROP TABLE IF EXISTS `geo`;

DROP TABLE IF EXISTS `address`;
DROP TABLE IF EXISTS `company`;
DROP TABLE IF EXISTS `posts`;
DROP TABLE IF EXISTS `users`;

create table test;
CREATE TABLE IF NOT EXISTS `Person` (
    `id`         INTEGER  PRIMARY KEY AUTO_INCREMENT,
     `first_name` VARCHAR(50) NOT NULL,
     `age`        INTEGER  NOT NULL
);

CREATE TABLE `geo` (
  `id` bigint(19) unsigned NOT NULL AUTO_INCREMENT,
  `lat` varchar(255),
  `lng` varchar(255),
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint(19) unsigned DEFAULT NULL,
  `updated_by` bigint(19) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;


CREATE TABLE `company` (
  `id` bigint(19) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255),
  `catch_phrase` varchar(255),
  `bs` varchar(255),
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint(19) unsigned DEFAULT NULL,
  `updated_by` bigint(19) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `address` (
  `id` bigint(19) unsigned NOT NULL AUTO_INCREMENT,
  `street` varchar(255),
  `suite` varchar(255),
  `city` varchar(255),
  `zipcode` varchar(255),
  `geo_id` bigint(19) unsigned DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint(19) unsigned DEFAULT NULL,
  `updated_by` bigint(19) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_geo` FOREIGN KEY (`geo_id`) REFERENCES `geo` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ;

CREATE TABLE `users` (
  `id` bigint(19) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `address_id` bigint(19) unsigned DEFAULT NULL,
  `phone` varchar(255),
  `website` varchar(255),
  `company_id` bigint(19) unsigned DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_address` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_company` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ;


CREATE TABLE `posts` (
  `id` bigint(19) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `body` text NOT NULL,
  `user_id` bigint(19) unsigned DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` bigint(19) unsigned DEFAULT NULL,
  `updated_by` bigint(19) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
   CONSTRAINT `fk_user_post` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ;
