package com.example.kaak.memory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    ImageView ivTitre;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11;
    Button btnReset, btnScores, btnQuitter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//il faudra faire 1er activité avec image, boutton Demarrer qui arrive ici
        //avec deja un tirage au sort et les cartes pretes? (ou alors à partir du bouton du bas=reset?)

        //tirage au sort : 6 cartes pour 12 positions
        // tirage carte1 carte1 (chiffre entre 0 et 11) puis tirage acrte2 ...
        // //à chaque fois il faut tester ue pas deja choisi sinon retirer?
        // ou alors : position 0 : carte 0 à 5, position 1 idem, position 1 : carte

        //onclick sur une carte :
        // compteur de score
        // compteur de double jeu (1 carte puis 1 carte puis on cache)
        // on releve quelle carte
        //on l'affiche
        //si deja une carte de retournée -> compare
        //sinon rien (on attends autre click)



//-> compare
        //si pareil : message de felicitation -> reste des cartes ou fin jeu?
        //sinon on retourne les 2 carrtes au  out delai ou click

//-> reste des cartes ou fin jeu?
      //si fin jeu fenetre felicitation + nombre couo
        // puis on va sur scores? ou pas forcement ( bouton, dispo en bas et perte temps)



    }
}
