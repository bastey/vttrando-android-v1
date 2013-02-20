package com.bastey.randobzh.util.parser;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import android.text.TextUtils;

import com.bastey.randobzh.domain.Rando;

/**
 * Handler du Parser permettant de récupérer la liste des randos.
 * 
 * @author bastey
 * 
 *         TODO : OPTIMISATIONS : <br>
 *         1) Sortir si le departement ne correspond pas <br>
 *         2) Ne pas balayer les autres champs apres <link>
 */
public class ParserListeRandosHandler extends DefaultHandler {

	/** flags nous indiquant la position du parseur. */
	private boolean inRando;

	/** Resultat du parsing : Liste des randonnees temporaires. */
	private List<Rando> listeRandosTemp;

	/** Rando temporaire courante. */
	private Rando randoTemp;

	/** Buffer permettant de recuperer les donnees. */
	private StringBuffer buffer;

	/** Departement selectionnes. */
	private List<Integer> departements;

	/**
	 * Constructeur.
	 * 
	 * @param pDepartements
	 */
	public ParserListeRandosHandler(int[] pDepartements) {
		super();

		departements = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			if (pDepartements[i] != 0) {
				departements.add(pDepartements[i]);
			}
		}

		listeRandosTemp = new ArrayList<Rando>();
	}

	/** Detection d'ouverture de balise. */
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if (qName.equals("item")) {
			inRando = true;
		}
		if (inRando) {
			if (qName.equals("title")) {
				randoTemp = new Rando(true);
				buffer = new StringBuffer();
			} else if (qName.equals("link")) {
				buffer = new StringBuffer();
			}
		}
	}

	/** Detection fin de balise. */
	public void endElement(String uri, String localName, String qName)
			throws SAXException {

		if (qName.equals("item")) {
			inRando = false;

			// Ajout de la rando
			if (randoTemp.getUrlDetailWeb() != null
					&& randoTemp.getDepartement() != 0
					&& departements.contains(randoTemp.getDepartement())) {
				listeRandosTemp.add(randoTemp);
			}
			randoTemp = null;
			return;
		}
		if (inRando) {
			if (qName.equals("title")) {
				randoTemp.setDepartement(Integer
						.valueOf(getDepartementFromTitle(buffer.toString())));
				buffer = null;

			} else if (qName.equals("link")) {
				randoTemp.setUrlDetailWeb(buffer.toString());
				buffer = null;
			}
		}
	}

	/**
	 * @param title
	 *            au format = <title>LIEU (departement) ------- nom</title>
	 * @return departement
	 */
	private String getDepartementFromTitle(String title) {
		return TextUtils.substring(title, TextUtils.indexOf(title, '(') + 1,
				TextUtils.indexOf(title, ')'));
	}

	// /**
	// * @param title
	// * au format = <title>LIEU (departement) ------- nom</title>
	// * @return [lieu,departement,nom]
	// */
	// protected String[] formatTitle(String title) {
	// String[] infosTitle = new String[3];
	// String dep_nom_separator = "-------";
	//
	// // String[] titles = StringUtils.splitByWholeSeparator(title,
	// // dep_nom_separator);
	// // String titleLeft = StringUtils.left(titles[0], titles[0].length() -
	// // 1);
	// // String titleRight = StringUtils
	// // .right(titles[1], titles[1].length() - 1);
	// //
	// // String titleLeftReversed = StringUtils.reverse(titleLeft);
	// // int debutDepartement2 = titleLeft.length()
	// // - StringUtils.indexOf(titleLeftReversed, '(');
	// // int finDepartement2 = titleLeft.length()
	// // - StringUtils.indexOf(titleLeftReversed, ')');
	// //
	// // infosTitle[0] = StringUtils.left(titleLeft, debutDepartement2 - 2);
	// // infosTitle[1] = titleLeft.substring(debutDepartement2,
	// // finDepartement2 - 1);
	// // infosTitle[2] = titleRight;
	//
	// return infosTitle;
	// }

	// detection de caracteres
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String lecture = new String(ch, start, length);
		if (buffer != null) {
			buffer.append(lecture);
		}
	}

	// debut du parsing
	public void startDocument() throws SAXException {
	}

	// fin du parsing
	public void endDocument() throws SAXException {
	}

	public List<Rando> getListeRandosTemp() {
		return listeRandosTemp;
	}

}
