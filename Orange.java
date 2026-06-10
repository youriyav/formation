import java.util.Scanner;

public class Orange {
    static boolean verifier_code(String code){
        final String CODE_USSD = "#123#";
        return CODE_USSD.equals(code.trim()) ;
    }
    static void afficher_menu(){
        System.out.println(
            "Votre crédit principal est 0 FCFA, valide jusqu'au 07/09/2026\n"+
            "0. Consulter vos sous comptes\n"+
            "1. Quitter\n"
    );
    
    }
    static int lire_choix(){
         Scanner scn= new Scanner(System.in);
        int valeur_scannee ;

        try {
                valeur_scannee = scn.nextInt();
            } catch (Exception e) {
                System.out.println("La valeur entréé est invalide");
                valeur_scannee=6;
            }

        return valeur_scannee;
    }
    static void traiter_choix(int choix){
        if(choix==1)
        {

        }
        if(choix==1)
        {
            
        }
        if(choix==1)
        {
            
        }
    }
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    String code = scn.nextLine();
        if(!verifier_code(code))
        {
            System.out.println("code invalide");
            return;
        }
        //
        afficher_menu();
    }
}
