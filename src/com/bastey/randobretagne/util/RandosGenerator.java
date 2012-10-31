package com.bastey.randobretagne.util;

import java.util.GregorianCalendar;

import com.bastey.randobretagne.domain.EnumTypeSport;
import com.bastey.randobretagne.domain.Rando;
import com.bastey.randobretagne.domain.Randos;

public class RandosGenerator {

	public static void initData(Randos randos) {

		// Rando1
		Rando r1 = new Rando();
		r1.setId(20743);
		r1.setTypeSport(EnumTypeSport.VTT);
		r1.setDate(new GregorianCalendar(2012, GregorianCalendar.JUNE, 17)
				.getTime());
		r1.setDepartement(56);
		r1.setLieu("Saint GRAVE");
		r1.setNom("rando des Farfadets");
		r1.setOrganisateur("les farfadets");
		r1.setSiteWeb("");
		r1.setContact("");
		r1.setHoraires("7h45");
		r1.setPrixPublic("3,50 p�destre , 4,50 VTT");
		r1.setPrixClub("");
		r1.setLieuRdv("stade de st Grav�");
		r1.setDescription("VTT : 24, 37 et 46 km P�destre : 9, 11, 15 et 17 km");
		r1.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-rando-des-farfadets-20743-1.html");
		randos.add(r1);

		// Rando2
		Rando r2 = new Rando();
		r2.setId(22832);
		r2.setTypeSport(EnumTypeSport.VTT);
		r2.setDepartement(29);
		r2.setDate(new GregorianCalendar(2012, GregorianCalendar.JUNE, 17)
				.getTime());
		r2.setNom("LE TOUR DU MENEZ-HOM");
		r2.setSiteWeb("www.kempervtt.fr");
		r2.setLieu("TREGARVAN");
		r2.setOrganisateur("KEMPER VTT");
		r2.setContact("kempervtt@orange.fr");
		r2.setHoraires("De 07h30 � 09h30");
		r2.setPrixPublic("");
		r2.setPrixClub("");
		r2.setLieuRdv("VILLAGE DE VACANCES DE KERBEUZ");
		r2.setDescription("* VTT : 20 - 30 - 35 - 40 - 50 Km * Parcours marche");
		r2.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-le-tour-du-menez-hom-22832-1.html");
		randos.add(r2);

		// Rando3
		Rando r3 = new Rando();
		r3.setId(22546);
		r3.setTypeSport(EnumTypeSport.VTT);
		r3.setDepartement(35);
		r3.setDate(new GregorianCalendar(2012, GregorianCalendar.JULY, 1)
				.getTime());
		r3.setNom("LA BRETAGNEVTT");
		r3.setSiteWeb("www.bretagnevtt.com");
		r3.setLieu("ERCE PRES LIFFRE");
		r3.setOrganisateur("BRETAGNE VTT");
		r3.setContact("contact@bretagnevtt.com  / 02 56 51 67 87");
		r3.setHoraires("De 08h00 � 10h00");
		r3.setPrixPublic("5 ?");
		r3.setPrixClub("3 ?");
		r3.setLieuRdv("ERCE PRES LIFFRE");
		r3.setDescription("* VTT : 20 - 40 - 60 Km");
		r3.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-la-bretagnevtt-22546-1.html");
		randos.add(r3);

		// Rando4
		Rando r4 = new Rando();
		r4.setId(21954);
		r4.setTypeSport(EnumTypeSport.VTT);
		r4.setDepartement(56);
		r4.setDate(new GregorianCalendar(2012, GregorianCalendar.JUNE, 24)
				.getTime());
		r4.setNom("La vall�e du sedon rando et raid vtt");
		r4.setSiteWeb("vttrando.free.fr/guegon/");
		r4.setLieu("guegon");
		r4.setOrganisateur("vtt club guegon");
		r4.setContact("jagorel.pat@neuf.fr");
		r4.setHoraires("");
		r4.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 12? sur place * 3.50 euros marche");
		r4.setPrixClub("");
		r4.setLieuRdv("Complexe Sportif");
		r4.setDescription("Raid VTT de 80 km avec r�servation sur http://vttrando.free.fr/guegon/ * Rando VTT de 25, 29, 31, 40 et 45 * P�destre de 12, 15 et 17 km");
		r4.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-la-vallee-du-sedon-rando-et-raid-vtt-21954-1.html");
		randos.add(r4);

		// Rando5
		Rando r5 = new Rando();
		r5.setId(23014);
		r5.setTypeSport(EnumTypeSport.VTT);
		r5.setDepartement(29);
		r5.setDate(new GregorianCalendar(2012, GregorianCalendar.JUNE, 17)
				.getTime());
		r5.setNom("Rando VTT et P�destre.");
		r5.setSiteWeb("vtt-coat-meal.over-blog.com/");
		r5.setLieu("coat meal");
		r5.setOrganisateur("coat meal vtt");
		r5.setContact("guezennec.philippe@wanadoo.fr");
		r5.setHoraires("A partir de 8 h");
		r5.setPrixPublic("");
		r5.setPrixClub("");
		r5.setLieuRdv("stade municipale");
		r5.setDescription("rando vtt : 15 / 25 / 35 / 45 / 60 km * rando pedestre : 9 / 16 km * d�part libre * lavage velo , douche , casse croute.");
		r5.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-rando-vtt-et-pedestre-23014-1.html");
		randos.add(r5);

		// Rando6
		Rando r6 = new Rando();
		r6.setId(24718);
		r6.setTypeSport(EnumTypeSport.VTT);
		r6.setDepartement(44);
		r6.setDate(new GregorianCalendar(2012, GregorianCalendar.JULY, 14)
				.getTime());
		r6.setNom("rando vtt et cyclo");
		r6.setSiteWeb("");
		r6.setLieu("ROUGE");
		r6.setOrganisateur("comit� des fetes de roug�");
		r6.setContact("");
		r6.setHoraires("8 h");
		r6.setPrixPublic("vtt 4?50  et  2?  -14ans * cyclo 3?50  et 2? - 14ans");
		r6.setPrixClub("");
		r6.setLieuRdv("t�rrain des vall�es 44660 roug�");
		r6.setDescription("circuit VTT 40 et 20 km ,caf� au d�part , ravitaillement, casse croute et boisson a l'arriv�e * cyclo 70 et 50  km caf� au d�part , casse croute et boisson a l'arriv�e km");
		r6.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-rando-vtt-et-cyclo-24718-1.html");
		randos.add(r6);

		// Rando7
		Rando r7 = new Rando();
		r7.setId(23490);
		r7.setTypeSport(EnumTypeSport.VTT);
		r7.setDepartement(35);
		r7.setDate(new GregorianCalendar(2012, GregorianCalendar.JUNE, 23)
				.getTime());
		r7.setNom("24Heures VTT de la vali�re (9�me �dition)");
		r7.setSiteWeb("www.vttpaysdevitre.org");
		r7.setLieu("VITRE");
		r7.setOrganisateur("Club VTT Au pays de Vitr�");
		r7.setContact("info@vttpaysdevitre.org / 06.75.80.88.73");
		r7.setHoraires("D�part 15h");
		r7.setPrixPublic("Tarif sur le site internet du club d�but 2012");
		r7.setPrixClub("");
		r7.setLieuRdv("Plan d'eau de la Vali�re - Moulin de la haie");
		r7.setDescription("3 cat�gories : en solitaire, en relais de 4 et en relais de 6 * Bivouac ouvert d�s le vendredi soir");
		r7.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-24heures-vtt-de-la-valiere-9eme-edition-23490-1.html");
		randos.add(r7);

		// Rando8
		Rando r8 = new Rando();
		r8.setId(20794);
		r8.setTypeSport(EnumTypeSport.VTT);
		r8.setDepartement(56);
		r8.setDate(new GregorianCalendar(2012, GregorianCalendar.AUGUST, 15)
				.getTime());
		r8.setNom("LA GACELINETTE");
		r8.setSiteWeb("");
		r8.setLieu("LA CHAPELLE GACELINE");
		r8.setOrganisateur("Club de l?Aff");
		r8.setContact("06 66 84 94 13  /  02.99.08.11.07 / 02 99 08 20 09 / patrick.sebillet@orange.fr");
		r8.setHoraires("A partir de 7h45");
		r8.setPrixPublic("");
		r8.setPrixClub("");
		r8.setLieuRdv("Salle communale");
		r8.setDescription("VTT : 10-26-35-39-46-54 Km * P�destre : 12-15-20 Km");
		r8.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-la-gacelinette-20794-1.html");
		randos.add(r8);

		// Rando9
		Rando r9 = new Rando();
		r9.setId(29856);
		r9.setTypeSport(EnumTypeSport.CYCLO);
		r9.setDepartement(35);
		r9.setDate(new GregorianCalendar(2012, GregorianCalendar.JUNE, 23)
				.getTime());
		r9.setNom("24Heures Cyclo de la vali�re (9�me �dition)");
		r9.setSiteWeb("www.cyclopaysdevitre.org");
		r9.setLieu("VITRE");
		r9.setOrganisateur("Club Cycle Au pays de Vitr�");
		r9.setContact("info@vttpaysdevitre.org / 06.75.80.88.73");
		r9.setHoraires("D�part 15h");
		r9.setPrixPublic("Tarif sur le site internet du club d�but 2012");
		r9.setPrixClub("");
		r9.setLieuRdv("Plan d'eau de la Vali�re - Moulin de la haie");
		r9.setDescription("3 cat�gories : en solitaire, en relais de 4 et en relais de 6 * Bivouac ouvert d�s le vendredi soir");
		r9.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-24heures-vtt-de-la-valiere-9eme-edition-23490-1.html");
		randos.add(r9);

		// Rando8
		Rando r10 = new Rando();
		r10.setId(59865);
		r10.setTypeSport(EnumTypeSport.MARCHE);
		r10.setDepartement(56);
		r10.setDate(new GregorianCalendar(2012, GregorianCalendar.AUGUST, 15)
				.getTime());
		r10.setNom("LA GACELINETTE");
		r10.setSiteWeb("");
		r10.setLieu("LA CHAPELLE GACELINE");
		r10.setOrganisateur("Club de l?Aff");
		r10.setContact("06 66 84 94 13  /  02.99.08.11.07 / 02 99 08 20 09 / patrick.sebillet@orange.fr");
		r10.setHoraires("A partir de 7h45");
		r10.setPrixPublic("");
		r10.setPrixClub("");
		r10.setLieuRdv("Salle communale");
		r10.setDescription("VTT : 10-26-35-39-46-54 Km * P�destre : 12-15-20 Km");
		r10.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-la-gacelinette-20794-1.html");
		randos.add(r10);

	}


}
