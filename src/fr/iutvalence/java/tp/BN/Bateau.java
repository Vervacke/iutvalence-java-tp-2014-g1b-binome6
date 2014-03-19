package fr.iutvalence.java.tp.BN;

public class Bateau
{
	
	public final static int SOUS_MARIN = 0;
	public final static int TORPILLEUR = 1;
	public final static int CROISEUR = 2;
	public final static int PORTE_AVION = 3;
	
	private int type;
	
	private Position[] positions;

	
	private boolean[] coule;

	public int getType()
	{
		return type;
	}

	public void setType(int type)
	{
		this.type = type;
	}

	public Position[] getPositions()
	{
		return positions;
	}

	public void setPositions(Position[] positions)
	{
		this.positions = positions;
	}
	
}
