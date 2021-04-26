import java.time.Year;
public class Idrogeno extends Gas {
    // Attributi

    // Costruttori
    public Idrogeno() {

    }

    public Idrogeno(String targa, String marca, String modello, int anno, int passeggeri, double potenza) {
        super(targa, marca, modello, anno, passeggeri, potenza, 0.1, "Idrogeno");
    }

    // Calcolo Tassa
    public double calcoloTassa() {
        return (0.1 * ((Year.now().getValue()-1) - getAnno())); //la tassa aumenta di 0.1 per ogni anno (escluso il primo)
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
