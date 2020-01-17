/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequenciab;

import java.util.ArrayList;

/**
 *
 * @author Turma A
 */
public class ShowsList {
    private ArrayList<TVShow> serie;
    private ArrayList<Documentary> Documentary;
    private ArrayList<MiniSeries> MiniSeries;
    
     public ShowsList() {
        serie = new ArrayList<TVShow>();
        Documentary = new ArrayList<Documentary>();
        MiniSeries = new ArrayList<MiniSeries>();

    }
        public ShowsList(String nome, double rating, int year, int duracao, String categoria, int temporadas,int episodios) {
        serie = new ArrayList<TVShow>();
        Documentary = new ArrayList<Documentary>();
        MiniSeries = new ArrayList<MiniSeries>();
        
        TVShow.add(new TVShow() {});
        Documentary.add(new Documentary() {});
        MiniSeries.add(new MiniSeries() {});

        public ArrayList<TVShow> getSerie() {
        
        return serie;
    }
         public ArrayList<Documentary> getDocumentary() {
        
        return Documentary;
    }
          public ArrayList<MiniSeries> getMiniSeries() {
        
        return MiniSeries;
    }

   

    public void setSerie(ArrayList<TVShow> serie) {
        this.serie = serie;
    }
     public void setDocumentary(ArrayList<Documentary> Documentary) {
        this.Documentary = Documentary;
    }
      public void setMiniSeries(ArrayList<MiniSeries> MiniSeries) {
        this.MiniSeries = MiniSeries;
    }

    public ShowsList(ArrayList<TVShow> serie, ArrayList<Documentary> Documentary, ArrayList<MiniSeries> MiniSeries ) {
      this.serie = serie;
      this.Documentary = Documentary;
      this.MiniSeries = MiniSeries;
    } 
    @Override
    public String toString() {
        return "Serie->"+getSerie()+"\nDocumentario->"+getDocumentary()+"\nMini Serie->"+getMiniSeries();
    }

    }
   
