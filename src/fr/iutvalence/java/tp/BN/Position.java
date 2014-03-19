package fr.iutvalence.java.tp.BN;

public class Position
{
	private final int numeroDeLigne;
	private final int numeroDeColonne;
	
	public Position(int numeroDeLigne, int numeroDeColonne)
	{
		super();
		this.numeroDeLigne = numeroDeLigne;
		this.numeroDeColonne = numeroDeColonne;
	}

	public int obtenirNumeroDeLigne()
	{
		return numeroDeLigne;
	}

	public int obtenirNumeroDeColonne()
	{
		return numeroDeColonne;
	}
	
}
