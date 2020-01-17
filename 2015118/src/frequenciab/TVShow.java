/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequenciab;

/**
 *
 * @author Turma A
 */
public abstract class TVShow{
    public String nome;
    public double rating;
    public int year;
    public int duracao;
    public String director;
    
    
      public TVShow(String nome, double rating, int year, int duracao, String director ) {
        this.nome = nome;
        this.rating = rating;
        this.year = year;
        this.duracao=duracao;
        this.director=director;
    }

   

    public String getNome() {
        return nome;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getDirector() {
        
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
  @Override
    public String toString() {
        return "Nome: "+nome +", Pontuacao: "+rating+", Ano: "+year+", Duracao: "+duracao+", Director: "+director; //To change body of generated methods, choose Tools | Templates.
    }
    
}
