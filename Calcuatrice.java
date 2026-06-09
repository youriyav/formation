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
            choix = scn.nextInt();
        }while(choix>4);
        //-------------début------------ 
        int choix_1=1;
        int choix_2=2;
        int choix_3=3;
        int choix_4=4;

    
        
        if(choix==choix_1){
            System.out.print("Vous avez choisi l'addition");
        }
        if(choix==choix_2){
            System.out.print("Vous avez choisi soustraction");
        }
        if(choix==choix_3){
            multiplication(choix_3, choix_4)
            //System.out.print("Vous avez choisi la multiplication");
        }
        if(choix==choix_4){
            System.out.print("Vous avez choisi division");
        }
        



        //-------------fin-------------


      // System.out.println("Vous avez choisi l'option : "+choix) ;
       //System.out.println("---------------- EXIT ---------------") ;
    }

}