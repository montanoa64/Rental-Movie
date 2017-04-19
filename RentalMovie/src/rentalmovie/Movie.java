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
public class Movie {
    
    private int id;
    private String mpaaRating;
    private String title;
    
    public Movie()
    {
        id = 0;
        mpaaRating = "";
        title = "";
    }

    /**
     *
     * @param movie
     */
    public Movie(Movie movie)
    {
        this.id = movie.getId();
        this.mpaaRating = movie.getRating();
        this.title = movie.getTitle();
    }
    public Movie(int id, String mpaa, String title)
    {
        this.setId(id);
        this.setRating(mpaa);
        this.setTitle(title);
    }
    public void setId(int id)
    {
        if(id > 0)
        {
            this.id = id;
        }
        else
        {
            this.id = 0;
            System.out.println("Id must be greater than 0");
        }
        
    }
    public void setRating(String rating)
    {
        if(rating.equals("G") || rating.equals("PG") || rating.equals("PG-13")
                || rating.equals("R") || rating.equals("NC-17"))
            this.mpaaRating = rating;
        else
        {
            System.out.println("Not a valid rating");
            this.mpaaRating ="";
        }
            
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public int getId()
    {
        return id;
    }
    public String getRating()
    {
        return mpaaRating;
    }
    public String getTitle()
    {
        return title;
    }
    public boolean equals(Movie movie)
    {
        return this.id == movie.getId();
    }
    public double calcLateFees(int day)
    {
        return 2*day;
    }
    
    
    
    
}
