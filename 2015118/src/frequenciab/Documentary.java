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
public abstract class Documentary extends TVShow {
    public String categoria;
    public int temporadas;


    public Documentary(String nome, double rating, int year, int duracao,String director, String categoria, int temporadas ) {
        super(nome, rating, year, duracao,director);
        this.categoria = categoria;
        this.temporadas = temporadas;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    @Override
    public String toString() {
        return "Nome: "+nome +", Pontuacao: "+rating+", Ano: "+year+", Duracao: "+duracao+"Categoria: "+categoria +", Numero de Temporadas: "+temporadas; //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
