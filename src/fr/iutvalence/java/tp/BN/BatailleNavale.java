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
	private GrilleBateaux grilleBateaux1;
	/**
	 * Créer un Objet GrilleBateaux dans grilleBateau2
	 */
	private GrilleBateaux grilleBateaux2;
	/**
	 * Créer un Objet GrilleTirs dans grilleTirs1
	 */
	private GrilleTirs grilleTirs1;
	/**
	 * Créer un Objet GrilleTirs dans grilleTirs2
	 */
	private GrilleTirs grilleTirs2;

	// TODO compléter le commentaire
	/** Créations des 4 grilles nécessaires au déroulement de la partie
	 */
	public BatailleNavale()
	{
		this.grilleBateaux1 = new GrilleBateaux();
		this.grilleBateaux2 = new GrilleBateaux();
		this.grilleTirs1 = new GrilleTirs();
		this.grilleTirs2 = new GrilleTirs();
		
	}
	
	// TODO (fait) compléter le commentaire
	/**Lancement de la partie avec des tours
	 */
	public void jouer()
	{

	}


}
