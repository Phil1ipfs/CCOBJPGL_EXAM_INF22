

public class Ako implements Terorista{
        static int MyBudget = 1000;
        public int  Fare(){
            return Fare();
        }
        @Override
        public void visit(Boracay boracay) {
            if (MyBudget <= 0){
                System.out.println("Your money is not Enough to travel in this province" );
                
    
                }else {
                    
                    System.out.print("\nYou Can now Visit The Boracay");
                    MyBudget -= boracay.Fare();
                    System.out.println("");
                }
                System.out.println("\nI am now Enjoying Boracay");
                MyBudget();
        }
        public void visit(){
            if (MyBudget - 0 < 0){
                System.out.println("Your money is not Enough to travel in this province" );
                
    
            }else {
                System.out.print("\nEnjoying my stay Par!");
                MyBudget -= 0;
                    
            }
            MyBudget();
        }
        @Override
        public void visit(Ifugao ifugao){
    
            if (MyBudget - ifugao.Fare()< 0){
            System.out.println("Your money is not Enough to travel in Any province" );
            

            }else {
                System.out.print("\nYou Can now Visit the province of ifugao");
                System.out.println("");
                MyBudget -= ifugao.Fare();
            }
            System.out.println("\nI am now Enjoying ifugao");
            MyBudget();
        }
        @Override
        public void visit(Bataan bataan) {
            if (MyBudget - bataan.Fare() < 0){
                System.out.println("Your money is not Enough to travel in this province" );
                
    
            }else {    
                System.out.print("\nYou Can now Visit The Province of Bataan");
                MyBudget -= bataan.Fare();
                System.out.println("");
                }
                System.out.println("\nI am now Enjoying Bataan");
                MyBudget();
            }
        @Override
        public void visit(Bicol bicol) {
            if (MyBudget - bicol.Fare() < 0){
                System.out.println("Your money is not Enough to travel in this province" );
                
    
                }else {
                    
                    System.out.println("\nYou Can now Visit The Bicol Province");
                    MyBudget -= bicol.Fare();
                }
                System.out.println("\nI am now Enjoying Bicol");
                MyBudget();
            }
        @Override
        public void visit(SierraMadre sierraMadre) {
            if (MyBudget <= 0){
                System.out.println("Your money is not Enough to travel in this province" );
                
    
                }else {
                    
                    System.out.print("\nYou Can now Visit The Sierra Madre Province ");
                    MyBudget -= sierraMadre.Fare();
                    
                }
                System.out.println("The Fare is 90 Pesos\n");
                System.out.println("I am now Enjoying Sierra Madre");
                MyBudget();
            }
        public void MyBudget() {
            System.out.println("My Budget Now is : " + MyBudget);
        }
            
}
