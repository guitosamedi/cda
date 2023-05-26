package fr;

import fr.banque.Operation;
import fr.banque.Debit;
import fr.banque.Credit;

public class TestOperation {
    public static void main(String[] args) {

    Operation cred1 = new Credit("12/09/2023", 56.36);
    Operation deb1 = new Debit("31/04/2020", 446.00);
    Operation cred2 = new Credit("25/06/2022", 156.87);
    Operation deb2 = new Debit("13/11/2019", 5666.48);

    Operation[] operations = {cred1, deb1, cred1, deb2};

    //operations[0] = cred1;
   // operations[1] = deb1;
    //operations[2] = cred2;
    //operations[3] = deb2;

   // cred1.afficherTypeOperation();
    //deb1.afficherTypeOperation();
    //cred2.afficherTypeOperation();
    //deb2.afficherTypeOperation()

        /* MON TRAVAIL
    for (Operation array : operations) {
        //System.out.println(array[i]);
        double total =0;
        if ( array.getType().equals("CREDIT")){
            //TODO
            for (double i =0 ; i < array.getMontant(); i++){
                double sousTotal = array.getMontant();
                total = total + sousTotal;
            }
            System.out.println("+ " + total);
        }else{
            //TODO
            for (double i =0 ; i < array.getMontant(); i++){
                double sousTotal = array.getMontant();
                total = total - sousTotal;
            }
            System.out.println("- " + total);
        }
    }
    */

       /************ CORRECTION **********/

        double solde = 0.0;

        // TECHNIQUE 1 IF ELSE MOINS BONNE :(
        // Avec Boucle for
        for (int i = 0; i < operations.length; i++) {
            //System.out.println(operations[i]);
            if(operations[i].getType().equals("DEBIT")){
                solde -= operations[i].getMontant();
            }else{
                solde += operations[i].getMontant();
            }
        }
        //Avec Boucle Objet permet de parcourir un intérable
        for (Operation operation : operations){
            //System.out.println(operation);
            if(operation.getType().equals("DEBIT")){
                solde -= operation.getMontant();
            }else{
                solde += operation.getMontant();
            }
        }

        // TECHNIQUE 2 MECANISME OBJET - MIEUX :)
        // Mais il faut penser à passer l'attribut montant de la classe Operation en protected

        // Avec Boucle for
        for (int i = 0; i < operations.length; i++) {
            solde = operations[i].recalculerSolde(solde);
        }

        //Avec Boucle Objet permet de parcourir un intérable
        for (Operation operation : operations){
            solde = operation.recalculerSolde(solde);
        }

        System.out.println(" Solde: " + solde);
    }
}
