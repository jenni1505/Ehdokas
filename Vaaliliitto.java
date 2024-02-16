import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Vaaliliitto {
    private String nimi;
    private List<Ehdokas> ehdokkaat;

    public Vaaliliitto(String nimi) {
        this.nimi = nimi;
        this.ehdokkaat = new ArrayList<>();
    }

    // Lisätään ehdokas vaaliliittoon eli puolueeseensa
    public void lisaaEhdokas(Ehdokas ehdokas) {
        ehdokkaat.add(ehdokas);
    }

    // Laskee ja palauttaa vaaliliiton ehdokkaiden äänien yhteismäärän
    public double aanienYhteismaara() {
        return ehdokkaat.stream().mapToDouble(Ehdokas::getAanimaara).sum();
    }

    public void laskeVertailuluvutDHondt() {
        double aanienYhteismaara = aanienYhteismaara(); // Laskee vaaliliiton äänien yhteismäärän
    
        // Ehdokkaat järjestetään äänimäärän mukaan laskevasti ensin.
        Collections.sort(ehdokkaat, Comparator.comparing(Ehdokas::getAanimaara).reversed());
    
        // Lasketaan vertailuluvut käyttäen vaaliliiton äänien yhteismäärää
        for (int i = 0; i < ehdokkaat.size(); i++) {
            double vertailuluku = aanienYhteismaara / (i + 1);
            ehdokkaat.get(i).setVertailuluku(vertailuluku);
        }
    }
    
    public List<Ehdokas> getEhdokkaat() {
        return ehdokkaat;
    }

    public String getNimi() {
        return nimi;
    }
}
