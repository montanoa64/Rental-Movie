/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmovie;

/**
 *
 * @author ecko0_000
 */
public class RentalMovie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numAction = 0;
        int numComedy = 0;
        int numDrama = 0;
        double totalfee = 0;
        int totallate = 0;
        Movie movie = new Action(3,"PG-13","Fast and Furious");
        Movie movie2 = new Action(4,"R","Batman");
        Movie movie3 = new Action(10,"PG-13","Avengers");
        Movie movie4 = new Comedy(6,"PG-13","White Chicks");
        Movie movie5 = new Comedy (11,"R","How High");
        Movie movie6 = new Comedy(1,"PG","Boss Baby");
        Movie movie7 = new Drama(2,"R","Fifty Shades Darker");
        Movie movie8 = new Drama (8,"R","Logan");
        Movie movie9 = new Drama(20,"PG","Hidden Figures");
        Movie movie10 = new Action(15,"PG-13","Rogue One: A Star Wars Story");
        Rental rental [] = new Rental[10];
        rental[0] = new Rental(1,0,movie);
        rental[1] = new Rental(2,2,movie2);
        rental[2] = new Rental(3,0,movie3);
        rental[3] = new Rental(4,5,movie4);
        rental[4] = new Rental(5,1,movie5);
        rental[5] = new Rental(6,0,movie6);
        rental[6] = new Rental(7,0,movie7);
        rental[7] = new Rental(8,0,movie8);
        rental[8] = new Rental(9,2,movie9);
        rental[9] = new Rental(10,0,movie10);
        
        for(Rental obj:rental)
        {
            
            if(obj.getMovie() instanceof Action)
            {
                numAction++;
            }
            if(obj.getMovie() instanceof Comedy)
            {
                numComedy++;
            }
            if(obj.getMovie() instanceof Drama)
            {
                numDrama++;
            }
            if(obj.getDay()>0)
            {
                totallate++;
                totalfee = totalfee + obj.calcLateFees();
                
            }
            
        }
        System.out.println("Number of Action Movies: " + numAction);
        System.out.println("Number of Comedy Movies: " + numComedy);
        System.out.println("Number of Drama Movies: " + numDrama);
        System.out.println("Number of Late Movies: " + totallate);
        System.out.println("Total Amount of Late Fees: " + totalfee);
        
        
        
        
    }
    
}
