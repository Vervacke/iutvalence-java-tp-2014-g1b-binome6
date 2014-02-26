
import fr.iutvalence.java.tp.BN.BatailleNavale;

/**
 * Bataille Navale
 * Contient le "main" qui permet le démarage du jeu
 */
// TODO (fait) renommer la classe
public class LanceurBatailleNavale
{ 
	/**
	 * Initialisation du jeu
	 * Création d'une partie suivi du démarrage de celle-ci
	 * @param args 
	 */
	public static void main(String[] args)
		{
		System.out.println ("Création de la partie");
		BatailleNavale partieDeBatailleNavale = new BatailleNavale();
		System.out.println("Demarrage de la partie");
		partieDeBatailleNavale.jouer();
		System.out.println("Fin de la partie");
	}
}