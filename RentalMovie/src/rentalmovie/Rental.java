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
public class Rental {
    
    int costumerId;
    int days;
    Movie movie;
    
    public Rental()
    {
        costumerId = 0;
        days = 0;
        //movie = new Movie();
    }
    public Rental(int costumerId, int days, Movie movie)
    {
        this.costumerId = costumerId;
        this.days = days;
        if(movie instanceof Action)
        {
            this.movie = new Action(movie);
        }
        if(movie instanceof Comedy)
        {
            this.movie = new Comedy(movie);
        }
        if(movie instanceof Drama)
        {
            this.movie = new Drama(movie);
        }
  
    }
    public void setDay(int day)
    {
        this.days = day;
    }
    public void setCostumerId(int id)
    {
        this.costumerId = id;
    }
    public void setMovie(Movie movie)
    {
       if(movie instanceof Action)
        {
            this.movie = new Action(movie);
        }
        if(movie instanceof Comedy)
        {
            this.movie = new Comedy(movie);
        }
        if(movie instanceof Drama)
        {
            this.movie = new Drama(movie);
        }
    }
    public int getId()
    {
        return this.costumerId;
    }
    public int getDay()
    {
        return this.days;
    }
    public Movie getMovie()
    {
        if(this.movie instanceof Action)
        {
            return new Action(this.movie);
        }
        else if(this.movie instanceof Comedy)
        {
            return new Comedy(this.movie);
        }
        else
        {
            return new Drama(this.movie);
        }
        
    }
    public double calcLateFees()
    {
        return movie.calcLateFees(days);
    }
    
    
}

