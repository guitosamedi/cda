package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Credit;

public class TestOperation {
    public static <Operations> void main(String[] args) {
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
    //deb2.afficherTypeOperation();

    for (Operation array : operations) {
        //System.out.println(array[i]);
        double total =0;
        if ( array.getType().equals("CREDIT")){
            // TODO

            System.out.println("+ " + total);
        }else{
            // TODO
           
            System.out.println("- " + total);
        }

    }

    }
}
