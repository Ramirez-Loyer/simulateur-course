import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Course {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Veuillez entrer le nombre de chevaux (entre 12 et 20) ou tapez 'exit' pour quitter : ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Programme terminé.");
                break;
            }

            try {
                int nombreChevaux = Integer.parseInt(input);
                if (nombreChevaux < 12 || nombreChevaux > 20) {
                    System.out.println("Le nombre de chevaux doit être compris entre 12 et 20.");
                    continue;
                }

                System.out.println("Veuillez choisir le type de course (tiercé, quarté, quinté) : ");
                String typeCourse = scanner.nextLine();

                switch (typeCourse.toLowerCase()) {
                    case "tiercé":
                        simulerCourse(nombreChevaux, 3);
                        break;
                    case "quarté":
                        simulerCourse(nombreChevaux, 4);
                        break;
                    case "quinté":
                        simulerCourse(nombreChevaux, 5);
                        break;
                    default:
                        System.out.println("Type de course non reconnu. Veuillez entrer 'tiercé', 'quarté' ou 'quinté'.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.");
            }
        }

        scanner.close();
		
	}
	
	private static void simulerCourse(int nombreChevaux, int nombreGagnants) {
        ArrayList<Integer> arrivée = new ArrayList<>();
        for (int i = 1; i <= nombreChevaux; i++) {
            arrivée.add(i);
        }

        Collections.shuffle(arrivée);

        System.out.print("Arrivée de la course : ");
        for (int i = 0; i < nombreGagnants; i++) {
            System.out.print(arrivée.get(i) + " ");
        }
        System.out.println();
    }
}




/*Une course hippique rassemble 12 à 20 chevaux. Un tiercé s'intéresse au classement des 3 premiers, un quarté des 4 premiers, et un quinté des 5 premiers. 
 * Le  programme demande en boucle à 'lutilisateur (ou jusqu'à ce qu'il indique qu'il souhaite que le programme se termine) le nombre de chevaux de la course
 * et son type (tiercé, quarté, quinté). Il affiche alors une arrivée tirée aléatoirement de la course. 
 * 
 * Exemples de déroulements : l'utilisateur indique qu'il souhaite simuler l'arrivée d'un : 
 * 	-tiercé d'une course comportant 18 chevaux > une sortie possible du programme est : 
 *		12 - 4 - 9;
 *	-quarté d'une course comportant 16 chevaux > une sortie possible du programme est : 
 *		15 - 12 - 3 - 10;
 *	-quinté d'une course comportant 20 cheveux > une sortie possible du programme est : 
 *		18 -16 - 11 - 10 - 7 - 13
 *
 */



/*Une course hippique rassemble 12 à 20 chevaux. Un tiercé s'intéresse au classement des 3 premiers, un quarté des 4 premiers, et un quinté des 5 premiers. 
 * Le  programme demande en boucle à 'lutilisateur (ou jusqu'à ce qu'il indique qu'il souhaite que le programme se termine) le nombre de chevaux de la course
 * et son type (tiercé, quarté, quinté). Il affiche alors une arrivée tirée aléatoirement de la course. 
 * 
 * Exemples de déroulements : l'utilisateur indique qu'il souhaite simuler l'arrivée d'un : 
 * 	-tiercé d'une course comportant 18 chevaux > une sortie possible du programme est : 
 *		12 - 4 - 9;
 *	-quarté d'une course comportant 16 chevaux > une sortie possible du programme est : 
 *		15 - 12 - 3 - 10;
 *	-quinté d'une course comportant 20 cheveux > une sortie possible du programme est : 
 *		18 -16 - 11 - 10 - 7 - 13
 *
 */