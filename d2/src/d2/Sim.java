package d2;

import java.util.ArrayList;

public class Sim {
    private String numeroTelefono;
    private double credito;
    private ArrayList<Chiamata> ultimeChiamate;

    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0;
        this.ultimeChiamate = new ArrayList<Chiamata>();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public ArrayList<Chiamata> getUltimeChiamate() {
        return ultimeChiamate;
    }

    public void aggiungiChiamata(Chiamata chiamata) {
        if (ultimeChiamate.size() >= 5) {
            ultimeChiamate.remove(0);
        }
        ultimeChiamate.add(chiamata);
    }

    public void stampaDati() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + " euro");
        System.out.println("Ultime chiamate effettuate:");
        if (ultimeChiamate.isEmpty()) {
            System.out.println("Nessuna chiamata effettuata.");
        } else {
            for (Chiamata chiamata : ultimeChiamate) {
                System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() +
                        ", Durata: " + chiamata.getDurata() + " minuti");
            }
        }
    }

    public static void main(String[] args) {
        Sim sim = new Sim("1234567890");
        sim.stampaDati();
    }
}

class Chiamata {
    private String numeroChiamato;
    private int durata;

    public Chiamata(String numeroChiamato, int durata) {
        this.numeroChiamato = numeroChiamato;
        this.durata = durata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public int getDurata() {
        return durata;
    }
}
