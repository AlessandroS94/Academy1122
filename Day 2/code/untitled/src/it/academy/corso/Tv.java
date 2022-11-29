package it.academy.corso;

public class Tv {
    private String [] canali;

    public Tv(String[] canali) {
        this.canali = canali;
    }

    public Tv() {

    }

    public String[] getCanali() {
        return canali;
    }

    public void setCanali(String[] canali) {
        this.canali = canali;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String toStringRicorsivo(int n, String[] a){
        if(n == a.length-1){
            System.out.println(a[n]);
            return "FINE";
        }
        System.out.println(a[n]);
        return toStringRicorsivo(n + 1,a);
    }

    public String toStringRicorsivo(int n){
        if(n == this.canali.length-1){
            System.out.println(this.canali[n]);
            return "FINE";
        }
        System.out.println(this.canali[n]);
        return toStringRicorsivo(n+1);
    }
}
