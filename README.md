**R302-303 D´ev. efficace et Analyse**

# TP 2 : Listes chaînées

## 1.1 Liste simple d’entiers
Implémenter une définition récursive de liste simplement chaînée pour des éléments de type `Integer` qui supporte les opérations suivantes :<br>
`size()` : retourne le nombre d’éléments contenus dans la liste<br>
`isEmpty()` : retourne true si la liste est vide, et false sinon<br>
`first()` : retourne (mais ne supprime pas) le premier élément dans la liste<br>
`last()` : retrourne (mais ne supprime pas) le dernier élément dans la liste<br>
`addFirst(e)` : ajoute un nouvel élément en début de liste<br>
`addLast(e)` : ajoute un nouvel élément en fin de liste<br>
`removeFirst()` : supprime et retourne le premier élément de la liste<br>

Pour cela, tenir compte des remarques suivantes.<br>
- Si first (), last () ou removeFirst() sont appelées depuis une liste vide on retournera simplement `null` sans modifier la liste.<br>
- On utilisera la notion Java de classe interne statique (ou nested class) pour d´efinir une classe `private static` Node dont la portée sera limitée à la classe `public` SinglyListClass.<br>
Consulter la doc java pour plus de d´etails : https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html<br>
- Quelle diff´erence cela ferait-il si la classe Node n’´etait pas d´eclarée `static` ? Consulter la doc java.<br>
