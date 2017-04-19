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
public class Comedy extends Movie {
    
    double lateFee;
    public Comedy()
    {
        super();
        lateFee = 2.50;
    }
    public Comedy(Movie movie)
    {
        super(movie);
        lateFee = 2.50;
    }
    public Comedy(int id, String rating, String title)
    {
        super(id,rating,title);
        lateFee = 2.50;
    }
    @Override
    public double calcLateFees(int day)
    {
        return day*lateFee;
    }
}
