import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Autoveicoli");
        AutoVeicoli at1 = new Tradizionali("2", "marca2", "modello2", 2018, 5, 1,"Benzina");
        AutoVeicoli ae1 = new Elettrici("3", "marca3", "modello3", 2017, 5, 1);
        AutoVeicoli ag1 = new Gpl("4", "marca4", "modello4", 2016, 5, 1);
        Gas agp = new Idrogeno("2", "marca2", "modello2", 1998, 5, 1);
        MotoVeicoli m1 = new MotoVeicoli("targa", "arca", "modello",2003,4, 1, "carburante"); 

        //Test
        System.out.println("Tradizionali: " + at1.toString());
        System.out.println("Elettrici: " + ae1.toString());
        System.out.println("Gas: " + ag1.toString()); 
        System.out.println("GPL: " + agp.toString());
        System.out.println("\n"+"calcolo della tassa: ");
        System.out.println("Tassa veicolo tradizionale: "+ at1.calcoloTassa());
        System.out.println("\n"+"calcolo della tassa: ");
        System.out.println("Tassa veicolo Idrogeno: "+agp.calcoloTassa());
        System.out.println("Moto: " + m1.toString());
        System.out.println("\n"+"calcolo della tassa: ");
        System.out.println("Tassa veicolo moto: "+ m1.calcoloTassa());
    }
}
