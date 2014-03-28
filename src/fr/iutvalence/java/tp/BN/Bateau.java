package fr.iutvalence.java.tp.BN;

public class Bateau
{
	
	public final static int SOUS_MARIN = 0;
	public final static int TORPILLEUR = 1;
	public final static int CROISEUR = 2;
	public final static int PORTE_AVION = 3;
	
	private final int type;
	
	private final Position[] positions;

	public boolean[] positionsTouchees;

	public Bateau(int type, Position[] positions)
	{
		this.type = type;
		this.positions = positions;
		this.positionsTouchees = new boolean[this.positions.length];
		for (int position=0;position<this.positions.length;position++)
			this.positionsTouchees[position] = false;
	}
	
	public int getType()
	{
		return type;
	}

	/**
	 * Obtenir l'indice d'une position parmi celles occupées par le bateau, si elle existe
	 * @param position la position à rechercher
	 * @return l'indice (dans le tableau) de la position parmi celles occupées par le bateau, -1 si le bateau n'occupe pas cette position
	 */
	public int obtenirIndicePosition(Position position)
	{
		// TODO à finir
		
		return -1;
	}
	
	public boolean estTouche(Position position)
	{
		int positionTouchee = this.obtenirIndicePosition(position);
		if (positionTouchee == -1) return false;
		
		
		// TODO à finir
		return true;
	}
	
	public boolean estCoule()
	{
		
	}
		
}
