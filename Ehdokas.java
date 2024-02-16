//Tee luokka Ehdokas ja 
//lisää siihen jäsenmuuttujiksi sukunimi, etunimi, äänimäärä ja vertailuluku. 
//Tee konstruktori valmiiksi. 
//Lisää metodi toString, 
//joka palauttaa yhtenä merkkijonona kaikki olion tiedot. 
//Vertailuluku on aluksi nolla. 

class Ehdokas {
    private String sukunimi;
    private String nimi;
    private String puolue;
    private Double aanimaara;
    private double vertailuluku;

    // konstruktori
    public Ehdokas(String sukunimi, String nimi, String puolue, Double aanimaara) {
        this.nimi = nimi;
        this.sukunimi = sukunimi;
        this.puolue = puolue;
        this.aanimaara = aanimaara;

    }

    // Getterit
    public String getNimi() {
        return nimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public String getPuolue() {
        return puolue;
    }

    public Double getAanimaara() {
        return aanimaara;
    }

    public double getVertailuluku() {
        return vertailuluku;
    }

    public void laskeJaAsetaVertailuluku(int jakaja) {
        this.vertailuluku = aanimaara / (double) jakaja;
    }

    public void setVertailuluku(Double vertailuluku) {
        this.vertailuluku = vertailuluku;
    }

    @Override
    public String toString() {
        return nimi + " " + sukunimi + ", " + puolue + ", " + aanimaara + ", ";
    }
}
