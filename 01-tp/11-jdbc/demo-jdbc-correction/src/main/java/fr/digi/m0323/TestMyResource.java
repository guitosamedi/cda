package fr.digi.m0323;

import fr.digi.m0323.resouce.MyResource;

public class TestMyResource {

    public static void main(String[] args) {


        try(MyResource resource = new MyResource()) {
            resource.doSomeThing();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }


        /*MyRessource myRessource = null;
        try {
            myRessource = new MyRessource();
            myRessource.doSomeThing();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (myRessource != null) {
                    myRessource.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }*/
    }
}
