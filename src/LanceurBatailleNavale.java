
import fr.iutvalence.java.tp.BN.BatailleNavale;
import fr.iutvalence.java.tp.BN.Bateau;
import fr.iutvalence.java.tp.BN.Position;

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
		Bateau[] bateauxJ1 = new Bateau[1];
		
		Position[] positionsBateauJ1 = new Position[5];
		positionsBateauJ1[0] = new Position(0, 0);
	
		bateauxJ1[0] = new Bateau(Bateau.CROISEUR, positionsBateauJ1);
		
		Position[] positionsBateauJ2 = new Position[5];
		positionsBateauJ2[0] = new Position(0, 0);
		
		Bateau[] bateauxJ2 = new Bateau[1];
		bateauxJ2[0] = new Bateau(Bateau.CROISEUR, positionsBateauJ2);
		
		BatailleNavale partieDeBatailleNavale = new BatailleNavale();
		System.out.println("Demarrage de la partie");
		partieDeBatailleNavale.jouer();
		System.out.println("Fin de la partie");
	}
}