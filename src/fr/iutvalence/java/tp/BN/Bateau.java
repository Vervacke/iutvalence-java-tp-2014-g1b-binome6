package fr.iutvalence.java.tp.BN;

/**
 * @author vervackv
 *Class contenant les caractéristiques d'un bateau
 */
public class Bateau
{
	
	/**
	 * Identifiant de Bateau
	 */
	public final static int SOUS_MARIN = 0;
	/**
	 * Identifiant de Bateau
	 */
	public final static int TORPILLEUR = 1;
	/**
	 * Identifiant de Bateau
	 */
	public final static int CROISEUR = 2;
	/**
	 * Identifiant de Bateau
	 */
	public final static int PORTE_AVION = 3;
	
	/**
	 * Valeur définissant l'identifiant
	 */
	private final int type;
	
	/**
	 * Contient les coordonnées des cases sur lesquelles se trouve le bateau
	 */
	// TODO utiliser une "collection"
	private final Position[] positions;

	/**
	 * Masque précisant les coordonnées des cases sur lesquelles le bateau a été touché
	 */
	public boolean[] positionsTouchees;

	/**
	 * Initialise le masque des positions touchées
	 * @param type Affecte un bateau a son type
	 * @param positions Affecte un bateau à ses positions
	 */
	public Bateau(int type, Position[] positions)
	{
		this.type = type;
		this.positions = positions;
		this.positionsTouchees = new boolean[this.positions.length];
		for (int position=0;position<this.positions.length;position++)
			this.positionsTouchees[position] = false;
	}
	
	/**
	 * @return type du bateau
	 */
	public int getType()
	{
		return this.type;
	}

	/**
	 * Obtenir l'indice d'une position parmi celles occupées par le bateau, si elle existe
	 * @param position la position à rechercher
	 * @return l'indice (dans le tableau) de la position parmi celles occupées par le bateau, -1 si le bateau n'occupe pas cette position
	 */
	public int obtenirIndicePosition(Position position)
	{
		for (int cpt=0; cpt<this.positions.length;cpt++)
			// TODO utiliser equals (et redefinir equals dans Position 2positions sont égales lorsqu'elles renvoie le même num de colonne et de ligne)
			if (position.equals(this.positions[cpt]) == true)
			return cpt;
		return-1;
	}
	
	/**
	 * Vérifie si le bateau est touché 
	 * @param position position à tester
	 * @return true si le bateau est touché sinon false
	 */
	public boolean estTouche(Position position)
	{
		int positionTouchee = this.obtenirIndicePosition(position);
		if (positionTouchee == -1) return false;
		else 
			this.positionsTouchees[positionTouchee] = true;
			return true;
	}
	
	/**
	 * Vérifie si le bateau est coulé
	 * @return true si le bateau est coulé
	 */
	public boolean estCoule()
	{
		for (int cpt=0; cpt<this.positionsTouchees.length; cpt++)
			if (this.positionsTouchees[cpt] == false)
			return false;
		return true;
	}
		
}
