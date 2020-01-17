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
public abstract class MiniSeries extends TVShow {
    public int episodios;

    public MiniSeries(String nome, double rating, int year,String director, int duracao,int episodios) {
        super(nome, rating, year, duracao,director);
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

   @Override
    public String toString() {
        return "Nome: "+nome +", Pontuacao: "+rating+", Ano: "+year+", Duracao: "+duracao+"Episodios: "+episodios; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
