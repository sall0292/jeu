class Joueur {
	private String Nom;
	private Voiture v;
	private int JPosition;
	private boolean Tour;
	// POSITIONS DU JOUEUR 1
	int PlacementJoueur1[][] = { { 760, 607 }, { 685, 567 },
			{ 635, 567 }, { 585, 567 }, { 545, 567 }, { 495, 567 },
			{ 445, 567 }, { 395, 567 }, { 345, 567 }, { 295, 567 },
			{ 250, 587 }, { 278, 550 }, { 278, 500 }, { 278, 450 },
			{ 278, 400 }, { 278, 350 }, { 278, 300 }, { 278, 255 },
			{ 278, 205 }, { 278, 155 }, { 240, 97 }, { 295, 117 },
			{ 345, 117 }, { 395, 117 }, { 445, 117 }, { 495, 117 },
			{ 545, 117 }, { 585, 117 }, { 635, 117 }, { 685, 117 },
			{ 750, 90 }, { 728, 155 }, { 728, 205 }, { 728, 255 },
			{ 728, 300 }, { 728, 350 }, { 728, 400 }, { 728, 450 },
			{ 728, 500 }, { 728, 550 }, };

	// POSITIONS DU JOUEUR 2
	int PlacementJoueur2[][] = { { 780, 607 }, { 705, 567 },
			{ 655, 567 }, { 605, 567 }, { 565, 567 }, { 515, 567 },
			{ 465, 567 }, { 415, 567 }, { 365, 567 }, { 315, 567 },
			{ 270, 587 }, { 278, 530 }, { 278, 480 }, { 278, 430 },
			{ 278, 380 }, { 278, 330 }, { 278, 280 }, { 278, 235 },
			{ 278, 185 }, { 278, 135 }, { 260, 97 }, { 315, 117 },
			{ 365, 117 }, { 415, 117 }, { 465, 117 }, { 515, 117 },
			{ 565, 117 }, { 605, 117 }, { 655, 117 }, { 705, 117 },
			{ 770, 90 }, { 728, 135 }, { 728, 185 }, { 728, 235 },
			{ 728, 280 }, { 728, 330 }, { 728, 380 }, { 728, 430 },
			{ 728, 480 }, { 728, 530 }, };

	// Accesseurs
	public String getNom() {
		return (Nom);
	}

	public int getJPosition() {
		return (JPosition);
	}

	public void setJPosition(int JPosition) {
		this.JPosition = JPosition;
	}

	public boolean getTour() {
		return (Tour);
	}

	public void setTour(boolean tour) {
		Tour = tour;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public void setV(Voiture v) {
		this.v = v;
	}

	public void setPlacementJoueur1(int[][] placementJoueur1) {
		PlacementJoueur1 = placementJoueur1;
	}

	public void setPlacementJoueur2(int[][] placementJoueur2) {
		PlacementJoueur2 = placementJoueur2;
	}

	public Voiture getV() {
		return v;
	}

	public int[][] getPlacementJoueur1() {
		return PlacementJoueur1;
	}

	public int[][] getPlacementJoueur2() {
		return PlacementJoueur2;
	}

	public Joueur(String Nom) {
		this.Nom = Nom;
		this.JPosition = 0;
		this.Tour = false;
		this.v = new Voiture();

	}

	public Joueur() {
		this.JPosition = 0;
		this.Tour = false;
		this.v = new Voiture();
	}

	public void reculer() {
		this.setJPosition(this.getJPosition() - 1);
	}

	public void testAccrochage(Joueur j1) {

		if (this.getJPosition() == j1.getJPosition()) {
			DeNoir d = new DeNoir();

			int res1 = d.genererResultat();
			if (res1 == 1)
				j1.getV().setPtsCarosserie(j1.getV().getPtsCarosserie() - 1);

			int res2 = d.genererResultat();
			if (res2 == 1)
				this.getV().setPtsCarosserie(this.getV().getPtsCarosserie() - 1);

		}

	}

	public int superDepart() {
		DeNoir d = new DeNoir();
		int x = d.genererResultat();
		return x;

	}

	public void retrograder() {

	}

}