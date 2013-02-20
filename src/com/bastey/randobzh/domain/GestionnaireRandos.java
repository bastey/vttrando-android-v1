package com.bastey.randobzh.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Gestionnaire des randonnées.
 * 
 * @author bastey
 */
public class GestionnaireRandos {

	/** Table de correspondance : Départements / Randos VTT à venir. */
	public static Map<Integer, List<Rando>> randosVTT = new HashMap<Integer, List<Rando>>();

	/** Table de correspondance : Départements / Randos Cyclo à venir. */
	public static Map<Integer, List<Rando>> randosCyclo = null;

	/** Table de correspondance : Départements / Randos Marche à venir. */
	public static Map<Integer, List<Rando>> randosMarche = null;

	static {
		// randosVTT = new HashMap<Integer, List<Rando>>();
		randosCyclo = new HashMap<Integer, List<Rando>>();
		randosMarche = new HashMap<Integer, List<Rando>>();
	}

	// /** Liste des randonnées. */
	// private List<Rando> listeRandos;

	/**
	 * Constructeur par défaut.
	 */
	public GestionnaireRandos() {
		// this.listeRandos = new ArrayList<Rando>();

	}

	// public List<Rando> getListeRandos() {
	// return listeRandos;
	// }
	//
	// public void setListeRandos(List<Rando> listeRandos) {
	// this.listeRandos = listeRandos;
	// }
	//
	// public boolean add(Rando rando) {
	// return listeRandos.add(rando);
	// }
	//
	// public Rando getRando(int position) {
	// return listeRandos.get(position);
	// }

	// /**
	// * Recuperation de la liste des randos en fonction d'un sport.
	// *
	// * @param sport
	// * @return Liste des randos
	// */
	// public List<Rando> getRandosFromSport(EnumTypeSport sport) {
	// List<Rando> listeRandoSport = new ArrayList<Rando>();
	// if (sport != null) {
	// for (Rando pRando : listeRandos) {
	// if (sport.equals(pRando.getTypeSport())) {
	// listeRandoSport.add(pRando);
	// }
	// }
	//
	// // Tri par date puis nom
	// Collections.sort(listeRandoSport);
	// }
	//
	// return listeRandoSport;
	// }

	// /**
	// * Recuperation de la liste des randos en fonction d'un sport et d'une
	// liste
	// * de dpts.
	// *
	// * @param sport
	// * Sport
	// * @param dpts
	// * Liste de départements
	// * @return Liste des randos
	// */
	// public List<Rando> getRandosFromSportAndDpts(EnumTypeSport sport, int[]
	// dpts) {
	// List<Rando> listeRandoSport = new ArrayList<Rando>();
	//
	// List<Integer> listeDpts = new ArrayList<Integer>();
	// for (int i = 0; i < dpts.length; i++) {
	// listeDpts.add(dpts[i]);
	// }
	//
	// if (sport != null) {
	// for (Rando pRando : listeRandos) {
	// if (sport.equals(pRando.getTypeSport())
	// && listeDpts.contains(pRando.getDepartement())) {
	// listeRandoSport.add(pRando);
	// }
	// }
	//
	// // Tri par date puis nom
	// Collections.sort(listeRandoSport);
	// }
	//
	// return listeRandoSport;
	// }

}
