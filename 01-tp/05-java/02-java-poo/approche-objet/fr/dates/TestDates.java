package fr.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDates {
    public static void main(String[] args) throws ParseException {

        /************* COURS *************/

       /** appel instance Date
        Date d = new Date();
        System.out.println("Date instance : " + d);

        // Instance Date 1 plus court deprécié
        Date d2 = new Date(123, 4, 26, 9, 35 );
        System.out.println("Date dépréciée : " + d2);

        // Instance Date 2 avec Calendar
        Calendar cal = Calendar.getInstance();
        cal.set(2020, 6, 7, 19, 30, 56);
        Date d3 = cal.getTime();
        //ou

        System.out.println("Date calendar : " + d2);

        // Formatage de Date
        Date d4 = new Date();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MMMM/yyyy 'à' HH:mm:ss");
        SimpleDateFormat formateur2 = new SimpleDateFormat("dd MMMM yyyy 'à' HH:mm:ss", new Locale("fr", "FR"));
        String str = formateur.format(d4);
        String str2 = formateur2.format(d4);
        System.out.println("Date formaté 1 : " + str);
        System.out.println("Date formaté 2 : " + str2);

        // Parser une date :  Formater un string en date !! nécessite throws ParseException dans la Classe
        String chaineAParser = "01/01/1010 10:00:00";
        Date dateResultat = formateur.parse(chaineAParser);
        System.out.println("Formater un string en date : " + dateResultat); **/


        /************* TP *************/

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MMMM/yyyy");
        String chaine = format.format(date);
        System.out.println("Affichage date du jour : " + chaine);

        Date date2 = new Date(116, 4, 19, 23, 59, 30 );
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String chaine2 = format2.format(date2);
        System.out.println("Affichage Date dépréciée : " + chaine2);


        Calendar cal = Calendar.getInstance();
        cal.set(2016, 4, 19, 23, 59, 30);
        Date date3 = cal.getTime();
        SimpleDateFormat format3 = new SimpleDateFormat("dd/MM/yyyy");
        String chaine3 = format3.format(date3);
        System.out.println("Affichage Date Calendar : " + chaine3);


        Date date4 = cal.getTime();

        SimpleDateFormat formatFR = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss", Locale.FRANCE);
        SimpleDateFormat formatRU = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss",new Locale("ru", "RU"));
        SimpleDateFormat formatDE = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss", Locale.GERMAN);
        SimpleDateFormat formatCH = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss", Locale.CHINESE);

        String chaineFR = formatFR.format(date4);
        String chaineRU = formatRU.format(date4);
        String chaineDE = formatDE.format(date4);
        String chaineCH = formatCH.format(date4);

        System.out.println("Affichage Date jour Calendar FR : " + chaineFR);
        System.out.println("Affichage Date jour Calendar RU : " + chaineRU);
        System.out.println("Affichage Date jour Calendar DE : " + chaineDE);
        System.out.println("Affichage Date jour Calendar CH : " + chaineCH);
    }
}
