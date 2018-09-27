package com.example.kaak.memory;

public class CartesMemory {
/* il s'agit des cartes posées sur la table
elels peuvent avoir une valuer (de 0 à 6, corespondant à un dessn)
apres appel methode tirage au sort
elle peuvent etre dans un etat retourné ou non
un compteur doubleJeu peut compter le nombre de cartes retournées et s'assurer que pas plus de 2
elles peuvent etre retirées du jeu si couple et donc état retiré
(compteur pour que si toutes retirées=fin jeu?)
*/

    private int position;
    private int figure = 0;
    private int image;
    boolean retournée = false; // dos visible)
    boolean retirée = false; // quand couple formé et retiré

    //int dos = le type de dos choisi : à rajouter?
    // par ex si on cre une nouvelle partie avec un deck different


    //constructeurs
    //juste une definition de son numero au demarrage (position de 0 à 11)
    public CartesMemory(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getFigure() {
        return figure;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setFigure(int figure) {
        this.figure = figure;
    }

//methode pour retourner carte (afficher figure)
//    public void retourne(){
 //       if (figure==0) {
  //          this.setFigure(monDeck.get(0));
   //         button0.setBackgroundResource(R.drawable.img1);

  //      }
   // }


    //methode pour tirage au sort de la figure
    private int tirage() {
        int min = 1;
        int max = 6;
        int rnd = (int) (Math.random() * (max - min + 1)) + min;
        return rnd;

    }

    //on cree objet carte memory(0) puis carte memory (1) ... jusqu'à 11 avec conctructeur
    // on appelle tirage pour chaque objet et on place resultat ds tirage (nume 0-6)
    // probleme : il faut que chaque chiffre de tirage soit pris 2 fois
    // il faut donc inverser : le tirage consustera p chaque chiffre à toruver la carte?
    // ou alors, on part des chiffres 1 à 6 et on attribue chacun 2 fois
    // en verifiant que champ nul (pas deja attrbué)
    // ou alors

//on iuvre un tabkeau a 12 position. pour chaque case random 0 a 12 mais on verifie que pas deja selectionné
    //(o chaque choix de numero, on active un boolena qui dit que deja pris
    //pb : à la fin, retirage au sort sans arret???
    //on divise le nombre ar 2 avant de l'attribuer a objet
//ou alors tableau defini 0 0 1 1 ... on prends une case, tirage aleatoire de sa position et on attribut
//a objet, en verifiant que son int est bien nul

// ou lord tableau 2 entrées? ??
// idealement : un tableau fini quon perlute avant dattribuer

//ou on met valeaus ginies ds un tableau
//hasard : on reparti chaque valeur

//ou alors faux tirage:pas bon...*

// ou alors permutation la + simple des elements du tableau p obtenir tablea upermut
//on prends 1er, on tire aleatoirement sur les autres ; sauf si donne 1 ou moins
//On permute. 2eme : idem, sauf si donne 2 ou moins...avnt dernier avec dernier


}








