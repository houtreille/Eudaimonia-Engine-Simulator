# Configuration PostgreSQL Docker

Cette configuration Docker permet de démarrer une instance PostgreSQL pour le projet Eudaimonia Engine Simulator.

## Configuration

- **Image** : PostgreSQL 15 Alpine
- **Port** : 5435 (externe) → 5432 (interne)
- **Base de données** : `eudaimonia_db`
- **Utilisateur** : `eudaimonia_user`
- **Mot de passe** : `password`
- **Schéma** : `EES` (créé automatiquement au démarrage)

## Utilisation

### Démarrer la base de données

```bash
cd tools/db
docker-compose up -d
```

### Arrêter la base de données

```bash
docker-compose down
```

### Arrêter et supprimer les volumes (⚠️ ATTENTION : supprime toutes les données)

```bash
docker-compose down -v
```

### Voir les logs

```bash
docker-compose logs -f postgres
```

### Se connecter à la base de données

```bash
# Via docker exec
docker exec -it eudaimonia-postgres psql -U eudaimonia_user -d eudaimonia_db

# Via client PostgreSQL local
psql -h localhost -p 5435 -U eudaimonia_user -d eudaimonia_db
```

## Scripts d'initialisation

Les fichiers SQL placés dans le dossier `init/` seront exécutés automatiquement au premier démarrage du conteneur.

### Scripts inclus :
- `01-create-schema.sql` : Crée le schéma `EES` et configure les privilèges nécessaires

## Volumes

- `postgres_data` : Volume Docker pour persister les données de la base

## Health Check

Le conteneur inclut un health check qui vérifie que PostgreSQL est prêt à accepter des connexions. 