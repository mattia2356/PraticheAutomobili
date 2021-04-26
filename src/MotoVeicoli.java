 public class MotoVeicoli extends Veicoli{
    //Attributi
    String carburante;

    //Costruttore
    public MotoVeicoli(){

    }
    public MotoVeicoli(String targa, String marca, String modello, int anno, int passeggeri, double potenza,String carburante){
        super(targa, marca, modello, anno, passeggeri, potenza,1.5);
        setCarburante(carburante);
    }

    //Setter && Getter
    public void setCarburante(String carburante) {
        this.carburante = carburante;
    }
    public String getCarburante() {
        return "carburante";
    }
    // Calcolo Tassa
    public double calcoloTassa() {
        return(getTassa()*getPotenza());
    }

    // Equals
    public boolean equals(MotoVeicoli v) {
        return (getTarga().equals(v.getTarga()) && getMarca().equals(v.getMarca())
                && getModello().equals(v.getModello()) && getAnno() == v.getAnno()
                && getPasseggeri() == v.getPasseggeri() && getPotenza() == v.getPotenza()) && getTassa()==v.getTassa() && getCarburante().equals(v.getCarburante());
    }

    // toString
    public String toString() {
        String s = "";
        s += "Targa: " + getTarga() + " | Marca: " + getMarca() + " | Modello: " + getModello() + " | Anno: "
                + getAnno() + " | Passeggeri: " + getPasseggeri() + " | Potenza: " + getPotenza() + " | Tassa:" + getTassa()
                + " | Carburante: " + getCarburante();
        return s;
    }
}
