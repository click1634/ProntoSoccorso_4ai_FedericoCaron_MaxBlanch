package prontosoccorso;

public class Nodo {
    private Paziente paziente;
    private Nodo next;
    public Nodo(){}
    public Nodo(Paziente valore){
        this.paziente=paziente;
        this.next=null;
    }
    public Paziente getPaziente(){
        return  paziente;
    }
    public void setPaziente(Paziente paziente){
        this.paziente=paziente;
    }
    public Nodo getNext(){
        return next;
    }
    public void setNext(Nodo next){
        this.next=next;
    }
}
