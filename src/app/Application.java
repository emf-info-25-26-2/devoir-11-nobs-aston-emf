package app;

import models.Animal;
import models.Enclos;
import models.Proprietaire;

public class Application {

    public static void main(String[] args) {

        Enclos[] enclos = new Enclos[8];

        for (int i = 0; i < enclos.length; i++) {
            enclos[i] = new Enclos(8);
        }

        Proprietaire[] proprietaires = new Proprietaire[4];

        proprietaires[0] = new Proprietaire("Duprévert", "Mario");
        proprietaires[1] = new Proprietaire("Duchampsec", "Paul");
        proprietaires[2] = new Proprietaire("Dupaturage", "Fred");
        proprietaires[3] = new Proprietaire("Delaprairie", "Tom");

        for (int p = 0; p < proprietaires.length; p++) {

            for (int i = 0; i < 10; i++) {

                Animal animal = genereAnimal(proprietaires[p]);

                boolean place = false;

                for (int e = 0; e < enclos.length; e++) {

                    if (!enclos[e].estPlein()) {
                        enclos[e].placerUnAnimal(animal);
                        place = true;
                        break;
                    }
                }

                if (!place) {
                    System.out.println("Impossible de placer un animal !");
                    return;
                }
            }
        }

        for (int i = 0; i < enclos.length; i++) {
            System.out.println("Contenu de l'enclos N°" + (i + 1));
            enclos[i].afficher();
        }
    }

    private static int compteur = 1;

    public static Animal genereAnimal(Proprietaire proprietaire) {

        String[] types = { "Cheval", "Vache", "Chèvre", "Poule", "Chien", "Porc" };

        int index = (int) (Math.random() * types.length);
        String type = types[index]; // transforme l'index en text

        boolean herbivore = type.equals("Cheval")
                || type.equals("Vache")
                || type.equals("Chèvre");

        Animal a = new Animal(proprietaire, type, compteur, herbivore);

        compteur++;

        return a;
    }
}