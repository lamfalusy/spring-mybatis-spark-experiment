CREATE TABLE user (
	id BIGINT AUTO_INCREMENT NOT NULL,
	firstName VARCHAR(255),
	lastName VARCHAR(255),
	email VARCHAR(255),
	PRIMARY KEY (id))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;