<img width="600" height="900" alt="logo" src="https://github.com/user-attachments/assets/eb1ba566-8ef0-4251-b78d-f1a81a09188b" />



# 📋 ZENTASK — Système de Suivi de Projets

> Application web full-stack de gestion et suivi de projets pour sociétés de services, développée avec **Spring Boot** et **React**.

---

## 📌 Description

**Zentask** est une application de suivi de projets destinée aux sociétés de services (développement logiciel, études techniques, intégration, assistance). Elle centralise l'ensemble des informations liées aux projets afin d'assurer une visibilité complète sur leur évolution, d'améliorer la coordination entre les intervenants et de sécuriser les opérations de mise à jour selon les responsabilités de chaque utilisateur.

---
## ❓ Problématique : 

Les sociétés de services peinent à gérer efficacement leurs projets faute d'un outil commun, ce qui entraîne un manque de coordination entre les équipes. Les informations sont dispersées et le suivi financier reste souvent manuel et peu fiable. Face à ces difficultés, il est essentiel de mettre en place une solution centralisée, sécurisée et adaptée aux rôles de chaque utilisateur. C'est dans ce contexte que s'inscrit le développement de cette application de suivi de projets.

---

## 🎯 Objectifs

- Centraliser la gestion des projets, phases et livrables au sein d'une interface unifiée
- Contrôler les accès et les actions selon les rôles fonctionnels (directeur, chef de projet, comptable, secrétaire, etc.)
- Offrir un suivi financier complet : facturation, paiement et reporting par période
- Conserver un historique fiable et exploitable des projets en cours et clôturés

---

## 🏗️ Architecture du projet

```
┌─────────────────────────────────────────────────────────┐
│                      CLIENT (Browser)                   │
│                  React + Axios + Redux                  │
└─────────────────────────┬───────────────────────────────┘
                          │ HTTP/REST (JSON)
                          ▼
┌─────────────────────────────────────────────────────────┐
│               Backend — Spring Boot API                  │
│   Controllers → Services → Repositories (JPA)           │
│              Spring Security (JWT)                       │
└─────────────────────────┬───────────────────────────────┘
                          │
                          ▼
┌─────────────────────────────────────────────────────────┐
│              Base de données — MySQL                     │
│          (Projets, Phases, Livrables, Employés)          │
└─────────────────────────────────────────────────────────┘

          Toute l'infrastructure est conteneurisée via Docker
```

### Backend (Spring Boot)
- API REST exposant les ressources projets, phases, livrables, utilisateurs
- Sécurisation des endpoints via JWT et contrôle des rôles
- Gestion de la persistance avec Spring Data JPA / Hibernate

### Frontend (React)
- Interface SPA avec routage protégé selon le rôle
- Tableaux de bord interactifs, formulaires de saisie et recherche avancée
- Consommation de l'API REST via Axios

### Base de données
- MySQL — modèle relationnel complet (Projet, Phase, Livrable, Employé, Organisme client)

### Infrastructure (Docker)
- Conteneurisation du backend, du frontend et de la base de données
- Orchestration via `docker-compose`

---

## 🛠️ Technologies utilisées

### Backend
- Java 21
- Spring Boot 4.0.3
- Spring Security + JWT
- Spring Data JPA / Hibernate
- Maven

### Frontend
- React 18
- React Router DOM
- Axios
- Redux Toolkit
- Tailwind CSS / Bootstrap

### Base de données
- MySQL 8

### DevOps
- Docker & Docker Compose
- Git / GitHub
- PostMan

---

## 📁 Structure du projet

```
projet-suivi/
├── backend/
│   ├── src/
│   │   ├── main/java/com/projettrack/
│   │   │   ├── controllers/
│   │   │   ├── services/
│   │   │   ├── repositories/
│   │   │   ├── models/
│   │   │   └── security/
│   │   └── resources/
│   │       └── application.properties
│   └── pom.xml
│
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── services/
│   │   └── store/
│   └── package.json
│
└── docker-compose.yml
```

---

## ⚙️ Installation et exécution

### Prérequis
- Java 21+
- Node.js 18+
- Maven 3.8+
- Docker & Docker Compose (optionnel)
- MySQL 8 (si sans Docker)

### Cloner le projet

```bash
git clone https://github.com/votre-username/projet-suivi.git
cd projet-suivi
```

### 🐳 Lancer avec Docker (recommandé)

```bash
docker-compose up --build
```

> L'application sera disponible sur `http://localhost:3000`  
> L'API backend sur `http://localhost:8080`

---

### 🔧 Lancer sans Docker

#### Backend

```bash
cd backend
mvn spring-boot:run
```

#### Frontend

```bash
cd frontend
npm install
npm start
```

---

## 🔐 Sécurité

| Aspect | Détail |
|---|---|
| **Authentification** | JWT (JSON Web Token) — login avec matricule et mot de passe |
| **Gestion des rôles** | Directeur, Chef de Projet, Comptable, Secrétaire, Administrateur, Employé |
| **Protection des routes** | Routes frontend et endpoints API protégés selon le profil utilisateur |
| **Mots de passe** | Hashage BCrypt |

---

## ✨ Fonctionnalités principales

### 👤 Gestion des utilisateurs (Administrateur)
- Création, modification et suppression des comptes
- Affectation des rôles et profils fonctionnels

### 📂 Gestion des projets
- Création et mise à jour des projets (secrétaire : infos administratives / directeur : toutes les infos)
- Association à un organisme client et affectation d'un chef de projet
- Ajout de documents techniques liés au projet

### 📊 Gestion des phases (Chef de Projet)
- Décomposition du projet en phases planifiées
- Affectation des employés par phase
- Gestion des états : réalisation, facturation, paiement
- Calcul automatique du montant de la phase (% du montant total)

### 📎 Gestion des livrables
- Ajout de livrables par phase avec fichier associé
- Traçabilité documentaire complète

### 💰 Suivi financier (Comptable)
- Facturation des phases terminées
- Mise à jour des états de paiement
- Recherche par période : phases non facturées, facturées non payées, payées

---

## 📈 Dashboard / Reporting

- Vue d'ensemble des projets en cours et clôturés
- Indicateurs financiers : montants engagés, facturés, encaissés
- Liste des phases par état (à facturer, en attente de paiement, soldées)
- Historique des collaborations par organisme client

---

## 🎬 Vidéo de démonstration

> 📹 **[Cliquez ici pour regarder la démo complète](https://www.youtube.com/watch?v=VOTRE_LIEN)**

La vidéo couvre :
- Connexion et gestion des rôles
- Création et suivi d'un projet complet
- Gestion des phases et livrables
- Suivi financier (comptable)
- Dashboard et reporting

---

## 📖 TEST Profil et Login : 

https://github.com/user-attachments/assets/6c8f2faf-64b1-4dc5-b533-d9a2b8f30e03

## TEST Organisme

https://github.com/user-attachments/assets/c9b67723-49f1-434b-9554-29f93bb2a9b0

## TEST Employe

https://github.com/user-attachments/assets/d64dffeb-67d0-4d24-b64e-406b47fc3cb9

## TEST Projet

https://github.com/user-attachments/assets/7e381bfe-72b0-4058-9b69-caae120f0574

## TEST Phase 

https://github.com/user-attachments/assets/bbb186d0-dc7b-4dc4-8ff3-f82c53478ac0

## TEST Livrable

https://github.com/user-attachments/assets/8ebe1bf3-ef6a-445a-8e03-b2e6a588c131

## TEST Facture

https://github.com/user-attachments/assets/00208998-a6c5-4dce-8e89-2c7d5ead2675

## TEST Document

https://github.com/user-attachments/assets/6c7e3e5d-2e3f-49bd-88ca-4885b9f41963

## TEST Affectation

https://github.com/user-attachments/assets/7a6374ca-cd39-4f56-84bd-6f0b5b4cb915


## 🧪 Tests

- Tests unitaires : JUnit 5 + Mockito (services & repositories)
- Tests d'intégration : Spring Boot Test
- Tests API : Postman Collection disponible dans `/docs/postman/`

---

## 🐋 Conteneurisation

| Fichier | Rôle |
|---|---|
| `backend/Dockerfile` | Image du serveur Spring Boot |
| `frontend/Dockerfile` | Image de l'application React (Nginx) |
| `docker-compose.yml` | Orchestration des 3 services (backend, frontend, mysql) |

---

## 👨‍💻 Auteurs

| Nom | Profile |
|---|---|
| **Othmane EL MATLINI** | https://github.com/OTHMANE-ELM |
| **Amine BAANI** | https://github.com/baaniamine |
| **Mohammed Amine EL BOUKBIRI** | https://github.com/mohammed-amine-elboukbiri |

---


















https://github.com/user-attachments/assets/6c8f2faf-64b1-4dc5-b533-d9a2b8f30e03

## DevOps workflow

Ce depot contient maintenant deux workflows :

- un workflow simple `GitHub -> Jenkins -> Docker -> Kubernetes`
- un workflow complet de type `GitHub -> Jenkins CI -> OWASP -> SonarQube -> Trivy -> Docker -> Jenkins CD -> GitHub GitOps -> ArgoCD -> Kubernetes`

### Fichiers ajoutes

- `Jenkinsfile` : pipeline Jenkins CI
- `.jenkins/Jenkinsfile.cd` : pipeline Jenkins CD
- `.jenkins/update_gitops_images.sh` : mise a jour de la version des images dans le dossier GitOps
- `Dockerfile` : image Docker du backend Spring Boot
- `frontend/Dockerfile` : image Docker du frontend React
- `frontend/nginx.conf` : serveur Nginx avec proxy `/api` vers le backend
- `k8s/` : manifests Kubernetes
- `k8s/gitops/` : manifests suivis par ArgoCD
- `argocd/application.yaml` : application ArgoCD
- `monitoring/README.md` : base pour Prometheus/Grafana

### Fonctionnement

1. Le code est pousse sur GitHub.
2. Le job Jenkins CI recupere le depot.
3. Jenkins CI execute les tests backend et le build frontend.
4. Jenkins CI lance :
   - `OWASP Dependency Check`
   - `SonarQube analysis + quality gate`
   - `Trivy filesystem scan`
5. Jenkins CI construit et pousse les images Docker backend/frontend.
6. Jenkins CI lance un `Trivy image scan`.
7. Jenkins CI declenche le job Jenkins CD.
8. Jenkins CD met a jour `k8s/gitops/kustomization.yaml` avec le nouveau tag.
9. Jenkins CD pousse cette modification sur GitHub.
10. ArgoCD detecte le changement et deploie automatiquement sur Kubernetes.
11. Prometheus et Grafana servent pour le monitoring.

### Prerequis Jenkins

- Installer `Docker`, `kubectl`, `npm` et un JDK 21 sur l agent Jenkins
- Ajouter un credential Jenkins `dockerhub-creds`
- Ajouter un credential Jenkins `github-push-creds`
- Configurer les plugins Jenkins :
  - SonarQube Scanner
  - OWASP Dependency-Check
  - Email Extension
- Installer sur l agent Jenkins :
  - `trivy`
  - `dependency-check.sh`
- Adapter dans [`Jenkinsfile`](/Users/amine/Desktop/Application-Full-Stack-de-Gestion-de-Projets/Jenkinsfile) :
  - `IMAGE_NAMESPACE`
  - `SONARQUBE_ENV`
  - `CD_JOB_NAME`
- Adapter dans [`argocd/application.yaml`](/Users/amine/Desktop/Application-Full-Stack-de-Gestion-de-Projets/argocd/application.yaml) :
  - `repoURL`
  - `targetRevision`

### Secrets Kubernetes

Le fichier `k8s/secret.example.yaml` est un exemple. Remplace les valeurs avant utilisation :

- `SPRING_DATASOURCE_PASSWORD`
- `JWT_SECRET`
- `MYSQL_ROOT_PASSWORD`
- `MYSQL_PASSWORD`

### Images Docker

Backend :

```bash
docker build -t your-dockerhub-user/project-management-backend:latest .
```

Frontend :

```bash
docker build -t your-dockerhub-user/project-management-frontend:latest ./frontend
```

### Deploiement Kubernetes manuel

```bash
kubectl apply -f k8s/namespace.yaml
kubectl apply -f k8s/secret.example.yaml
kubectl apply -f k8s/configmap.yaml
kubectl apply -f k8s/mysql.yaml
kubectl apply -f k8s/backend.yaml
kubectl apply -f k8s/frontend.yaml
kubectl apply -f k8s/ingress.yaml
```

### Deploiement GitOps avec ArgoCD

1. Installer ArgoCD dans le cluster
2. Appliquer [`argocd/application.yaml`](/Users/amine/Desktop/Application-Full-Stack-de-Gestion-de-Projets/argocd/application.yaml)
3. Donner a ArgoCD acces au repo GitHub
4. Laisser Jenkins CD mettre a jour `k8s/gitops/kustomization.yaml`

ArgoCD synchronisera ensuite automatiquement le dossier [`k8s/gitops`](/Users/amine/Desktop/Application-Full-Stack-de-Gestion-de-Projets/k8s/gitops).
