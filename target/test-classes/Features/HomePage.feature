Feature: homepage verif menu 

Scenario: acceder à chaque menu de la page d'accueil 

Given : utilisateur est connecte avec le bon username et bon password

When utilisateur clique sur le menu acceuil "<menu>"

Then la page de menu est affiché "<menu>"

Examples:
|menu         |
|Admin        |
|PIM          |
|Leave        |
|Time         |
|Recruitment  |
|My Info      |
|Performance  |
|Dashboard    |
|Directory    |
|Maintenance  |
|Claim        |
|Buzz         |