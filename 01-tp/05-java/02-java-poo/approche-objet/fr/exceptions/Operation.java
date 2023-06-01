package fr.exceptions;

public class Operation {
    public static double diviser(double a, double b) throws Exception{
        if(b==0.0){
            throw new Exception("Vous n'avez pas le droit de diviser par 0");
        }
        return a/b;
    }

}
