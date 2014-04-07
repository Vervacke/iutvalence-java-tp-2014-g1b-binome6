package fr.iutvalence.java.tp.BN;

/**
 * @author vervackv
 *Une position (numero de ligne, numero de colonne)
 */
public class Position
{
	/**
	 * Le numero de ligne de la position
	 */
	private final int numeroDeLigne;
	/**
	 * Le numero de colonne de la position
	 */
	private final int numeroDeColonne;
	
	/**
	 * @param numeroDeLigne affecte le numero de ligne
	 * @param numeroDeColonne affecte le numero de colonne
	 */
	public Position(int numeroDeLigne, int numeroDeColonne)
	{
		super();
		this.numeroDeLigne = numeroDeLigne;
		this.numeroDeColonne = numeroDeColonne;
	}

	/**
	 * @return renvoi le numero de ligne
	 */
	public int obtenirNumeroDeLigne()
	{
		return this.numeroDeLigne;
	}

	/**
	 * @return renvoi le numero de colonne
	 */
	public int obtenirNumeroDeColonne()
	{
		return this.numeroDeColonne;
	}
	/**
	 * @param obj paramètre à comparer
	 * @return renvoi true si les valeurs sont égales et false si elles ne le sont pas
	 */
	public boolean equals(Position obj)
	{
		if (this.obtenirNumeroDeColonne() == obj.obtenirNumeroDeColonne() && this.obtenirNumeroDeLigne() == obj.obtenirNumeroDeLigne())
			return true;
		return false;
	}
	
}
