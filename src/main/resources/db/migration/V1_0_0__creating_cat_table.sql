CREATE TABLE IF NOT EXISTS cat (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    birth_day DATE NOT NULL,
    created_at TIMESTAMP NOT NULL
);