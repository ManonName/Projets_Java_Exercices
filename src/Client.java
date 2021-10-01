import java.util.ArrayList;

public class Client {
	private String nom;
	private String prenom;
	private ArrayList<Compte> comptes;
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		comptes = new ArrayList<>();
	}
	public void addCompte(Compte compte) {
		comptes.add(compte);
	}
	public void afficher() {
		System.out.println("Client : nom : " + nom + " | prénom : " + prenom);
		double soldeGlobal = 0;
		for(int i = 0; i < comptes.size(); i++) {
			comptes.get(i).afficher();
			soldeGlobal += comptes.get(i).getSolde();
		}
		System.out.println("Solde global : " + soldeGlobal);
	}

}
