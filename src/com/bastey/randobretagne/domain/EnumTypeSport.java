package com.bastey.randobretagne.domain;

/**
 * Enumération des types de sport.
 * 
 * @author bastey
 */
public enum EnumTypeSport {

	VTT(1, "VTT"), CYCLO(2, "CYCLO"), MARCHE(3, "MARCHE");

	private final int valeur;
	private final String label;

	private EnumTypeSport(int valeur, String label) {
		this.valeur = valeur;
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public int getValeur() {
		return valeur;
	}

	public static EnumTypeSport getTypeSport(String pLabel) {
		EnumTypeSport result = null;
		for (EnumTypeSport type : EnumTypeSport.values()) {
			if (type.getLabel().equals(pLabel)) {
				result = type;
				break;
			}
		}
		return result;
	}

	public static EnumTypeSport getTypeSport(int pValeur) {
		EnumTypeSport result = null;
		for (EnumTypeSport type : EnumTypeSport.values()) {
			if (type.getValeur() == pValeur) {
				result = type;
				break;
			}
		}
		return result;
	}
}
