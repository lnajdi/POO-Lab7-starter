// Classe principale pour tester les deux classes
public class Main {
    public static void main(String[] args) {
        // Création d'une instance de la classe Étudiant
        Eudiant etudiant = new Eudiant();
        
        

        // Utilisation du mot-clé instanceof pour confirmer les types de l'objet
        if(etudiant instanceof Étudiant) {
            System.out.println("L'objet est une instance de Étudiant.");
        }
        if(etudiant instanceof Personne) {
            System.out.println("L'objet est une instance de Personne.");
        }
    }
}


