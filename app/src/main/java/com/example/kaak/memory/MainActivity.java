package com.example.kaak.memory;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {


    ImageView ivTitre;
    Button[] buttons = new Button[12];
    CartesMemory[] cartesMemories = new CartesMemory[12];
    ArrayList<Integer> monDeck;
    int[] imagesResources = new int[6];
    //Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11;
    Button btnReset, btnScores, btnQuitter;
    int doubleJeu = 0;
    Handler handler = new Handler();



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

    //int[] carte = {1, 4, 6, 1, 5, 3, 6, 2, 4, 2, 3, 5};//on zappe le random

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//init les find view by id
        initialisation();

        imagesResources[0] = R.drawable.img1;
        imagesResources[1] = R.drawable.img2;
        imagesResources[2] = R.drawable.img3;
        imagesResources[3] = R.drawable.img4;
        imagesResources[4] = R.drawable.img5;
        imagesResources[5] = R.drawable.img6;

        //imagesResources = new int[]{R.drawable.img1,R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6 };

        btnScores = findViewById(R.id.btnScores);
        btnReset = findViewById(R.id.btnReset);
        btnQuitter = findViewById(R.id.btnQuitter);

//tableau de données
        //ArrayList<Integer> monDeck = new ArrayList<>();
 /*       monDeck.add(0);
        monDeck.add(0);
        monDeck.add(1);
        monDeck.add(1);
        monDeck.add(2);
        monDeck.add(2);
        monDeck.add(3);
        monDeck.add(3);
        monDeck.add(4);
        monDeck.add(4);
        monDeck.add(5);
        monDeck.add(5); */

        tirageAuSort();

 /*       for (int i = 0; i < monDeck.size(); i++) {
            int j = monDeck.get(i);
            System.out.println(j);
            //pour imprimer contenu de arraylist monDeck
        }
*/



        /*CartesMemory carte0 = new CartesMemory(0);
        CartesMemory carte1 = new CartesMemory(1);
        CartesMemory carte2 = new CartesMemory(2);
        CartesMemory carte3 = new CartesMemory(3);
        CartesMemory carte4 = new CartesMemory(4);
        CartesMemory carte5 = new CartesMemory(5);
        CartesMemory carte6 = new CartesMemory(6);
        CartesMemory carte7 = new CartesMemory(7);
        CartesMemory carte8 = new CartesMemory(8);
        CartesMemory carte9 = new CartesMemory(9);
        CartesMemory carte10 = new CartesMemory(10);
        CartesMemory carte11 = new CartesMemory(11);*/


//attribuer resultat tirage
 /*      for (int i = 0; i < monDeck.size(); i++) {
            int j = monDeck.get(i);
            //String carte = "";
            //carte = carte + i ;
            //resultat += arrayList.get(i) + "\n";
            //carte.set
            ("carte"+i).set
              }

              int i=1;
        "carte"+i.setFigure();
*/


        /*carte0.setFigure(monDeck.get(0));
        carte1.setFigure(monDeck.get(1));
        carte2.setFigure(monDeck.get(2));
        carte3.setFigure(monDeck.get(3));
        carte4.setFigure(monDeck.get(4));
        carte5.setFigure(monDeck.get(5));
        carte6.setFigure(monDeck.get(6));
        carte7.setFigure(monDeck.get(7));
        carte8.setFigure(monDeck.get(8));
        carte9.setFigure(monDeck.get(9));
        carte10.setFigure(monDeck.get(10));
        carte11.setFigure(monDeck.get(11));*/


        for (int i = 0; i < 12; i++) {
            final int position = i;
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "Je suis la carte " + position, Toast.LENGTH_SHORT).show();
                }
            });
        }

//affiche tous les dos si clique sur reset
        /*for (int i=1; i<12;i++)
        {
            String leBouton="button"+i;
            leBouton.setBackgroundResource(R.drawable.dos);
        }
        //je trouve pas
        */


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // ArrayList<Integer> monDeck = new ArrayList<>();
                tirageAuSort();


            }
        });

        /*
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*for (int i = 0; i < 12; i++) {
                 buttons[i].setBackgroundResource(R.drawable.dos);
             }

                for (int i = 0; i < 12; i++) {
                    int figure = cartesMemories[i].getFigure();
                    int image = imagesResources[figure];
                    cartesMemories[i].setImage(image);
                    buttons[i].setBackgroundResource(cartesMemories[i].getImage());
                }

            }
        });

        */


//affiche figure img1 si clique sur bouton score
        btnScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 12; i++) {
                    buttons[i].setBackgroundResource(R.drawable.img1);
                }

            }
        });

//afficher la bonne figure si clique sur bouton cliquer
        btnQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });


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
        /*
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (doubleJeu < 2)
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
*/


    }

    private void tirageAuSort() {
        monDeck = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            monDeck.add(i);
            monDeck.add(i);
        }

        Collections.shuffle(monDeck);

        for (int i = 0; i < 12; i++) {
            cartesMemories[i] = new CartesMemory(i);
        }

        for (int i = 0; i < 12; i++) {
            cartesMemories[i].setFigure(monDeck.get(i));
        }

        for (int i = 0; i < 12; i++) {
            int figure = cartesMemories[i].getFigure();
            int image = imagesResources[figure];
            cartesMemories[i].setImage(image);
            buttons[i].setBackgroundResource(cartesMemories[i].getImage());
        }

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "on cache", Toast.LENGTH_SHORT).show();
                for (int i = 0; i < 12; i++) {
                    buttons[i].setBackgroundResource(R.drawable.dos);
                }
            }
        };
        handler.postDelayed(runnable,2000);
    }

    private void initialisation() {
        buttons[0] = findViewById(R.id.button0);
        buttons[1] = findViewById(R.id.button1);
        buttons[2] = findViewById(R.id.button2);
        buttons[3] = findViewById(R.id.button3);
        buttons[4] = findViewById(R.id.button4);
        buttons[5] = findViewById(R.id.button5);
        buttons[6] = findViewById(R.id.button6);
        buttons[7] = findViewById(R.id.button7);
        buttons[8] = findViewById(R.id.button8);
        buttons[9] = findViewById(R.id.button9);
        buttons[10] = findViewById(R.id.button10);
        buttons[11] = findViewById(R.id.button11);
    }
}
