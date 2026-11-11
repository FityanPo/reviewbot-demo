# reviewbot-demo

Mini projet Maven pour tester ReviewBot sur GitHub.

## 1. Premier envoi (branche main : code propre, tests verts)
    git init -b main
    git add .
    git commit -m "Projet de demo"
    git remote add origin https://github.com/VOTRE-COMPTE/reviewbot-demo.git
    git push -u origin main

Vérification locale : `mvn test` (2 tests, tout vert).

## 2. Créer la PR « pleine de défauts »
    git checkout -b feature/divide
    copy pour-la-PR\src\main\java\demo\Calc.java src\main\java\demo\Calc.java
    copy pour-la-PR\src\test\java\demo\CalcTest.java src\test\java\demo\CalcTest.java
    git add src
    git commit -m "Ajout de divide et describe"
    git push -u origin feature/divide
Puis ouvrir une Pull Request feature/divide -> main sur GitHub.

Ce que ReviewBot doit trouver : plus de javadoc, une chaîne de if/else longue, une variable
inutilisée, un import inutile, division sans contrôle de zéro, un test qui échoue (describeOne).
(Ne commitez pas le dossier pour-la-PR si vous voulez un dépôt propre : supprimez-le après la copie.)
