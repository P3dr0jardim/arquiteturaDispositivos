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
public class Director {
    public String nome;
    public String nacionalidade;
    public String data_nasc;

    public Director() {
    }

    public Director(String nome, String nacionalidade, String data_nasc) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.data_nasc = data_nasc;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Nome: "+nome +", Nacionalidade: "+nacionalidade+", Data de nascimento: "+data_nasc; //To change body of generated methods, choose Tools | Templates.
    }
    
}
