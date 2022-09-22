package br.edu.ifpi.dominio;

public class Certificado{

    private String nomeA;
    private String nomeC;
    private String level;
    private int ch;
    private Professor professor;



    public Certificado(String nomeA, String nomeC, String level, int ch, Professor p1) {
        this.nomeA = nomeA;
        this.nomeC = nomeC;
        this.level = level;
        this.ch = ch;
        this.professor = p1;
    }



    public String getNomeA() {
        return nomeA;
    }



    public void setNomeA(String nomeA) {
        this.nomeA = nomeA;
    }



    public String getNomeC() {
        return nomeC;
    }



    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }



    public String getLevel() {
        return level;
    }



    public void setLevel(String level) {
        this.level = level;
    }



    public int getCh() {
        return ch;
    }



    public void setCh(int ch) {
        this.ch = ch;
    }



    public Professor getProfessor() {
        return professor;
    }



    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    

    
    
    
}