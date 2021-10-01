
public class Compte {
	private int numero;
	private double solde;
	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	public void crediter (double montant) {
		solde += montant;
	}
	public void debter (double montant) {
		solde -= montant;
	}
	public void afficher() {
		System.out.println("Compte numéro : " + numero + "  solde : " + solde);
	}
	public double getSolde() {
		return solde;
	}
}
