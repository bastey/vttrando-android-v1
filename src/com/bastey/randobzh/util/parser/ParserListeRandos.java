package com.bastey.randobzh.util.parser;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import android.util.Log;

import com.bastey.randobzh.domain.EnumTypeSport;
import com.bastey.randobzh.domain.EnumUrlRando;
import com.bastey.randobzh.domain.Rando;
import com.bastey.randobzh.util.ArretParserException;

/**
 * Parser permettant de récupérer la liste des URL des randonnées correspondant
 * au Sport et au Département selectionné.
 * 
 * @author bastey
 */
public class ParserListeRandos {

	/** URL permettant de récupérer la liste des randos. */
	// private EnumUrlRando URLtoParse;

	/** Sport selectionne. */
	private EnumTypeSport typeSport;

	/** Departements selectionnes. */
	private int[] departements;

	/**
	 * Constructeur.
	 * 
	 * @param uRLtoParse
	 */
	public ParserListeRandos(EnumTypeSport pTypeSport, int[] pDepartements) {
		super();
		typeSport = pTypeSport;
		departements = pDepartements;
	}

	/**
	 * Recuperation de la liste des URL des randos..<BR>
	 * Utilisation d'un ParserXML.
	 */
	public List<Rando> recupererListRandos() {
		List<Rando> listeRandosTemp = null;

		try {
			// Construction du Parser XML et du Handler
			SAXParserFactory saxFactory = SAXParserFactory.newInstance();
			SAXParser parser = saxFactory.newSAXParser();
			XMLReader reader = parser.getXMLReader();
			ParserListeRandosHandler myXMLHandler = new ParserListeRandosHandler(
					departements);
			reader.setContentHandler(myXMLHandler);

			// Recuperation de l'URL a parser
			EnumUrlRando URLtoParse = null;
			switch (typeSport) {
			case VTT:
				URLtoParse = EnumUrlRando.VTT_A_VENIR;
				break;
			case CYCLO:
				URLtoParse = EnumUrlRando.CYCLO_A_VENIR;
				break;
			case MARCHE:
				URLtoParse = EnumUrlRando.MARCHE_A_VENIR;
				break;
			default:
				break;
			}

			// Parsing
			URL sourceUrl = new URL(URLtoParse.getUrl());
			InputStream stream = sourceUrl.openStream();
			reader.parse(new InputSource(stream));
			stream.close();

			listeRandosTemp = myXMLHandler.getListeRandosTemp();

			// Affichage du nombre de randos
			Log.v("Nb de randos : ", "" + listeRandosTemp.size());

		} catch (ParserConfigurationException e) {
			Log.v("Erreur de configuration du parser XML", e.getMessage());
			throw new ArretParserException();
		} catch (SAXException e) {
			Log.v("Erreur de parsing lors de la récupération de la liste des randos",
					e.getMessage());
			throw new ArretParserException();
		} catch (IOException e) {
			Log.v("Erreur URL lors de la récupération de la liste des randos",
					e.getMessage());
			throw new ArretParserException();
		}
		return listeRandosTemp;
	}
}
