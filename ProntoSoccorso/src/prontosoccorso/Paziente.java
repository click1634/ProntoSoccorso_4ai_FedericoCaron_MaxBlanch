package prontosoccorso;


public class Paziente {
    private String nome;
    private String colore;
    
    public Paziente(){}
    public Paziente(String nome, String colore){
        this.nome=nome;
        this.colore=colore;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(){
        this.nome=nome;
    }
    public String getColore(){
        return colore;
    }
    public void setColore(){
        this.colore=colore;
    }
    
    public String toString(){
        return nome+", "+colore+"\n";
    }
}
