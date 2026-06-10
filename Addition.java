public class Addition {

    static int addition(int a, int b){
        return  a+b;
    }
    static int soustration(int a, int b){
        return  a-b;
    }
    static int multiplication(int a, int b){
        return  a*b;
    }


    public static void main(String[] args) {
        System.out.println(args[1]);
        int resultat=addition(4,23);
        int resultat2=addition(6,93);
        int resultat3=addition(40,100);
        int resultat4=soustration(283,48);
        System.out.println(resultat);
        System.out.println(resultat2);
        System.out.println(resultat3);
        System.out.println(resultat4); 
    }
}