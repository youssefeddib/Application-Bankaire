public class Compte {

    private int nmcompte;
    private int solde;
    private String client;

public Compte(int nmcompte, int solde, String client){
    this.nmcompte = nmcompte;
    this.solde = solde;
    this.client = client;
}

    public int getNmcompte() {
        return nmcompte;
    }

    public void setNmcompte(int nmcompte) {
        this.nmcompte = nmcompte;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
