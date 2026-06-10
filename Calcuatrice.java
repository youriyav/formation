import java.util.Scanner;

public class Calcuatrice {

   static int addition(int a, int b){
        return  a+b;
    }
    static int soustration(int a, int b){
        return  a-b;
    }
    static int multiplication(int a, int b){
        return  a*b;
    } 
    static int division(int a, int b){
        return  a/b;
    } 
    /*
    Une fonction qui demande à l'utilisateur de rentrer 
    une valeur et de retourner cette entrée
     */
    static int lire_valeur(String message_a_afficher){
        Scanner scn= new Scanner(System.in);
        System.out.print(message_a_afficher);
        int valeur_scannee ;

        try {
                valeur_scannee = scn.nextInt();
            } catch (Exception e) {
                System.out.println("La valeur entréé est invalide");
                valeur_scannee=6;
            }

        return valeur_scannee;
    } 
    
    
    public static void main(String[] args) {
        int choix=0;
        /*
        affichage du menu et 
        récupération dE l'utilisateur
        ------------------------
        veuillez choisir votre opération:
        1 : Addition
        2 : Soustraction
        3 : Multiplication
        4 : Division
        ------------------------
        
         */
        
        do{
            System.out.println(
                "------------- Menu -----------\n"+
                "1 : Addition\n"+
                "2 : Soustraction\n"+
                "3 : Multiplication\n"+
                "4 : Division\n"+
                "------------------------\n"
            );
           
            choix =lire_valeur("veuillez entrer votre choix :");
         
        }while(choix>4);
        //-------------début------------ 
        int choix_1=1;
        int choix_2=2;
        int choix_3=3;
        int choix_4=4;


        
        if(choix==choix_1){
            System.out.println("Vous avez choisi l'addition");
            int premier_nombre =0;
            do {
                premier_nombre =lire_valeur("veuillez enter le premier nombre:");
               
            } while (premier_nombre==0);
            //fin traitement premier_nombre
            int second_nombre =0;
            do {
                second_nombre =lire_valeur("veuillez enter le second nombre:");
            
            } while (second_nombre==0);


            int resultat= addition(premier_nombre, second_nombre);
            System.out.print("la somme de "+premier_nombre+" et "+second_nombre+" fait : "+resultat);
        }
        if(choix==choix_2){
           System.out.println("Vous avez choisi la soustraction");
            int premier_nombre =lire_valeur("veuillez enter le premier nombre:");
            int second_nombre =lire_valeur("veuillez enter le second nombre: ");
            int resultat= soustration(premier_nombre, second_nombre);
            System.out.print("la différence entre "+premier_nombre+" et "+second_nombre+" fait : "+resultat);

        }
        if(choix==choix_3){
            System.out.println("Vous avez choisi la multiplication");
            int premier_nombre =lire_valeur("veuillez enter le premier nombre: ");
            int second_nombre =lire_valeur("veuillez enter le second nombre:");
            int resultat= multiplication(premier_nombre, second_nombre);
            System.out.print("la multiplication de  "+premier_nombre+" par "+second_nombre+" fait : "+resultat);
        }
        if(choix==choix_4){

            System.out.println("Vous avez choisi la division");
            int premier_nombre =lire_valeur("veuillez enter le premier nombre: ");
        
            int second_nombre = 0;
            do{
                second_nombre =lire_valeur("veuillez enter le second nombre: ");

            }while(second_nombre==0);
            int resultat= division(premier_nombre, second_nombre);
            System.out.print("la division de  "+premier_nombre+" par "+second_nombre+" fait : "+resultat);   
        }
    
        //-------------fin-------------
      // System.out.println("Vous avez choisi l'option : "+choix) ;
       //System.out.println("---------------- EXIT ---------------") ;
    }
}