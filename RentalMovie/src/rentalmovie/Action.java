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
public class Action extends Movie {
    
    private double lateFee;
    public Action()
    {
        super();
        lateFee = 3.00;
    }
    public Action(Movie movie)
    {
        super(movie);
        lateFee = 3.00;
    }
    public Action(int id, String rating, String title)
    {
        super(id,rating,title);
        lateFee = 3.00;
    }
    @Override
    public double calcLateFees(int day)
    {
        return day*lateFee;
    }
    public void thisnuts(){}
}
