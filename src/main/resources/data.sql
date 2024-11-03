-- Insert data
DELETE FROM gene;
DELETE FROM trait;
DELETE FROM chromosome;
DELETE FROM organism;

-- Inserting human organism with 23 chromosomes
INSERT INTO organism (name) VALUES ('human');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '1');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '2');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '3');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '4');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '5');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '6');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '7');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '8');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '9');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '10');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '11');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '12');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '13');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '14');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '15');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '16');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '17');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '18');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '19');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '20');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '21');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '22');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '23');

-- Inserting pea plant organism with 7 chromosomes
INSERT INTO organism (name) VALUES ('pea plant');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '1');
INSERT INTO trait (name, locus, chromosome_id) VALUES ('Color of seed albumen (Y)', 'L2', (SELECT MAX(chromosome_id) FROM chromosome WHERE organism_id = (SELECT MAX(organism_id) FROM organism)));
INSERT INTO trait (name, locus, chromosome_id) VALUES ('Position of flowers (A)', 'L5', (SELECT MAX(chromosome_id) FROM chromosome WHERE organism_id = (SELECT MAX(organism_id) FROM organism)));

-- Insert genes for 'Color of seed albumen (Y)'
INSERT INTO gene (symbol, name, dominant, trait_id) 
VALUES ('Y', 'Yellow seed color', TRUE, 
    (SELECT trait_id FROM trait WHERE name = 'Color of seed albumen (Y)' AND chromosome_id = (SELECT chromosome_id FROM chromosome WHERE chromosome_number = '1' AND organism_id = (SELECT MAX(organism_id) FROM organism))));

INSERT INTO gene (symbol, name, dominant, trait_id) 
VALUES ('y', 'Green seed color', FALSE,
    (SELECT trait_id FROM trait WHERE name = 'Color of seed albumen (Y)' AND chromosome_id = (SELECT chromosome_id FROM chromosome WHERE chromosome_number = '1' AND organism_id = (SELECT MAX(organism_id) FROM organism))));

-- Insert genes for 'Position of flowers (A)'
INSERT INTO gene (symbol, name, dominant, trait_id) 
VALUES ('A', 'Axial flower position', TRUE, 
    (SELECT trait_id FROM trait WHERE name = 'Position of flowers (A)' AND chromosome_id = (SELECT chromosome_id FROM chromosome WHERE chromosome_number = '1' AND organism_id = (SELECT MAX(organism_id) FROM organism))));

INSERT INTO gene (symbol, name, dominant, trait_id) 
VALUES ('a', 'Terminal flower position', FALSE, 
    (SELECT trait_id FROM trait WHERE name = 'Position of flowers (A)' AND chromosome_id = (SELECT chromosome_id FROM chromosome WHERE chromosome_number = '1' AND organism_id = (SELECT MAX(organism_id) FROM organism))));
    


INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '2');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '3');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '4');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '5');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '6');
INSERT INTO trait (name, locus, chromosome_id) VALUES ('Color of flower (P)', 'L3', (SELECT MAX(chromosome_id) FROM chromosome WHERE organism_id = (SELECT MAX(organism_id) FROM organism)));

INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '7');
INSERT INTO trait (name, locus, chromosome_id) VALUES ('Form of ripe seed (R)', 'L1', (SELECT MAX(chromosome_id) FROM chromosome WHERE organism_id = (SELECT MAX(organism_id) FROM organism)));
INSERT INTO trait (name, locus, chromosome_id) VALUES ('Form of ripe pods (I)', 'L4', (SELECT MAX(chromosome_id) FROM chromosome WHERE organism_id = (SELECT MAX(organism_id) FROM organism)));




-- Inserting fruit fly organism with 8 chromosomes
INSERT INTO organism (name) VALUES ('fruit fly');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '1');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '2');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '3');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '4');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '5');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '6');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '7');
INSERT INTO chromosome (organism_id, chromosome_number) VALUES ((SELECT MAX(organism_id) FROM organism), '8');
