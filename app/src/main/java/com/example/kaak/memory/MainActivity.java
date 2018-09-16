package com.example.kaak.memory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView ivTitre;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11;
    Button btnReset, btnScores, btnQuitter;
    int doubleJeu = 0;

/*
        //12 cartes; indiquent 0 au debut=carte de dos (sinon indiquent 1 à 6 = une des 6 valurs possibles)
        int[] laCarte={0,0,0,0,0,0,0,0,0,0,0,0};
        int[] figure={0,0,0,0,0,0,0};// 7 cas p que choix figure1= figure[1]; on ignore fig0


        int min=1;
        int max=6;
        for(int i=0; i<12 ; i++ )
        {
            int j=0; //compteur choix
            int rnd = (int) (Math.random() * (max - min + 1)) + min;
            carte[i] = rnd;//pb=il faut exclure les chiffres deja choisi
        }
        //methode de tirage
    //methode de comparaison
    //si rnd=1 augmenter compteur cptpour figure1=figure[1] : 1 2 puis ne peut etre choisi

    */

    int[] carte = {1, 4, 6, 1, 5, 3, 6, 2, 4, 2, 3, 5};//on zappe le random

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);


        //affiche tous les dos
        /*for (int i=1; i<12;i++)
        {
            String leBouton="button"+i;
            leBouton.setBackgroundResource(R.drawable.dos);
        }
        //je trouve pas
        */
        button0.setBackgroundResource(R.drawable.dos);

        //affiche ttes les cartes
        button0.setBackgroundResource(R.drawable.img1);
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
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doubleJeu< 2)
                    button0.setBackgroundResource(R.drawable.img1);
                doubleJeu++;
                // else retourner les 2 cartes

            }
        });


//-> compare
        //si pareil : message de felicitation -> reste des cartes ou fin jeu?
        //sinon on retourne les 2 carrtes au  out delai ou click

//-> reste des cartes ou fin jeu?
        //si fin jeu fenetre felicitation + nombre couo
        // puis on va sur scores? ou pas forcement ( bouton, dispo en bas et perte temps)


    }
}
