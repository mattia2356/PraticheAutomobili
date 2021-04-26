abstract public class Veicoli {

    // attributi
    private String targa;
    private String marca;
    private String modello;
    private int anno;
    private int passeggeri;
    private double potenza;
    private double tassa;

    // Costruttori
    public Veicoli() {

    }

    public Veicoli(String targa, String marca, String modello, int anno, int passeggeri, double potenza, double tassa) {
        setTarga(targa);
        setMarca(marca);
        setModello(modello);
        setAnno(anno);
        setPasseggeri(passeggeri);
        setPotenza(potenza);
        setTassa(tassa);
    }

    public Veicoli(Veicoli v) {
        setTarga(v.getTarga());
        setMarca(v.getMarca());
        setModello(v.getModello());
        setAnno(v.getAnno());
        setPasseggeri(v.getPasseggeri());
        setPotenza(v.getPotenza());
        setTassa(tassa);
    }

    // Setter && Getter
    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setPasseggeri(int passeggeri) {
        this.passeggeri = passeggeri;
    }

    public void setPotenza(double potenza) {
        this.potenza = potenza;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getAnno() {
        return anno;
    }

    public int getPasseggeri() {
        return passeggeri;
    }

    public double getPotenza() {
        return potenza;
    }
    public  void setTassa(double tassa) {
        this.tassa = tassa;
    }
    public  double getTassa() {
        return tassa;
    }

    // Calcolo Tassa
    private double calcoloTassa(double potenza) {
        double risultato;
        risultato = getPotenza();
        return risultato;
    }

    // Equals
    public boolean equals(Veicoli v) {
        return (getTarga().equals(v.getTarga()) && getMarca().equals(v.getMarca())
                && getModello().equals(v.getModello()) && getAnno() == v.getAnno()
                && getPasseggeri() == v.getPasseggeri() && getPotenza() == v.getPotenza());
    }

    // toString
    public String toString() {
        String s = "";
        s += "Targa: " + getTarga() + " | Marca: " + getMarca() + " | Modello: " + getModello() + " | Anno: "
                + getAnno() + " | Passeggeri: " + getPasseggeri() + " | Potenza: " + getPotenza();
        return s;
    }
}
