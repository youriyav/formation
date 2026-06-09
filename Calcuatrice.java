public class Calcuatrice {
public static void main(String[] args) {
        int [] annee_naiss_a={2009,2008,2010,2011,2006};
        int annee_cour=2026;

        //calcul âge 

        for(int i=0;i<=4;i++)
        {
                int age_a=annee_cour - annee_naiss_a[i];
                //System.out.println(age_a);
        //bloucle 
                if(age_a>=19)
                {
                        System.out.println("Vous etes adulte");
                        //return;
                }else{
                        System.out.println("Vous etes mineur");
                }
                
                
        }
        
        
     }

}
