abstract public class Gas extends AutoVeicoli{
    //Attributi

    //Costruttori
    public Gas(){

    }
    public Gas(String targa, String marca, String modello, int anno, int passeggeri,double potenza,double tassa,String carburante){
        super(targa, marca, modello, anno, passeggeri, potenza, 0.0,carburante);
    }

    // Equals
    public boolean equals(Gas e) {
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
