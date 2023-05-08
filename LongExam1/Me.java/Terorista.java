public interface Terorista {
    void visit();
    void visit (Ifugao ifugao);
    void visit (Bataan bataan);
    void visit (Bicol bicol);
    void visit (SierraMadre sierraMadre);
    void visit (Boracay boracay);
    
    default void visit(location location){
        System.out.println("Asa Location Kana Par!");
    };
    void MyBudget();
}