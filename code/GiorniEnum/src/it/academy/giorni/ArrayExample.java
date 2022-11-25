package it.academy.giorni;

public class ArrayExample {
    public static void main (){
        String [] nomi = {"Lunedì", "Martedì","Mercoledì","Giovedì","Venderdì","Sabato","Domenica"};
        System.out.println("Stampa con ciclo for");
        for(int i=0; i < nomi.length; i++){
            System.out.println(nomi[i]);
        }
        System.out.println("Stampa con ciclo for-each");
        for (String s: nomi){
            System.out.println(s);
        }
        System.out.println("Stampa con ciclo while");
        int i = 0;
        while (i< nomi.length){
            System.out.println(nomi[i]);
            i++;
        }
    }
}
