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
public class Drama extends Movie {
    
    double lateFee;
    public Drama()
    {
        super();
        lateFee = 2.00;
    }
    public Drama(Movie movie)
    {
        super(movie);
        lateFee = 2.00;
    }
    public Drama(int id, String rating, String title)
    {
        super(id,rating,title);
        lateFee = 2.00;
    }
    @Override
    public double calcLateFees(int day)
    {
        return day*lateFee;
    }
    
}
