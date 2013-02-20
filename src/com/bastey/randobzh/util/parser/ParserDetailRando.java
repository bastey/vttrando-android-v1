package com.bastey.randobzh.util.parser;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import android.text.Html;
import android.text.TextUtils;
import android.util.Log;

import com.bastey.randobzh.domain.Rando;

/**
 * Parser permettant de récupérer les informations d'une rando.
 * 
 * @author bastey
 * 
 */
public class ParserDetailRando {

	private static SimpleDateFormat sdf = new SimpleDateFormat(" dd/MM/yyyy",
			Locale.FRANCE);

	/**
	 * Permet de parser une page HTML de detail d'une rando.<br>
	 * Les caracteres HTML sont convertis avec la methode Html.fromHtml(String).
	 * 
	 * @param randoTemp
	 *            La rando temporaire dont les details sont a recuperer
	 * @return rando avec détail, Null si une erreur est survenue.
	 */
	public static Rando parserDetailRando(Rando randoTemp) {
		Rando rando = null;

		try {
			// Connexion à l'URL du detail de la rando
			Document doc = Jsoup.connect(randoTemp.getUrlDetailWeb()).get();

			rando = randoTemp;

			// On recupere le <body></body> uniquement
			Element body = doc.body();

			// Dans le sous element "centrer_pg", on recupere
			Element bodyData = body.getElementById("centrer_pg");

			// La Reference (Champ obligatoire)
			try {
				String id = bodyData.getElementById("txt_ref_int_annonce")
						.childNode(3).childNode(0).toString();
				rando.setId(Integer.valueOf(id));
			} catch (IndexOutOfBoundsException e) {
				// Champ obligatoire
				return null;
			}

			// La Date (Champ obligatoire)
			try {
				rando.setDate(sdf.parse(bodyData
						.getElementById("txt_ref_int_date").childNode(1)
						.childNode(0).toString()));
			} catch (IndexOutOfBoundsException e) {
				// Champ obligatoire
				return null;
			}

			// Le Lieu (Champ obligatoire)
			try {
				String lieu = bodyData.getElementById("txt_ref_int_lieu")
						.childNode(4).childNode(0).toString();
				rando.setLieu(Html.fromHtml(lieu).toString());
				if (TextUtils.isEmpty(lieu)) {
					// Champ obligatoire
					return null;
				}
			} catch (IndexOutOfBoundsException e) {
				// Champ obligatoire
				return null;
			}

			// Le Site Web de la sortie
			try {
				String siteWeb = bodyData.getElementById("txt_ref_int_site")
						.select("a[href]").attr("href");
				if (!TextUtils.isEmpty(siteWeb)) {
					siteWeb.trim();
				}

				rando.setSiteWeb(Html.fromHtml(siteWeb).toString());
			} catch (IndexOutOfBoundsException e) {
				// Possible si la donnees n'est pas remplie
			}

			// Les Horaires
			try {
				String horaires = bodyData
						.getElementById("txt_ref_int_horaires").childNode(2)
						.childNode(0).toString();
				rando.setHoraires(Html.fromHtml(horaires).toString());
			} catch (IndexOutOfBoundsException e) {
				// Possible si la donnees n'est pas remplie
			}

			// Le Nom de la rando (Champ obligatoire)
			try {
				String nom = bodyData.getElementById("txt_ref_int_nom")
						.childNode(2).childNode(0).toString();
				rando.setNom(Html.fromHtml(nom).toString());
				if (TextUtils.isEmpty(nom)) {
					// Champ obligatoire
					return null;
				}
			} catch (IndexOutOfBoundsException e) {
				// Champ obligatoire
				return null;
			}

			// L'Organisateur
			try {
				String organisateur = bodyData
						.getElementById("txt_ref_int_organisateur")
						.childNode(2).childNode(0).toString();
				rando.setOrganisateur(Html.fromHtml(organisateur).toString());
			} catch (IndexOutOfBoundsException e) {
				// Possible si la donnees n'est pas remplie
			}

			// Le Lieu du RDV
			try {
				String lieuRdv = bodyData.getElementById("txt_ref_int_ldrdv")
						.childNode(1).childNode(0).toString();
				rando.setLieuRdv(Html.fromHtml(lieuRdv).toString());
			} catch (IndexOutOfBoundsException e) {
				// Possible si la donnees n'est pas remplie
			}

			// Le Prix Public
			try {
				String prixPublic = bodyData
						.getElementById("txt_ref_int_prix2").childNode(0)
						.childNode(0).toString();
				rando.setPrixPublic(Html.fromHtml(prixPublic).toString());
			} catch (IndexOutOfBoundsException e) {
				// Possible si la donnees n'est pas remplie
			}

			// Le Prix Club
			try {
				String prixClub = bodyData.getElementById("txt_ref_int_prix4")
						.childNode(1).childNode(0).toString();
				rando.setPrixClub(Html.fromHtml(prixClub).toString());
			} catch (IndexOutOfBoundsException e) {
				// Possible si la donnees n'est pas remplie
			}

			// Le Contact
			try {
				String contact = bodyData
						.getElementById("txt_ref_int_contacttxt").childNode(0)
						.childNode(0).toString();
				rando.setContact(Html.fromHtml(contact).toString());
			} catch (IndexOutOfBoundsException e) {
				// Possible si la donnees n'est pas remplie
			}

			// La Description
			try {
				String description = bodyData
						.getElementById("txt_ref_int_decription").childNode(1)
						.childNode(0).toString();
				rando.setDescription(Html.fromHtml(description).toString());
			} catch (IndexOutOfBoundsException e) {
				// Possible si la donnees n'est pas remplie
			}

			// TODO : FLYER

			rando.setTemporaire(false);

		} catch (NullPointerException e) {
			Log.v("Erreur lors de la recuperation des détails de la Rando : ",
					randoTemp.getUrlDetailWeb());
			rando = null;
		} catch (ParseException e) {
			Log.v("Erreur lors de la conversion de la date de la Rando : ",
					randoTemp.getUrlDetailWeb());
			rando = null;
		} catch (IOException e) {
			Log.v("Impossible de parser l'URL : ", randoTemp.getUrlDetailWeb());
			rando = null;
		}

		return rando;

	}
	// /**
	// * Methode d'extraction des donnees d'une rando
	// * a partir du texte du <Body>.
	// *
	// * @param detailRandoText
	// * Detail d'une rando
	// * @param url
	// * URL de la rando
	// * @return
	// * @throws UnsupportedEncodingException
	// */
	// private static Rando extraireDetailRando(Rando rando, String
	// detailRandoText) {
	// // throws UnsupportedEncodingException {
	//
	// // Rando rando = new Rando();
	// // rando.setUrlDetailWeb(url);
	// // rando.setTypeSport(URLtoParse.getSport());
	//
	// // Reference
	// String textDeb = "R\u00E9f\u00E9rence interne de l'annonce ......:";
	// String textFin = "Date......";
	// int indexDeb = TextUtils.indexOf(detailRandoText, textDeb)
	// + textDeb.length();
	// int indexFin = TextUtils.indexOf(detailRandoText, textFin);
	// if (indexDeb >= 0 && indexFin >= 0 && indexFin >= indexDeb) {
	// String result = TextUtils.substring(detailRandoText, indexDeb,
	// indexFin);
	// rando.setId(Integer.valueOf(result));
	// }
	//
	// // Site Web de la sortie
	// textDeb = "Site de la sortie ..:";
	// textFin = "Horaires ....";
	// indexDeb = TextUtils.indexOf(detailRandoText, textDeb)
	// + textDeb.length();
	// indexFin = TextUtils.indexOf(detailRandoText, textFin);
	// if (indexDeb >= 0 && indexFin >= 0 && indexFin >= indexDeb) {
	// String result = TextUtils.substring(detailRandoText, indexDeb,
	// indexFin);
	// rando.setSiteWeb(result);
	// }
	//
	// // - Departement
	// textDeb = "D\u00E9partement........:";
	// textFin = "Lieu";
	// indexDeb = TextUtils.indexOf(detailRandoText, textDeb)
	// + textDeb.length();
	// indexFin = TextUtils.indexOf(detailRandoText, textFin);
	// if (indexDeb >= 0 && indexFin >= 0 && indexFin >= indexDeb) {
	// String result = TextUtils.substring(detailRandoText, indexDeb,
	// indexFin);
	// rando.setDepartement(Integer.valueOf(result));
	// }
	//
	// // - Contact
	// textDeb = "Contact.............:";
	// textFin = "Description.......:";
	// indexDeb = TextUtils.indexOf(detailRandoText, textDeb)
	// + textDeb.length();
	// indexFin = TextUtils.indexOf(detailRandoText, textFin);
	// if (indexDeb >= 0 && indexFin >= 0 && indexFin >= indexDeb) {
	// String result = TextUtils.substring(detailRandoText, indexDeb,
	// indexFin);
	// // result = TextUtils.replace(result, "'", "''");
	// rando.setContact(result);
	// }
	//
	// // - Description
	// textDeb = "Description.......:";
	// textFin = "RETROUVEZ TOUTES LES SORTIES SUR : http://vttrando.free.fr";
	// indexDeb = TextUtils.indexOf(detailRandoText, textDeb)
	// + textDeb.length();
	// indexFin = TextUtils.indexOf(detailRandoText, textFin);
	// if (indexDeb >= 0 && indexFin >= 0 && indexFin >= indexDeb) {
	// String result = TextUtils.substring(detailRandoText, indexDeb,
	// indexFin);
	// // result = TextUtils.replace(result, "'", "''");
	// rando.setDescription(result);
	// }
	//
	// // - Nom sortie
	// textDeb = "DETAILS DE LA SORTIE :";
	// textFin = "Date..................:";
	// indexDeb = TextUtils.indexOf(detailRandoText, textDeb)
	// + textDeb.length();
	// indexFin = TextUtils.indexOf(detailRandoText, textFin);
	// if (indexDeb >= 0 && indexFin >= 0 && indexFin >= indexDeb) {
	// String result = TextUtils.substring(detailRandoText, indexDeb,
	// indexFin);
	// // result = TextUtils.replace(result, "'", "''");
	// rando.setNom(result);
	// }
	//
	// // - Date
	// textDeb = "Date..................:";
	// textFin = "D\u00E9partement......:";
	// indexDeb = TextUtils.indexOf(detailRandoText, textDeb)
	// + textDeb.length();
	// indexFin = TextUtils.indexOf(detailRandoText, textFin);
	// if (indexDeb >= 0 && indexFin >= 0 && indexFin >= indexDeb) {
	// String result = TextUtils.substring(detailRandoText, indexDeb,
	// indexFin);
	// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	// try {
	// rando.setDate(sdf.parse(result));
	// } catch (ParseException e) {
	// System.out.println(result);
	// }
	// }
	//
	// // - Lieu
	// textDeb = "Lieu..................:";
	// textFin = "Organisateur......:";
	// indexDeb = TextUtils.indexOf(detailRandoText, textDeb)
	// + textDeb.length();
	// indexFin = TextUtils.indexOf(detailRandoText, textFin);
	// if (indexDeb >= 0 && indexFin >= 0 && indexFin >= indexDeb) {
	// String result = TextUtils.substring(detailRandoText, indexDeb,
	// indexFin);
	// // result = TextUtils.replace(result, "'", "''");
	// rando.setLieu(result);
	// }
	//
	// // - Organisateur
	// textDeb = "Organisateur......:";
	// textFin = "Horaires............:";
	// indexDeb = TextUtils.indexOf(detailRandoText, textDeb)
	// + textDeb.length();
	// indexFin = TextUtils.indexOf(detailRandoText, textFin);
	// if (indexDeb >= 0 && indexFin >= 0 && indexFin >= indexDeb) {
	// String result = TextUtils.substring(detailRandoText, indexDeb,
	// indexFin);
	// // result = TextUtils.replace(result, "'", "''");
	// rando.setOrganisateur(result);
	// }
	//
	// // - Horaires
	// textDeb = "Horaires............:";
	// textFin = "Prix public.........:";
	// indexDeb = TextUtils.indexOf(detailRandoText, textDeb)
	// + textDeb.length();
	// indexFin = TextUtils.indexOf(detailRandoText, textFin);
	// if (indexDeb >= 0 && indexFin >= 0 && indexFin >= indexDeb) {
	// String result = TextUtils.substring(detailRandoText, indexDeb,
	// indexFin);
	// // result = TextUtils.replace(result, "'", "''");
	// rando.setHoraires(result);
	// }
	//
	// // - Prix public
	// textDeb = "Prix public.........:";
	// textFin = "Prix club............:";
	// indexDeb = TextUtils.indexOf(detailRandoText, textDeb)
	// + textDeb.length();
	// indexFin = TextUtils.indexOf(detailRandoText, textFin);
	// if (indexDeb >= 0 && indexFin >= 0 && indexFin >= indexDeb) {
	// String result = TextUtils.substring(detailRandoText, indexDeb,
	// indexFin);
	// // result = TextUtils.replace(result, "?", "\u20AC");
	// // result = TextUtils.replace(result, "'", "''");
	// rando.setPrixPublic(result);
	// }
	//
	// // - Prix club
	// textDeb = "Prix club............:";
	// textFin = "Lieu de R-d-V....:";
	// indexDeb = TextUtils.indexOf(detailRandoText, textDeb)
	// + textDeb.length();
	// indexFin = TextUtils.indexOf(detailRandoText, textFin);
	// if (indexDeb >= 0 && indexFin >= 0 && indexFin >= indexDeb) {
	// String result = TextUtils.substring(detailRandoText, indexDeb,
	// indexFin);
	// // result = TextUtils.replace(result, "?", "\u20AC");
	// // result = TextUtils.replace(result, "'", "''");
	// rando.setPrixClub(result);
	// }
	//
	// // - Lieu de R-d-V
	// textDeb = "Lieu de R-d-V....:";
	// textFin = "Contact.............:";
	// indexDeb = TextUtils.indexOf(detailRandoText, textDeb)
	// + textDeb.length();
	// indexFin = TextUtils.indexOf(detailRandoText, textFin);
	// if (indexDeb >= 0 && indexFin >= 0 && indexFin >= indexDeb) {
	// String result = TextUtils.substring(detailRandoText, indexDeb,
	// indexFin);
	// // result = TextUtils.replace(result, "'", "''");
	// rando.setLieuRdv(result);
	// }
	//
	// rando.setTemporaire(false);
	//
	// // if all ok, else null
	// return rando;
	// }
}
