package fr.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {

     long debut = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i=1; i <= 100000; i++ ){
            builder.append(i);
            //System.out.println(builder.toString());
        }
        long fin = System.currentTimeMillis();
       System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

        String str = "";
       long debut2 = System.currentTimeMillis();
        for (int i=1; i <= 100000; i++ ){
            //System.out.println(i);
            str+=i;
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin2 - debut2));
    }
}
