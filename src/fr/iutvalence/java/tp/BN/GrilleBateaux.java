package fr.iutvalence.java.tp.BN;

/**
 * @author vervackv
 * La GrilleBateaux indique l'emplacement des bateaux d'un joueur
 */
public class GrilleBateaux
{
		/**
		 * La grille est composé de 10 lignes
		 */
		private static final int NB_LIGNES = 10;
		/**
		 * La grille est composé de 10 colonnes
		 */
		private static final int NB_COLONNES = 10;
		/**
		 * Chaque case contient un booleen qui précise si un bateau occupe la case ou non
		 */
		private boolean[][] cases;
		
		/**
		 * Creation de la grille
		 */
		public GrilleBateaux()
		{
			this.cases = new  boolean [NB_LIGNES][NB_COLONNES];
		}
}
