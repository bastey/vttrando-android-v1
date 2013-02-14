package com.bastey.randobzh.util;

import java.util.GregorianCalendar;

import com.bastey.randobzh.domain.EnumTypeSport;
import com.bastey.randobzh.domain.Rando;
import com.bastey.randobzh.domain.Randos;

public class RandosGenerator {

	public static void initData(Randos randos) {

		// Rando1
		Rando r1 = new Rando();
		r1.setId(20743);
		r1.setTypeSport(EnumTypeSport.VTT);
		r1.setDate(new GregorianCalendar(2013, GregorianCalendar.FEBRUARY, 17)
				.getTime());
		r1.setDepartement(56);
		r1.setLieu("Saint GRAVE");
		r1.setNom("rando des Farfadets");
		r1.setOrganisateur("les farfadets");
		r1.setSiteWeb("");
		r1.setContact("");
		r1.setHoraires("7h45");
		r1.setPrixPublic("3,50 pédestre , 4,50 VTT");
		r1.setPrixClub("");
		r1.setLieuRdv("stade de st Gravé");
		r1.setDescription("VTT : 24, 37 et 46 km Pédestre : 9, 11, 15 et 17 km");
		r1.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-rando-des-farfadets-20743-1.html");
		randos.add(r1);

		// Rando2
		Rando r2 = new Rando();
		r2.setId(22832);
		r2.setTypeSport(EnumTypeSport.VTT);
		r2.setDepartement(29);
		r2.setDate(new GregorianCalendar(2013, GregorianCalendar.FEBRUARY, 19)
				.getTime());
		r2.setNom("LE TOUR DU MENEZ-HOM");
		r2.setSiteWeb("www.kempervtt.fr");
		r2.setLieu("TREGARVAN");
		r2.setOrganisateur("KEMPER VTT");
		r2.setContact("kempervtt@orange.fr");
		r2.setHoraires("De 07h30 à  09h30");
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
		r3.setDate(new GregorianCalendar(2013, GregorianCalendar.FEBRUARY, 28)
				.getTime());
		r3.setNom("LA BRETAGNEVTT");
		r3.setSiteWeb("www.bretagnevtt.com");
		r3.setLieu("ERCE PRES LIFFRE");
		r3.setOrganisateur("BRETAGNE VTT");
		r3.setContact("contact@bretagnevtt.com  / 02 56 51 67 87");
		r3.setHoraires("De 08h00 à  10h00");
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
		r4.setDate(new GregorianCalendar(2013, GregorianCalendar.MARCH, 24)
				.getTime());
		r4.setNom("La vallée du sedon rando et raid vtt");
		r4.setSiteWeb("vttrando.free.fr/guegon/");
		r4.setLieu("guegon");
		r4.setOrganisateur("vtt club guegon");
		r4.setContact("jagorel.pat@neuf.fr");
		r4.setHoraires("");
		r4.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 12? sur place * 3.50 euros marche");
		r4.setPrixClub("");
		r4.setLieuRdv("Complexe Sportif");
		r4.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 25, 29, 31, 40 et 45 * Pédestre de 12, 15 et 17 km");
		r4.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-la-vallee-du-sedon-rando-et-raid-vtt-21954-1.html");
		randos.add(r4);

		// Rando5
		Rando r5 = new Rando();
		r5.setId(23014);
		r5.setTypeSport(EnumTypeSport.VTT);
		r5.setDepartement(29);
		r5.setDate(new GregorianCalendar(2013, GregorianCalendar.MARCH, 1)
				.getTime());
		r5.setNom("Rando VTT et Pédestre.");
		r5.setSiteWeb("vtt-coat-meal.over-blog.com/");
		r5.setLieu("coat meal");
		r5.setOrganisateur("coat meal vtt");
		r5.setContact("guezennec.philippe@wanadoo.fr");
		r5.setHoraires("A partir de 8 h");
		r5.setPrixPublic("");
		r5.setPrixClub("");
		r5.setLieuRdv("stade municipale");
		r5.setDescription("rando vtt : 15 / 25 / 35 / 45 / 60 km * rando pedestre : 9 / 16 km * départ libre * lavage velo , douche , casse croute.");
		r5.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-rando-vtt-et-pedestre-23014-1.html");
		randos.add(r5);

		// Rando6
		Rando r6 = new Rando();
		r6.setId(24718);
		r6.setTypeSport(EnumTypeSport.VTT);
		r6.setDepartement(44);
		r6.setDate(new GregorianCalendar(2013, GregorianCalendar.APRIL, 14)
				.getTime());
		r6.setNom("rando vtt et cyclo");
		r6.setSiteWeb("");
		r6.setLieu("ROUGE");
		r6.setOrganisateur("comité des fetes de rougé");
		r6.setContact("");
		r6.setHoraires("8 h");
		r6.setPrixPublic("vtt 4?50  et  2?  -14ans * cyclo 3?50  et 2? - 14ans");
		r6.setPrixClub("");
		r6.setLieuRdv("terrain des vallées 44660 rougé");
		r6.setDescription("circuit VTT 40 et 20 km ,café au départ , ravitaillement, casse croute et boisson a l'arrivée * cyclo 70 et 50  km café au départ , casse croute et boisson a l'arrivée km");
		r6.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-rando-vtt-et-cyclo-24718-1.html");
		randos.add(r6);

		// Rando7
		Rando r7 = new Rando();
		r7.setId(23490);
		r7.setTypeSport(EnumTypeSport.VTT);
		r7.setDepartement(35);
		r7.setDate(new GregorianCalendar(2013, GregorianCalendar.APRIL, 23)
				.getTime());
		r7.setNom("24Heures VTT de la valière (9ème édition)");
		r7.setSiteWeb("www.vttpaysdevitre.org");
		r7.setLieu("VITRE");
		r7.setOrganisateur("Club VTT Au pays de Vitré");
		r7.setContact("info@vttpaysdevitre.org / 06.75.80.88.73");
		r7.setHoraires("Départ 15h");
		r7.setPrixPublic("Tarif sur le site internet du club début 2012");
		r7.setPrixClub("");
		r7.setLieuRdv("Plan d'eau de la Valière - Moulin de la haie");
		r7.setDescription("3 catégories : en solitaire, en relais de 4 et en relais de 6 * Bivouac ouvert dès le vendredi soir");
		r7.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-24heures-vtt-de-la-valiere-9eme-edition-23490-1.html");
		randos.add(r7);

		// Rando8
		Rando r8 = new Rando();
		r8.setId(20794);
		r8.setTypeSport(EnumTypeSport.VTT);
		r8.setDepartement(56);
		r8.setDate(new GregorianCalendar(2013, GregorianCalendar.APRIL, 28)
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
		r8.setDescription("VTT : 10-26-35-39-46-54 Km * Pédestre : 12-15-20 Km");
		r8.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-la-gacelinette-20794-1.html");
		randos.add(r8);

		// Rando9
		Rando r9 = new Rando();
		r9.setId(29856);
		r9.setTypeSport(EnumTypeSport.CYCLO);
		r9.setDepartement(35);
		r9.setDate(new GregorianCalendar(2013, GregorianCalendar.FEBRUARY, 23)
				.getTime());
		r9.setNom("24Heures Cyclo de la valière (9ème édition)");
		r9.setSiteWeb("www.cyclopaysdevitre.org");
		r9.setLieu("VITRE");
		r9.setOrganisateur("Club Cycle Au pays de Vitré");
		r9.setContact("info@vttpaysdevitre.org / 06.75.80.88.73");
		r9.setHoraires("Départ 15h");
		r9.setPrixPublic("Tarif sur le site internet du club début 2012");
		r9.setPrixClub("");
		r9.setLieuRdv("Plan d'eau de la Valière - Moulin de la haie");
		r9.setDescription("3 catégories : en solitaire, en relais de 4 et en relais de 6 * Bivouac ouvert dès le vendredi soir");
		r9.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-24heures-vtt-de-la-valiere-9eme-edition-23490-1.html");
		randos.add(r9);

		// Rando8
		Rando r10 = new Rando();
		r10.setId(59865);
		r10.setTypeSport(EnumTypeSport.MARCHE);
		r10.setDepartement(56);
		r10.setDate(new GregorianCalendar(2013, GregorianCalendar.FEBRUARY, 15)
				.getTime());
		r10.setNom("LA GACELINETTE");
		r10.setSiteWeb("");
		r10.setLieu("LA CHAPELLE GACELINE");
		r10.setOrganisateur("Club de l'Aff");
		r10.setContact("06 66 84 94 13  /  02.99.08.11.07 / 02 99 08 20 09 / patrick.sebillet@orange.fr");
		r10.setHoraires("A partir de 7h45");
		r10.setPrixPublic("");
		r10.setPrixClub("");
		r10.setLieuRdv("Salle communale");
		r10.setDescription("VTT : 10-26-35-39-46-54 Km * Pédestre : 12-15-20 Km");
		r10.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-la-gacelinette-20794-1.html");
		randos.add(r10);

		// ==========================================================================================
		// Rando20
		Rando r20 = new Rando();
		r20.setId(29520);
		r20.setTypeSport(EnumTypeSport.VTT);
		r20.setDepartement(56);
		r20.setDate(new GregorianCalendar(2013, GregorianCalendar.MARCH, 15)
				.getTime());
		r20.setNom("La vallée du sedon rando et raid vtt");
		r20.setSiteWeb("vttrando.free.fr/guegon/");
		r20.setLieu("guegon");
		r20.setOrganisateur("vtt club guegon");
		r20.setContact("jagorel.pat@neuf.fr");
		r20.setHoraires("");
		r20.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 12? sur place * 3.50 euros marche");
		r20.setPrixClub("");
		r20.setLieuRdv("Complexe Sportif");
		r20.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 25, 29, 31, 200 et 205 * Pédestre de 12, 15 et 17 km");
		r20.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2012/fiche-la-vallee-du-sedon-rando-et-raid-vtt-219520-1.html");
		randos.add(r20);

		// Rando21
		Rando r21 = new Rando();
		r21.setId(21521);
		r21.setTypeSport(EnumTypeSport.VTT);
		r21.setDepartement(56);
		r21.setDate(new GregorianCalendar(2113, GregorianCalendar.MARCH, 16)
				.getTime());
		r21.setNom("La vallée du sedon rando et raid vtt");
		r21.setSiteWeb("vttrando.free.fr/guegon/");
		r21.setLieu("guegon");
		r21.setOrganisateur("vtt club guegon");
		r21.setContact("jagorel.pat@neuf.fr");
		r21.setHoraires("");
		r21.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 12? sur place * 3.50 euros marche");
		r21.setPrixClub("");
		r21.setLieuRdv("Complexe Sportif");
		r21.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 25, 29, 31, 210 et 215 * Pédestre de 12, 15 et 17 km");
		r21.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2112/fiche-la-vallee-du-sedon-rando-et-raid-vtt-219521-1.html");
		randos.add(r21);

		// Rando22
		Rando r22 = new Rando();
		r22.setId(22522);
		r22.setTypeSport(EnumTypeSport.VTT);
		r22.setDepartement(56);
		r22.setDate(new GregorianCalendar(2213, GregorianCalendar.MARCH, 17)
				.getTime());
		r22.setNom("La vallée du sedon rando et raid vtt");
		r22.setSiteWeb("vttrando.free.fr/guegon/");
		r22.setLieu("guegon");
		r22.setOrganisateur("vtt club guegon");
		r22.setContact("jagorel.pat@neuf.fr");
		r22.setHoraires("");
		r22.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 12? sur place * 3.50 euros marche");
		r22.setPrixClub("");
		r22.setLieuRdv("Complexe Sportif");
		r22.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 25, 29, 31, 220 et 225 * Pédestre de 12, 15 et 17 km");
		r22.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2212/fiche-la-vallee-du-sedon-rando-et-raid-vtt-229522-1.html");
		randos.add(r22);

		// Rando23
		Rando r23 = new Rando();
		r23.setId(23523);
		r23.setTypeSport(EnumTypeSport.VTT);
		r23.setDepartement(56);
		r23.setDate(new GregorianCalendar(2313, GregorianCalendar.MARCH, 18)
				.getTime());
		r23.setNom("La vallée du sedon rando et raid vtt");
		r23.setSiteWeb("vttrando.free.fr/guegon/");
		r23.setLieu("guegon");
		r23.setOrganisateur("vtt club guegon");
		r23.setContact("jagorel.pat@neuf.fr");
		r23.setHoraires("");
		r23.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 12? sur place * 3.50 euros marche");
		r23.setPrixClub("");
		r23.setLieuRdv("Complexe Sportif");
		r23.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 25, 29, 31, 230 et 235 * Pédestre de 12, 15 et 17 km");
		r23.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2312/fiche-la-vallee-du-sedon-rando-et-raid-vtt-239523-1.html");
		randos.add(r23);

		// Rando24
		Rando r24 = new Rando();
		r24.setId(24524);
		r24.setTypeSport(EnumTypeSport.VTT);
		r24.setDepartement(56);
		r24.setDate(new GregorianCalendar(2413, GregorianCalendar.MARCH, 19)
				.getTime());
		r24.setNom("La vallée du sedon rando et raid vtt");
		r24.setSiteWeb("vttrando.free.fr/guegon/");
		r24.setLieu("guegon");
		r24.setOrganisateur("vtt club guegon");
		r24.setContact("jagorel.pat@neuf.fr");
		r24.setHoraires("");
		r24.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 12? sur place * 3.50 euros marche");
		r24.setPrixClub("");
		r24.setLieuRdv("Complexe Sportif");
		r24.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 25, 29, 31, 240 et 245 * Pédestre de 12, 15 et 17 km");
		r24.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2412/fiche-la-vallee-du-sedon-rando-et-raid-vtt-249524-1.html");
		randos.add(r24);

		// Rando25
		Rando r25 = new Rando();
		r25.setId(25525);
		r25.setTypeSport(EnumTypeSport.VTT);
		r25.setDepartement(56);
		r25.setDate(new GregorianCalendar(2513, GregorianCalendar.MARCH, 20)
				.getTime());
		r25.setNom("La vallée du sedon rando et raid vtt");
		r25.setSiteWeb("vttrando.free.fr/guegon/");
		r25.setLieu("guegon");
		r25.setOrganisateur("vtt club guegon");
		r25.setContact("jagorel.pat@neuf.fr");
		r25.setHoraires("");
		r25.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 12? sur place * 3.50 euros marche");
		r25.setPrixClub("");
		r25.setLieuRdv("Complexe Sportif");
		r25.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 25, 29, 31, 250 et 255 * Pédestre de 12, 15 et 17 km");
		r25.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2512/fiche-la-vallee-du-sedon-rando-et-raid-vtt-259525-1.html");
		randos.add(r25);

		// Rando26
		Rando r26 = new Rando();
		r26.setId(26526);
		r26.setTypeSport(EnumTypeSport.VTT);
		r26.setDepartement(56);
		r26.setDate(new GregorianCalendar(2613, GregorianCalendar.MARCH, 21)
				.getTime());
		r26.setNom("La vallée du sedon rando et raid vtt");
		r26.setSiteWeb("vttrando.free.fr/guegon/");
		r26.setLieu("guegon");
		r26.setOrganisateur("vtt club guegon");
		r26.setContact("jagorel.pat@neuf.fr");
		r26.setHoraires("");
		r26.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 12? sur place * 3.50 euros marche");
		r26.setPrixClub("");
		r26.setLieuRdv("Complexe Sportif");
		r26.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 26, 29, 31, 260 et 265 * Pédestre de 12, 15 et 17 km");
		r26.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2612/fiche-la-vallee-du-sedon-rando-et-raid-vtt-269526-1.html");
		randos.add(r26);

		// Rando27
		Rando r27 = new Rando();
		r27.setId(27527);
		r27.setTypeSport(EnumTypeSport.VTT);
		r27.setDepartement(56);
		r27.setDate(new GregorianCalendar(2713, GregorianCalendar.MARCH, 22)
				.getTime());
		r27.setNom("La vallée du sedon rando et raid vtt");
		r27.setSiteWeb("vttrando.free.fr/guegon/");
		r27.setLieu("guegon");
		r27.setOrganisateur("vtt club guegon");
		r27.setContact("jagorel.pat@neuf.fr");
		r27.setHoraires("");
		r27.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 12? sur place * 3.50 euros marche");
		r27.setPrixClub("");
		r27.setLieuRdv("Complexe Sportif");
		r27.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 27, 29, 31, 270 et 275 * Pédestre de 12, 15 et 17 km");
		r27.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2712/fiche-la-vallee-du-sedon-rando-et-raid-vtt-279527-1.html");
		randos.add(r27);

		// Rando28
		Rando r28 = new Rando();
		r28.setId(28528);
		r28.setTypeSport(EnumTypeSport.VTT);
		r28.setDepartement(56);
		r28.setDate(new GregorianCalendar(2813, GregorianCalendar.MARCH, 23)
				.getTime());
		r28.setNom("La vallée du sedon rando et raid vtt");
		r28.setSiteWeb("vttrando.free.fr/guegon/");
		r28.setLieu("guegon");
		r28.setOrganisateur("vtt club guegon");
		r28.setContact("jagorel.pat@neuf.fr");
		r28.setHoraires("");
		r28.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 12? sur place * 3.50 euros marche");
		r28.setPrixClub("");
		r28.setLieuRdv("Complexe Sportif");
		r28.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 28, 29, 31, 280 et 285 * Pédestre de 12, 15 et 17 km");
		r28.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2812/fiche-la-vallee-du-sedon-rando-et-raid-vtt-289528-1.html");
		randos.add(r28);

		// Rando29
		Rando r29 = new Rando();
		r29.setId(29529);
		r29.setTypeSport(EnumTypeSport.VTT);
		r29.setDepartement(56);
		r29.setDate(new GregorianCalendar(2913, GregorianCalendar.MARCH, 24)
				.getTime());
		r29.setNom("La vallée du sedon rando et raid vtt");
		r29.setSiteWeb("vttrando.free.fr/guegon/");
		r29.setLieu("guegon");
		r29.setOrganisateur("vtt club guegon");
		r29.setContact("jagorel.pat@neuf.fr");
		r29.setHoraires("");
		r29.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 12? sur place * 3.50 euros marche");
		r29.setPrixClub("");
		r29.setLieuRdv("Complexe Sportif");
		r29.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 29, 29, 31, 290 et 295 * Pédestre de 12, 15 et 17 km");
		r29.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-2912/fiche-la-vallee-du-sedon-rando-et-raid-vtt-299529-1.html");
		randos.add(r29);

		// Rando30
		Rando r30 = new Rando();
		r30.setId(39530);
		r30.setTypeSport(EnumTypeSport.VTT);
		r30.setDepartement(56);
		r30.setDate(new GregorianCalendar(3013, GregorianCalendar.MARCH, 15)
				.getTime());
		r30.setNom("La vallée du sedon rando et raid vtt");
		r30.setSiteWeb("vttrando.free.fr/guegon/");
		r30.setLieu("guegon");
		r30.setOrganisateur("vtt club guegon");
		r30.setContact("jagorel.pat@neuf.fr");
		r30.setHoraires("");
		r30.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 13? sur place * 3.50 euros marche");
		r30.setPrixClub("");
		r30.setLieuRdv("Complexe Sportif");
		r30.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 35, 39, 31, 300 et 305 * Pédestre de 13, 15 et 17 km");
		r30.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-3013/fiche-la-vallee-du-sedon-rando-et-raid-vtt-319530-1.html");
		randos.add(r30);

		// Rando31
		Rando r31 = new Rando();
		r31.setId(31531);
		r31.setTypeSport(EnumTypeSport.VTT);
		r31.setDepartement(56);
		r31.setDate(new GregorianCalendar(3113, GregorianCalendar.MARCH, 16)
				.getTime());
		r31.setNom("La vallée du sedon rando et raid vtt");
		r31.setSiteWeb("vttrando.free.fr/guegon/");
		r31.setLieu("guegon");
		r31.setOrganisateur("vtt club guegon");
		r31.setContact("jagorel.pat@neuf.fr");
		r31.setHoraires("");
		r31.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 13? sur place * 3.50 euros marche");
		r31.setPrixClub("");
		r31.setLieuRdv("Complexe Sportif");
		r31.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 35, 39, 31, 310 et 315 * Pédestre de 13, 15 et 17 km");
		r31.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-3113/fiche-la-vallee-du-sedon-rando-et-raid-vtt-319531-1.html");
		randos.add(r31);

		// Rando33
		Rando r33 = new Rando();
		r33.setId(33533);
		r33.setTypeSport(EnumTypeSport.VTT);
		r33.setDepartement(56);
		r33.setDate(new GregorianCalendar(3313, GregorianCalendar.MARCH, 17)
				.getTime());
		r33.setNom("La vallée du sedon rando et raid vtt");
		r33.setSiteWeb("vttrando.free.fr/guegon/");
		r33.setLieu("guegon");
		r33.setOrganisateur("vtt club guegon");
		r33.setContact("jagorel.pat@neuf.fr");
		r33.setHoraires("");
		r33.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 13? sur place * 3.50 euros marche");
		r33.setPrixClub("");
		r33.setLieuRdv("Complexe Sportif");
		r33.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 35, 39, 31, 330 et 335 * Pédestre de 13, 15 et 17 km");
		r33.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-3313/fiche-la-vallee-du-sedon-rando-et-raid-vtt-339533-1.html");
		randos.add(r33);

		// Rando34
		Rando r34 = new Rando();
		r34.setId(34534);
		r34.setTypeSport(EnumTypeSport.VTT);
		r34.setDepartement(56);
		r34.setDate(new GregorianCalendar(3413, GregorianCalendar.MARCH, 19)
				.getTime());
		r34.setNom("La vallée du sedon rando et raid vtt");
		r34.setSiteWeb("vttrando.free.fr/guegon/");
		r34.setLieu("guegon");
		r34.setOrganisateur("vtt club guegon");
		r34.setContact("jagorel.pat@neuf.fr");
		r34.setHoraires("");
		r34.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 13? sur place * 3.50 euros marche");
		r34.setPrixClub("");
		r34.setLieuRdv("Complexe Sportif");
		r34.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 35, 39, 31, 340 et 345 * Pédestre de 13, 15 et 17 km");
		r34.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-3413/fiche-la-vallee-du-sedon-rando-et-raid-vtt-349534-1.html");
		randos.add(r34);

		// Rando35
		Rando r35 = new Rando();
		r35.setId(35535);
		r35.setTypeSport(EnumTypeSport.VTT);
		r35.setDepartement(56);
		r35.setDate(new GregorianCalendar(3513, GregorianCalendar.MARCH, 30)
				.getTime());
		r35.setNom("La vallée du sedon rando et raid vtt");
		r35.setSiteWeb("vttrando.free.fr/guegon/");
		r35.setLieu("guegon");
		r35.setOrganisateur("vtt club guegon");
		r35.setContact("jagorel.pat@neuf.fr");
		r35.setHoraires("");
		r35.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 13? sur place * 3.50 euros marche");
		r35.setPrixClub("");
		r35.setLieuRdv("Complexe Sportif");
		r35.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 35, 39, 31, 350 et 355 * Pédestre de 13, 15 et 17 km");
		r35.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-3513/fiche-la-vallee-du-sedon-rando-et-raid-vtt-359535-1.html");
		randos.add(r35);

		// Rando36
		Rando r36 = new Rando();
		r36.setId(36536);
		r36.setTypeSport(EnumTypeSport.VTT);
		r36.setDepartement(56);
		r36.setDate(new GregorianCalendar(3613, GregorianCalendar.MARCH, 31)
				.getTime());
		r36.setNom("La vallée du sedon");
		r36.setSiteWeb("vttrando.free.fr/guegon/");
		r36.setLieu("guegon");
		r36.setOrganisateur("vtt club guegon");
		r36.setContact("jagorel.pat@neuf.fr");
		r36.setHoraires("");
		r36.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 13? sur place * 3.50 euros marche");
		r36.setPrixClub("");
		r36.setLieuRdv("Complexe Sportif");
		r36.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 36, 39, 31, 360 et 365 * Pédestre de 13, 15 et 17 km");
		r36.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-3613/fiche-la-vallee-du-sedon-rando-et-raid-vtt-369536-1.html");
		randos.add(r36);

		// Rando37
		Rando r37 = new Rando();
		r37.setId(37537);
		r37.setTypeSport(EnumTypeSport.VTT);
		r37.setDepartement(56);
		r37.setDate(new GregorianCalendar(3713, GregorianCalendar.MARCH, 33)
				.getTime());
		r37.setNom("La vallée du sedon rando et raid vtt");
		r37.setSiteWeb("vttrando.free.fr/guegon/");
		r37.setLieu("guegon");
		r37.setOrganisateur("vtt club guegon");
		r37.setContact("jagorel.pat@neuf.fr");
		r37.setHoraires("");
		r37.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 13? sur place * 3.50 euros marche");
		r37.setPrixClub("");
		r37.setLieuRdv("Complexe Sportif");
		r37.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 37, 39, 31, 370 et 375 * Pédestre de 13, 15 et 17 km");
		r37.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-3713/fiche-la-vallee-du-sedon-rando-et-raid-vtt-379537-1.html");
		randos.add(r37);

		// Rando38
		Rando r38 = new Rando();
		r38.setId(38538);
		r38.setTypeSport(EnumTypeSport.VTT);
		r38.setDepartement(56);
		r38.setDate(new GregorianCalendar(3813, GregorianCalendar.MARCH, 33)
				.getTime());
		r38.setNom("La vallée du sedon rando et raid vtt");
		r38.setSiteWeb("vttrando.free.fr/guegon/");
		r38.setLieu("guegon");
		r38.setOrganisateur("vtt club guegon");
		r38.setContact("jagorel.pat@neuf.fr");
		r38.setHoraires("");
		r38.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 13? sur place * 3.50 euros marche");
		r38.setPrixClub("");
		r38.setLieuRdv("Complexe Sportif");
		r38.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 38, 39, 31, 380 et 385 * Pédestre de 13, 15 et 17 km");
		r38.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-3813/fiche-la-vallee-du-sedon-rando-et-raid-vtt-389538-1.html");
		randos.add(r38);

		// Rando39
		Rando r39 = new Rando();
		r39.setId(39539);
		r39.setTypeSport(EnumTypeSport.VTT);
		r39.setDepartement(56);
		r39.setDate(new GregorianCalendar(3913, GregorianCalendar.MARCH, 34)
				.getTime());
		r39.setNom("La vallée du sedon");
		r39.setSiteWeb("vttrando.free.fr/guegon/");
		r39.setLieu("guegon");
		r39.setOrganisateur("vtt club guegon");
		r39.setContact("jagorel.pat@neuf.fr");
		r39.setHoraires("");
		r39.setPrixPublic("5 euros vtt pour la rando * 9? pour le raid inscription sur le site internet * 13? sur place * 3.50 euros marche");
		r39.setPrixClub("");
		r39.setLieuRdv("Complexe Sportif");
		r39.setDescription("Raid VTT de 80 km avec réservation sur http://vttrando.free.fr/guegon/ * Rando VTT de 39, 39, 31, 390 et 395 * Pédestre de 13, 15 et 17 km");
		r39.setUrlDetailWeb("http://www.nafix.fr/sorties/vtt-3913/fiche-la-vallee-du-sedon-rando-et-raid-vtt-399539-1.html");
		randos.add(r39);

	}

}
