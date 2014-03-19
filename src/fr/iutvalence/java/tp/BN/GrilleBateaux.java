package fr.iutvalence.java.tp.BN;

/**
 * @author vervackv
 * La GrilleBateaux indique l'emplacement des bateaux d'un joueur
 */
public class GrilleBateaux
{
		private Bateau Bateau1;
		private Bateau Bateau2;
		private Bateau Bateau3;
		private Bateau Bateau4;
		
		/**
		 * Creation de la grille
		 */
		public GrilleBateaux()
		{
			this.Bateau1 = new Bateau();
			this.Bateau2 = new Bateau();
			this.Bateau3 = new Bateau();
			this.Bateau4 = new Bateau();
		}
}
