-- Création du schéma EES pour le projet Eudaimonia Engine Simulator
CREATE SCHEMA IF NOT EXISTS EES;

-- Attribution des privilèges sur le schéma à l'utilisateur eudaimonia_user
GRANT ALL PRIVILEGES ON SCHEMA EES TO eudaimonia_user;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA EES TO eudaimonia_user;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA EES TO eudaimonia_user;

-- Configuration pour que les futures tables créées dans ce schéma appartiennent à eudaimonia_user
ALTER DEFAULT PRIVILEGES IN SCHEMA EES GRANT ALL PRIVILEGES ON TABLES TO eudaimonia_user;
ALTER DEFAULT PRIVILEGES IN SCHEMA EES GRANT ALL PRIVILEGES ON SEQUENCES TO eudaimonia_user; 