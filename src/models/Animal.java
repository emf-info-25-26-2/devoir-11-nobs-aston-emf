package models;

public class Animal {

    private Proprietaire proprietaire;
    private final String type;
    private final int numero_unique;
    private final boolean herbivore;

    public Animal(Proprietaire proprietaire, String type, int numero_unique, boolean herbivore) {
        this.proprietaire = proprietaire;
        this.type = type;
        this.numero_unique = numero_unique;
        this.herbivore = herbivore;
    }

    public String getType() {
        return type;
    }

    public int getNumero_unique() {
        return numero_unique;
    }

    public boolean isHerbivore() {
        return herbivore;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public String toString() {
        String numFormatte = String.format("%04d", numero_unique);
        return "N°" + numFormatte + "-" + type + "-Propriété de " + proprietaire;
    }

}
