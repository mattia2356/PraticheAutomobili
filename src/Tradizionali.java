public class Tradizionali extends AutoVeicoli{
    //Attributi

    //Costruttori
    public Tradizionali(){

    }
    public Tradizionali(String targa, String marca, String modello, int anno, int passeggeri, double potenza,String carburante){
        super(targa, marca, modello, anno, passeggeri,potenza,2.50,carburante);
    }
    
    // Calcolo Tassa
    public double calcoloTassa() {
        return(getTassa()*getPotenza());
    }

    // Equals
    public boolean equals(Tradizionali e) {
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
