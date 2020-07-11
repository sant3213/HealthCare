CREATE extension "uuid-ossp";

CREATE TABLE user(
 id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  name VARCHAR(200) NOT NULL,
  email VARCHAR(100) NOT NULL,
  password VARCHAR(500) NOT NULL,
  country VARCHAR(15) NOT NULL,
  city VARCHAR(50) NOT NULL,
  occupation VARCHAR(50) NOT NULL
);

CREATE TABLE professional(
 id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  experienceTime VARCHAR(200) NOT NULL,
  professionalCard VARCHAR(100) NOT NULL,
  specialty VARCHAR(500) NOT NULL
);

CREATE TABLE patient(
 id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  diet VARCHAR(200) NOT NULL,
  diseases VARCHAR(100) NOT NULL,
  age VARCHAR(500) NOT NULL,
  weight VARCHAR(500) NOT NULL,
  physicalActivity VARCHAR(500) NOT NULL,
);

