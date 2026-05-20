package models;

public class Enclos {

    private Animal[] contenue;
    private int taille;

    public Enclos(int taille) {
        this.contenue = new Animal[taille];
        this.taille = taille;
    }

    public boolean estPlein() {
        boolean plein = true;
        for (int i = 0; i < contenue.length; i++) {
            if (contenue[i] == null) {
                plein = false;
                break;
            }
        }

        return plein;
    }

    public int nombreDAnimeauxPresent() {
        int compteur = 0;
        for (int i = 0; i < contenue.length; i++) {
            if (contenue[i] != null) {
                compteur++;
            }
        }
        return compteur;
    }

    public int nombrePlaceLibre() {
        int compteur = 0;
        for (int i = 0; i < contenue.length; i++) {
            if (contenue[i] == null) {
                compteur++;
            }
        }
        return compteur;
    }

    public void placerUnAnimal(Animal animal) {
        for (int i = 0; i < contenue.length; i++) {
            if (contenue[i] == null) {
                contenue[i] = animal;
                break;
            }
        }

    }

    public void enleverUnAnimal(Animal animal) {
        for (int i = 0; i < contenue.length; i++) {
            if (contenue[i] == animal) {
                contenue[i] = null;
                break;
            }
        }
    }

    public boolean herbivorePresent() {
        boolean contientHerbivore = false;
        for (int i = 0; i < contenue.length; i++) {
            if (contenue[i] != null) {
                if (contenue[i].isHerbivore()) {
                    contientHerbivore = true;
                    break;
                }
            }

        }
        return contientHerbivore;
    }

    public void afficher() {
        for (int i = 0; i < contenue.length; i++) {
            if (contenue[i] != null) {
                System.out.println("   " + contenue[i]);
            }
        }
    }

}
