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
        Scanner scn;
        do{
            System.out.println(
                "------------- Menu -----------\n"+
                "1 : Addition\n"+
                "2 : Soustraction\n"+
                "3 : Multiplication\n"+
                "4 : Division\n"+
                "------------------------\n"
            );
            // Creating Scanner object
            scn = new Scanner(System.in);
            System.out.print("veuillez entrer votre choix :");
            try {
                choix = scn.nextInt();
            } catch (Exception e) {
                System.out.println("La valeur entréé est invalide");
                choix=6;
            }

            
        }while(choix>4);
        //-------------début------------ 
        int choix_1=1;
        int choix_2=2;
        int choix_3=3;
        int choix_4=4;

    
        scn = new Scanner(System.in);
        if(choix==choix_1){
            System.out.println("Vous avez choisi l'addition");
            
            System.out.print("veuillez enter le premier nombre: ");
            int premier_nombre = scn.nextInt();
            
            System.out.print("veuillez enter le second nombre: ");
            scn = new Scanner(System.in);
            int second_nombre = scn.nextInt();
            int resultat= addition(premier_nombre, second_nombre);
            System.out.print("la somme de "+premier_nombre+" et "+second_nombre+" fait : "+resultat);


        }
        if(choix==choix_2){
           System.out.println("Vous avez choisi la soustraction");
            System.out.print("veuillez enter le premier nombre: ");
            int premier_nombre = scn.nextInt();
            
            System.out.print("veuillez enter le second nombre: ");
            scn = new Scanner(System.in);
            int second_nombre = scn.nextInt();
            int resultat= soustration(premier_nombre, second_nombre);
            System.out.print("la différence entre "+premier_nombre+" et "+second_nombre+" fait : "+resultat);


        }
        if(choix==choix_3){
            System.out.println("Vous avez choisi la multiplication");
            System.out.print("veuillez enter le premier nombre: ");
            int premier_nombre = scn.nextInt();
            
            System.out.print("veuillez enter le second nombre: ");
            scn = new Scanner(System.in);
            int second_nombre = scn.nextInt();
            int resultat= multiplication(premier_nombre, second_nombre);
            System.out.print("la multiplication de  "+premier_nombre+" par "+second_nombre+" fait : "+resultat);


        }
        if(choix==choix_4){

            System.out.println("Vous avez choisi la division");
            System.out.print("veuillez enter le premier nombre: ");
            int premier_nombre = scn.nextInt();
            int second_nombre = 0;
            do{
                System.out.print("veuillez enter le second nombre: ");
                scn = new Scanner(System.in);
                second_nombre = scn.nextInt();
            }while(second_nombre==0);
            int resultat= division(premier_nombre, second_nombre);
            System.out.print("la division de  "+premier_nombre+" par "+second_nombre+" fait : "+resultat);   
        }
        



        //-------------fin-------------


      // System.out.println("Vous avez choisi l'option : "+choix) ;
       //System.out.println("---------------- EXIT ---------------") ;
    }

}