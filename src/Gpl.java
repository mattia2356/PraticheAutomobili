import java.time.Year;
public class Gpl extends Gas {
    // Attributi

    // Costruttori
    public Gpl() {

    }

    public Gpl(String targa, String marca, String modello, int anno, int passeggeri, double potenza) {
        super(targa, marca, modello, anno, passeggeri, potenza, 0.75, "Gpl");
    }

    // Calcolo Tassa
    public double calcoloTassa() {
        double risultato;
        if(Year.now().getValue()-getAnno()<=5){
            risultato=0;
        }
        else{
            risultato = getTassa() * getPotenza();
        }
        return risultato;
    }

    // Equals
    public boolean equals(Gpl e) {
        return (getTarga().equals(e.getTarga()) && getMarca().equals(e.getMarca())
                && getModello().equals(e.getModello()) && getAnno() == e.getAnno()
                && getPasseggeri() == e.getPasseggeri() && getPotenza() == e.getPotenza());
    }

    // toString
    public String toString() {
        String s = "";
        s += "Targa: " + getTarga() + " | Marca: " + getMarca() + " | Modello: " + getModello() + " | Anno: "
                + getAnno() + " | Passeggeri: " + getPasseggeri() + " | Potenza: " + getPotenza()
                + " | Carburante: " + getCarburante();
        return s;
    }

}
