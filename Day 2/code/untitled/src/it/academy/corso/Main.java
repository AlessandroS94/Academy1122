package it.academy.corso;

public class Main {
    public static void main(String[]a){
        Tv tv = new Tv(new String[]{"canale1", "canale2"});
        String [] b = new String[]{"canale1", "canale2"};
        System.out.println(tv.toStringRicorsivo(0, b));
        System.out.println(tv.toStringRicorsivo(0));
    }
}
