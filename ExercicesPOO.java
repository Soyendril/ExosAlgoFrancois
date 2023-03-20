import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ExercicesPOO {

// Boite à outils


    public static String demande(){
        Scanner nom = new Scanner(System.in);
        return nom.nextLine();

    }
    public static String demande(String message){
        System.out.println(message);
        return demande();
    }
    public static int demandeInt(){
        System.out.println("entrez un nombre");
        return Integer.parseInt(demande());
    }

    public static double demandeDouble(){
        System.out.println("entrez un nombre");
        return Double.parseDouble(demande());
    }

    public static int demandeInt(int valeur){
        System.out.println(valeur);
        return demandeInt();
    }
    public static void escalier(int nombre) {

        for (int compteurligne = 0; compteurligne <= nombre; compteurligne += 1) {
            for (int compteuretoile = 0; compteuretoile < compteurligne; compteuretoile++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void escalierDecroissante(int nombre){
        for (int i=nombre; i>0; i--){
            for(int niveau=0; niveau < i; niveau++){
                System.out.print("*");
            }
            System.out.println();
        }
    }





// EXERCICE 1 "AFFICHER BIENVENUE"


    public static void demanderNom(){

        String res =demande("Quel est votre nom?");
        System.out.println("bienvenue "+res);
    }

    //EXERCICE 2 "DEMANDER SOMME"


    public static void demanderSommeNombres(){
        int val1 =demandeInt();
        int val2 =demandeInt();
        int res = val1+val2;
        System.out.println("voici la somme de "+val1+" et "+ val2+": "+res);

    }

    // Exercice 3 "DEMANDER COUT/VENTE"

    public static void demanderCout(){
        System.out.println("Entrez le cout de fabrication puis le prix de Vente");
        int fabrication =demandeInt();
        int vente =demandeInt();
        int res = vente - fabrication;
        if (res<=0){
            System.out.println("vous avez une perte de: "+res+"€");
        }else{
            System.out.println("vous avez un gain de: "+res+"€");
        }

    }

    //Exercice 4 "TROUVER LE MAX"

    public static void trouverMax(){
        int valeur1 =demandeInt();
        int valeur2 =demandeInt();
        int valeur3 =demandeInt();
        if ((valeur1 >= valeur2)&(valeur1>=valeur3)){
            System.out.println("la valeur max est: "+valeur1);
        }else if ((valeur2>=valeur1) & (valeur2>=valeur3)) {
            System.out.println("la valeur max est: " + valeur2);
        }else{
            System.out.println("la valeur max est: "+valeur3);
        }

    }

    //Exercice 5 "PROF"

    public static void appreciation(){
    int note =demandeInt();
    if ((note>=18)&&(note<=20)){
        System.out.println("Excellent");
    } else if ((note>=15)&&(note<18)) {
        System.out.println("Bien");
    } else if ((note>=12)&&(note<15)) {
            System.out.println("assez bien");
    }else if ((note>=10)&&(note<12)) {
            System.out.println("peut mieux faire");
    }else if ((note>=5)&&(note<10)) {
            System.out.println("Insufisant");
    }else if ((note>=0)&&(note<5)) {
            System.out.println("Catastrophique");
    }else{
            System.out.println("veuillez entrer une note entre 0 et 20");
            appreciation();
    }
    prof();
}

    public static void prof() {
        System.out.println("Options:");
        System.out.println("1: Ajouter une note");
        System.out.println("2: Quitter");
        String res = Outils.demande("quel est votre choix???");
        switch (res) {
            case "1":
                appreciation();
                break;
            case "2":
                return;

        }
    }


    //Exercice 6 "CALCULATRICE"

    public static void calculatrice(){
        int valeur1 = demandeInt();
        System.out.println("entrez un opérateur:");
        String operateur =demande();
        int valeur2 = demandeInt();

        if (operateur.equals("+")){
            int res= valeur1+valeur2;
            System.out.println("resultat de votre calcul: "+res);
        } else if (operateur.equals("-")) {
            int res= valeur1-valeur2;
            System.out.println("resultat de votre calcul: "+res);
        } else if (operateur.equals("*")) {
            int res= valeur1*valeur2;
            System.out.println("resultat de votre calcul: "+res);
        } else if (operateur.equals("/")) {
            int res= valeur1/valeur2;
            System.out.println("resultat de votre calcul: "+res);

        }

    }

    //EXERCICE 7 "SOMME"

    public static void somme(){
        int N=demandeInt();
        int valeurinit = N;
        int cpt=0;
        while (N>0){
            cpt =cpt+N;
            N--;
        }
        System.out.println("voici la somme de tous les nombre de 0 à "+valeurinit+": "+cpt);
    }

    //EXERCICE 8 "ESCALIER"

    public static void escalier() {
        int nombre=demandeInt();
        for (int compteurligne = 0; compteurligne <= nombre; compteurligne += 1) {
            for (int compteuretoile = 0; compteuretoile < compteurligne; compteuretoile++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //EXERCICE 9 " DROLE D'ESCALIER"
    public static void droleEscalier(){
        int nombre = demandeInt();
        escalier(nombre);
        escalierDecroissante(nombre);
    }


    //EXERCICE 10 "Pyramide Droite"


    public static void pyramideDroite(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la hauteur de la pyramide : ");
        int hauteur = sc.nextInt();
        sc.close();

        int largeur = 1;
        int espaces = hauteur - 1;
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < espaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < largeur; j++) {
                System.out.print("*");
            }
            System.out.println();
            largeur += 2;
            espaces--;
        }
    }

    // EXERCICE 11

    public static void monnaie(){
        double cpt500=0;
        double cpt200=0;
        double cpt100=0;
        double cpt50=0;
        double cpt20=0;
        double cpt10=0;
        double cpt5=0;
        double cpt2=0;
        double cpt1=0;
        double cpt50ct=0;
        double cpt20ct=0;
        double cpt10ct=0;
        double cpt5ct=0;
        double cpt2ct=0;
        double cpt1ct=0;
        double montant=demandeDouble();
        while (montant>(double)0.009){//petite magouille pour eviter l'erreur avec le 1 centime
            if((montant-500)>0){
                cpt500++;
                montant = montant-500;
            } else if ((montant-200)>0) {
                cpt200++;
                montant = montant-200;
            } else if ((montant-100)>0) {
                cpt100++;
                montant = montant-100;
            } else if ((montant-50)>0) {
                cpt50++;
                montant = montant-50;
            } else if ((montant-20)>0) {
                cpt20++;
                montant = montant-20;
            } else if ((montant-10)>0) {
                cpt10++;
                montant = montant-10;
            } else if ((montant-5)>0) {
                cpt5++;
                montant = montant-5;
            } else if ((montant-2)>0) {
                cpt2++;
                montant = montant-2;
            } else if ((montant-1)>0) {
                cpt1++;
                montant = montant-1;
            } else if ((montant-0.5)>0) {
                cpt50ct++;
                montant = montant-0.5;
            } else if ((montant-0.2)>0) {
                cpt20ct++;
                montant = montant-0.2;
            } else if ((montant-0.1)>0) {
                cpt10ct++;
                montant = montant-0.1;
            }else if ((montant-0.05)>0) {
                cpt5ct++;
                montant = montant-0.05;
            }else if ((montant-0.02)>0) {
                cpt2ct++;
                montant = montant-0.02;
            }else if ((montant-0.01)>0) {
                cpt1ct++;
                montant = montant-0.01;
            }
        }
        System.out.println("billet de 500: "+cpt500+", billet de 200: "+cpt200+", billet de 100: "+cpt100+",billet de 50:"+cpt50
        +",billet de 20 :"+cpt20+",billet de 10: "+cpt10+", billet de 5: "+cpt5+", pièce de 2: "+cpt2+", piece de 1 :"+cpt1+
                "pièce de 50cts :"+cpt50ct+", piece de 20cts :"+cpt20ct+"piece de 10cts :"+cpt10ct+"piece de 5cts :"+ cpt5ct
        +"piece de 2cts :"+cpt2ct+"piece de 1cts :"+cpt1ct);
// Désolé c'est vraiment pas Beau cette méthode le dry n'est pas respecté
    }

    //EXERCICE 12 "Temperature"

    public static void temperature(double[] params){
        double proche = params[0];
        for(double valeur: params){
            if (Math.abs(valeur) < Math.abs(proche)){
                proche = valeur;
            }
        }
        System.out.println ("la température la plus proche de 0°C est: "+ proche +"°C");

    }



    //EXERCICE 13 "Tri Croissant"

    public static void tri(double[] params){
        double[] result = new double[params.length];
        for (int i = 0; i < params.length; i++) {
            double min = params[0];
            int minIndex = 0;
            for (int j = 0; j < params.length; j++) {
                if(params[j] < min){
                    min = params[j];
                    minIndex = j;
                }
            }
            result[i] = min;
            params[minIndex] = Double.MAX_VALUE;
        }
        System.out.println(Arrays.toString(result));

    }

    public static void main(String[] args) {
        double[] params = new double[]{-12.0,5.0,25.0,1.0,-0.00255,-0.25};// me sert de tableau pour les exos avec les listes
        tri(params);

    }

}
