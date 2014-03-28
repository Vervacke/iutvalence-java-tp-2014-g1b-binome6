package fr.iutvalence.java.tp.BN;


// TODO (fait) compléter le commentaire
/**
 * Création d'une partie de Bataille Navale
 * @author vervackv
 */
public class BatailleNavale
{
	
	/**
	 * Créer un Objet GrilleBateaux dans grilleBateau1
	 */
	private Bateau[] bateauxJ1;
	/**
	 * Créer un Objet GrilleBateaux dans grilleBateau2
	 */
	private Bateau[] bateauxJ2;
	/**
	 * Créer un Objet GrilleTirs dans grilleTirs1
	 */
	private GrilleTirs grilleTirsJ1;
	/**
	 * Créer un Objet GrilleTirs dans grilleTirs2
	 */
	private GrilleTirs grilleTirsJ2;

	// TODO compléter le commentaire
	/** Créations des 4 grilles nécessaires au déroulement de la partie
	 */
	public BatailleNavale(Bateau[] bateauxJ1, Bateau[] bateauxJ2)
	{
		this.bateauxJ1 = bateauxJ1;
		this.bateauxJ2 = bateauxJ2;
		this.grilleTirsJ1 = new GrilleTirs();
		this.grilleTirsJ2 = new GrilleTirs();
		
	}
	
	// TODO (fait) compléter le commentaire
	/**Lancement de la partie avec des tours
	 */
	public void jouer()
	{

	}


}
