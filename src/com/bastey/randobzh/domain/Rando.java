package com.bastey.randobzh.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Objet Randonnee.
 * 
 * @author bastey
 */
public class Rando implements Comparable<Rando>, Parcelable {

	/** Reference de la rando. */
	private int id;

	/**
	 * Flag indiquant que la rando est temporaire : les détails ne sont pas
	 * encore récupérés.
	 */
	private boolean temporaire;

	/** Type de sport. */
	private EnumTypeSport typeSport;

	/** DEPARTEMENT. */
	private int departement;

	/** DATE de la rando. */
	private Date date;

	/** LIEU. */
	private String lieu;

	/** NOM DE LA RANDO. */
	private String nom;

	/** ORGANISATEUR. */
	private String organisateur;

	/** LIEU DU RDV. */
	private String lieuRdv;

	/** HORAIRES. */
	private String horaires;

	/** SITE INTERNET DE LA SORTIE. */
	private String siteWeb;

	/** PRIX PUBLIC. */
	private String prixPublic;

	/** PRIX CLUB. */
	private String prixClub;

	/** CONTACT. */
	private String contact;

	/** DESCRIPTION. */
	private String description;

	/** URL FLYER. */
	// http://www.nafix.fr/tracts/flyer-99-les-portes-de-l-arree-2012-15966.html
	// http://www.nafix.fr/tracts/2012/tract_22991.pdf
	private String urlFlyer;

	/** URL PAGE WEB DETAIL DE LA RANDO. */
	private String urlDetailWeb;

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",
			Locale.FRANCE);
	private SimpleDateFormat sdfWithoutYear = new SimpleDateFormat("dd/MM",
			Locale.FRANCE);

	/**
	 * Constructeur par defaut.
	 */
	public Rando() {
		super();
	}

	/**
	 * Constructeur d'une rando Temporaire.
	 */
	public Rando(boolean pTemporaire) {
		super();
		this.setTemporaire(pTemporaire);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the typeSport
	 */
	public EnumTypeSport getTypeSport() {
		return typeSport;
	}

	/**
	 * @return the departement
	 */
	public int getDepartement() {
		return departement;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @return the date au format dd/MM
	 */
	public String getDateStr() {
		return sdfWithoutYear.format(date);
	}

	/**
	 * @return the date au format dd/MM/yyyy
	 */
	private String getDateStrDetail() {
		return sdf.format(date);
	}

	/**
	 * @return the lieu
	 */
	public String getLieu() {
		return lieu;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the organisateur
	 */
	public String getOrganisateur() {
		return organisateur;
	}

	/**
	 * @return the lieuRdv
	 */
	public String getLieuRdv() {
		return lieuRdv;
	}

	/**
	 * @return the horaires
	 */
	public String getHoraires() {
		return horaires;
	}

	/**
	 * @return the siteWeb
	 */
	public String getSiteWeb() {
		return siteWeb;
	}

	/**
	 * @return the prixPublic
	 */
	public String getPrixPublic() {
		return prixPublic;
	}

	/**
	 * @return the prixClub
	 */
	public String getPrixClub() {
		return prixClub;
	}

	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the urlFlyer
	 */
	public String getUrlFlyer() {
		return urlFlyer;
	}

	/**
	 * @return the urlDetailWeb
	 */
	public String getUrlDetailWeb() {
		return urlDetailWeb;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int pId) {
		this.id = pId;
	}

	/**
	 * @param typeSport
	 *            the typeSport to set
	 */
	public void setTypeSport(EnumTypeSport typeSport) {
		this.typeSport = typeSport;
	}

	/**
	 * @param departement
	 *            the departement to set
	 */
	public void setDepartement(int departement) {
		this.departement = departement;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @param lieu
	 *            the lieu to set
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param organisateur
	 *            the organisateur to set
	 */
	public void setOrganisateur(String organisateur) {
		this.organisateur = organisateur;
	}

	/**
	 * @param lieuRdv
	 *            the lieuRdv to set
	 */
	public void setLieuRdv(String lieuRdv) {
		this.lieuRdv = lieuRdv;
	}

	/**
	 * @param horaires
	 *            the horaires to set
	 */
	public void setHoraires(String horaires) {
		this.horaires = horaires;
	}

	/**
	 * @param siteWeb
	 *            the siteWeb to set
	 */
	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	/**
	 * @param prixPublic
	 *            the prixPublic to set
	 */
	public void setPrixPublic(String prixPublic) {
		this.prixPublic = prixPublic;
	}

	/**
	 * @param prixClub
	 *            the prixClub to set
	 */
	public void setPrixClub(String prixClub) {
		this.prixClub = prixClub;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param urlFlyer
	 *            the urlFlyer to set
	 */
	public void setUrlFlyer(String urlFlyer) {
		this.urlFlyer = urlFlyer;
	}

	/**
	 * @param urlDetailWeb
	 *            the urlDetailWeb to set
	 */
	public void setUrlDetailWeb(String urlDetailWeb) {
		this.urlDetailWeb = urlDetailWeb;
	}

	/**
	 * @return the temporaire flag
	 */
	public boolean isTemporaire() {
		return temporaire;
	}

	/**
	 * @param temporaire
	 *            the temporaire to set
	 */
	public void setTemporaire(boolean temporaire) {
		this.temporaire = temporaire;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String TAB = "   ";
		// char LF = CharUtils.LF;
		String LF = "\n";
		StringBuffer sb = new StringBuffer();
		sb.append("Rando : '").append(id).append("'");
		sb.append(LF).append(TAB).append("Sport : '").append(typeSport.name())
				.append("'");
		sb.append(LF).append(TAB).append("Departement : '").append(departement)
				.append("'");
		sb.append(LF).append(TAB).append("Date : '").append(sdf.format(date))
				.append("'");
		sb.append(LF).append(TAB).append("Nom : '").append(nom).append("'");
		sb.append(LF).append(TAB).append("Site web : '").append(siteWeb)
				.append("'");
		sb.append(LF).append(TAB).append("Lieu : '").append(lieu).append("'");
		sb.append(LF).append(TAB).append("Organisateur : '")
				.append(organisateur).append("'");
		sb.append(LF).append(TAB).append("Contact : '").append(contact)
				.append("'");
		sb.append(LF).append(TAB).append("Horaires : '").append(horaires)
				.append("'");
		sb.append(LF).append(TAB).append("Prix public : '").append(prixPublic)
				.append("'");
		sb.append(LF).append(TAB).append("Prix club : '").append(prixClub)
				.append("'");
		sb.append(LF).append(TAB).append("Lieu RDV : '").append(lieuRdv)
				.append("'");
		sb.append(LF).append(TAB).append("Description : '").append(description)
				.append("'");
		sb.append(LF).append(TAB).append("URL detail : '").append(urlDetailWeb)
				.append("'");
		return sb.toString();
	}

	/**
	 * Comparateur permettant de trier les randos. <br>
	 * Sert au trie dans la vue Liste des randos.
	 * <p>
	 * On trie est Date, puis département, puis nom.
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Rando rando) {
		int result = this.getDate().compareTo(rando.getDate());

		if (result == 0) {
			result = Integer.valueOf(this.getDepartement()).compareTo(
					Integer.valueOf(rando.getDepartement()));
			if (result == 0 && this.getNom() != null) {
				result = this.getNom().compareToIgnoreCase(rando.getNom());
			}
		}

		return result;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeInt(id);
		dest.writeString(typeSport.getLabel());
		dest.writeInt(departement);
		dest.writeString(this.getDateStrDetail());
		dest.writeString(lieu);
		dest.writeString(nom);
		dest.writeString(organisateur);
		dest.writeString(lieuRdv);
		dest.writeString(horaires);
		dest.writeString(siteWeb);
		dest.writeString(prixPublic);
		dest.writeString(prixClub);
		dest.writeString(contact);
		dest.writeString(description);
		dest.writeString(urlFlyer);
		dest.writeString(urlDetailWeb);
	}

	public static final Parcelable.Creator<Rando> CREATOR = new Parcelable.Creator<Rando>() {
		@Override
		public Rando createFromParcel(Parcel source) {
			return new Rando(source);
		}

		@Override
		public Rando[] newArray(int size) {
			return new Rando[size];
		}
	};

	public Rando(Parcel in) {
		try {
			this.id = in.readInt();
			this.typeSport = EnumTypeSport.getTypeSport(in.readString());
			this.departement = in.readInt();
			this.date = sdf.parse(in.readString());
			this.lieu = in.readString();
			this.nom = in.readString();
			this.organisateur = in.readString();
			this.lieuRdv = in.readString();
			this.horaires = in.readString();
			this.siteWeb = in.readString();
			this.prixPublic = in.readString();
			this.prixClub = in.readString();
			this.contact = in.readString();
			this.description = in.readString();
			this.urlFlyer = in.readString();
			this.urlDetailWeb = in.readString();
		} catch (ParseException e) {
			// TODO
			e.printStackTrace();
		}
	}

}
