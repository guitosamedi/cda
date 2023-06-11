Contraintes

Session (JO)

> saison associée (été ou hiver)

Athlete
Le poid peut varier entre deux session (JO)
Peut changer d'équipe entre deux session (JO)
Doit avoir un genre -> H ou F

Equipe
le code de l'équipe est international ex: FRA

Epreuve
l'epreuve a un statut individuel en équipe
rattaché à un sport

Dictionnaire de données

- Saison (enum)
  -- Id_Saison
  -- Nom

- Session
  -- Id_Session
  -- Annee
  -- Id_Ville
  -- Id_Saison
  -- Date_Ouverture
  -- Date_Cloture

- Epreuve
  -- Id_Epreuve
  -- Nom
  -- Statut
  -- Id_Sport
  -- Id_Sexe

- Sport
  -- Id_Sport
  -- Nom

- Epreuve_Statut
  -- Individuel
  -- Par_Equipe

- Equipe
  -- Id_Equipe
  -- Code
  -- Nom

- Ville
  -- Id_Ville
  -- Nom

- Civilite (enum)
  -- Civilite (Madame, Monsieur)
  -- Sexe (M, F)

- Athlete
  -- Id_Athlete
  -- Prenom
  -- Nom
  -- Date_de_Naissance
  -- Civilite
  -- Id_Poids
  -- Taille

- Athlete_resultat
  -- Id_Athlete_Resultat
  -- Id_Athlete
  -- Id_Resultat

- Resultat
  -- Id_resultat
  -- Id_Session
  -- Id_Classement
  -- Id_Score

- Classement (enum)
  -- Id_Classement
  -- Nom

- Score(enum)
  -- Id_Score
  -- Nom
