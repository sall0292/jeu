public class Voiture {

	private int vitesseCourante;
	private int ptsCarosserie;
	private int ptsFreins;
	private int ptsMoteur;
	private int ptsCons;
	private int ptsPneus;
	private boolean eliminatoire;

	// Acesseurs
	public int getVitesseCourante() {
		return vitesseCourante;
	}

	public void setVitesseCourante(int vitesseCourante) {
		this.vitesseCourante = vitesseCourante;
	}

	public int getPtsCarosserie() {
		return ptsCarosserie;
	}

	public void setPtsCarosserie(int ptsCarosserie) {
		this.ptsCarosserie = ptsCarosserie;
	}

	public int getPtsCons() {
		return ptsCons;
	}

	public void setPtsCons(int ptsCons) {
		this.ptsCons = ptsCons;
	}

	public int getPtsFreins() {
		return ptsFreins;
	}

	public void setPtsFreins(int ptsFreins) {
		this.ptsFreins = ptsFreins;
	}

	public int getPtsMoteur() {
		return ptsMoteur;
	}

	public void setPtsMoteur(int ptsMoteur) {
		this.ptsMoteur = ptsMoteur;
	}

	public int getPtsPneus() {
		return ptsPneus;
	}

	public void setPtsPneus(int ptsPneus) {
		this.ptsPneus = ptsPneus;
	}

	public boolean isEliminatoire() {
		return eliminatoire;
	}

	public void setEliminatoire(boolean eliminatoire) {
		this.eliminatoire = eliminatoire;
	}

	// constructeur

	public Voiture() {
		vitesseCourante = 1;
		ptsCarosserie = 2;
		ptsCons = 2;
		ptsMoteur = 2;
		ptsFreins = 3;
		ptsPneus = 4;
		eliminatoire = false;
	}

	public void accelerer() {
		this.setVitesseCourante(vitesseCourante + 1);
	}

	public void freiner() {

		this.setPtsFreins(this.ptsFreins - 1);
	}

	public void penaliteSurregime(Joueur j, int vitesse) {
		int diff = j.getV().vitesseCourante - vitesse;
		if (diff >= 0) {
			switch (diff) {
			case 0:
				break;
			case 1:
				if (ptsCons != 0)
					this.setPtsCons(getPtsCons() - 1);
				break;
			case 2:
				if (ptsCons != 0)
					this.setPtsCons(getPtsCons() - 1);
				if (ptsFreins != 0)
					this.setPtsFreins(getPtsFreins() - 1);
				break;
			case 3:
				if (ptsCons != 0)
					this.setPtsCons(getPtsCons() - 1);
				if (ptsFreins != 0)
					this.setPtsFreins(getPtsFreins() - 1);
				if (ptsMoteur != 0)
					this.setPtsMoteur(getPtsMoteur() - 1);
				break;
			default:
				this.eliminatoire = true;
			}

		}
	}
}
