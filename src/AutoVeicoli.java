abstract public class AutoVeicoli extends Veicoli {
    // Attributi
    private String carburante;

    // Costruttori
    public AutoVeicoli() {

    }

    public AutoVeicoli(String targa, String marca, String modello, int anno, int passeggeri, double potenza, double tassa,
            String carburante) {
        super(targa, marca, modello, anno, passeggeri, potenza,tassa);
        setCarburante(carburante);
    }

    // Setter && Getter
    public void setCarburante(String carburante) {
        this.carburante = carburante;
    }

    public String getCarburante() {
        return carburante;
    }

    // Calcolo Tassa
    public double calcoloTassa() {
        return 0;
    }

    // Equals
    // Equals
    public boolean equals(AutoVeicoli v) {
        return (getTarga().equals(v.getTarga()) && getMarca().equals(v.getMarca())
                && getModello().equals(v.getModello()) && getAnno() == v.getAnno()
                && getPasseggeri() == v.getPasseggeri() && getPotenza() == v.getPotenza()) && getTassa()==v.getTassa() && getCarburante().equals(v.getCarburante());
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
