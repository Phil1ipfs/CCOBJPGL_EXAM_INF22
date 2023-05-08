
public class App {
    public static void main(String[] args) {
        location bataaan = new Bataan(); 
        location ifugao = new Ifugao();
        location bicol = new Bicol();
        location sierraMadre = new SierraMadre();
        location boracay = new Boracay();
        

        Terorista Casingal = new Ako();

        bataaan.accept(Casingal);
        ifugao.accept(Casingal);
        bicol.accept(Casingal);
        sierraMadre.accept(Casingal);
        boracay.accept(Casingal);
        
    }
}
