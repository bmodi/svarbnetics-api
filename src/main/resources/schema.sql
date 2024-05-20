-- Create the organism table
CREATE TABLE organism (
  organism_id IDENTITY PRIMARY KEY,
  name VARCHAR(255) NOT NULL UNIQUE
);

-- Create the chromosome table
CREATE TABLE chromosome (
  chromosome_id IDENTITY PRIMARY KEY,
  organism_id INT NOT NULL,
  chromosome_number VARCHAR(50) NOT NULL,
  CONSTRAINT fk_organism FOREIGN KEY (organism_id) REFERENCES organism(organism_id)
);

-- Create the trait table
CREATE TABLE trait (
  trait_id IDENTITY PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  locus VARCHAR(255) NOT NULL,
  chromosome_id INT NOT NULL,
  CONSTRAINT fk_chromosome FOREIGN KEY (chromosome_id) REFERENCES chromosome(chromosome_id)
);

-- Create the gene table
CREATE TABLE gene (
    gene_id SERIAL PRIMARY KEY,
    symbol VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    trait_id INT NOT NULL,
    dominant BOOLEAN,
    FOREIGN KEY (trait_id) REFERENCES trait(trait_id)
);


-- Create a view to combine organism, trait and gene data
CREATE VIEW organism_gene_view AS
SELECT
    o.name AS organism_name,
    c.chromosome_number,
    t.locus,
    t.name AS trait_name,
    g.symbol AS gene_symbol,
    g.name AS gene_name,
    g.dominant AS dominant
FROM
    organism o
    JOIN chromosome c ON o.organism_id = c.organism_id
    JOIN trait t ON c.chromosome_id = t.chromosome_id
    JOIN gene g ON t.trait_id = g.trait_id;
