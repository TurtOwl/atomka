CREATE TABLE reactor (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    temperature DOUBLE NOT NULL,
    pressure DOUBLE NOT NULL,
    power DOUBLE NOT NULL
);

CREATE TABLE user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    enabled BOOLEAN NOT NULL
);

CREATE TABLE role (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE maintenance_plan (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(255),
    status VARCHAR(255)
);

CREATE TABLE log_entry (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    message VARCHAR(255),
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE user_role (
    user_id BIGINT,
    role_id BIGINT,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (role_id) REFERENCES role(id)
);
