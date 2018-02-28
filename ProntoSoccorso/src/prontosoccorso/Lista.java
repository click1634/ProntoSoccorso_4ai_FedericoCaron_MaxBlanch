package prontosoccorso;

public class Lista {
    static Nodo head;
    public Lista(){head=null;}
    
    public Nodo getHead(){
        return head;
    }
    
    public void InserisciInCoda(Paziente n){
        Nodo nodo1=new Nodo(n);
        if(head==null){head=nodo1;}
        else{
            Nodo nodo=head;
            while(nodo.getNext()!=null){nodo=nodo.getNext();}
            nodo.setNext(nodo1);
        }
    }
    
    public void InserisciInTesta(Paziente n){
        Nodo nodo=new Nodo(n);
        if(head==null){head=nodo;}
        else{
            nodo.setNext(head);
            head=nodo;
        }
    }
    
    public void Visualizza(){
        Nodo nodo=head;
        if(nodo==null){System.out.println("Lista vuota");}
        else{
            while(nodo!=null){
                System.out.println(nodo.getPaziente());
                nodo=nodo.getNext();
            }
        }
    }
    
    public void EliminaPaziente(String c){
        Nodo nodo=head;
        if(nodo==null){System.out.println("Nessun elemento da eliminare.");}
        else{
            while((!nodo.getNext().getPaziente().getNome().equals(c)) || nodo!=null){
                nodo=nodo.getNext();
            }
            if(nodo==null){System.out.println("Elemento non trovato");}
            else{
                Nodo nodo1=nodo.getNext();
                nodo.setNext(nodo.getNext().getNext());
                nodo1=null;
            }
        }
        System.gc();
    }
    
    public String EliminaRosso(){
        Nodo nodo=head;
        String incura=nodo.getPaziente().toString();
        head.setNext(nodo.getNext());
        nodo=null;
        System.gc();
        return incura;
    }
    
    public void InserisciGiallo(Paziente n){
        Nodo nodo_aux=new Nodo(n);
        String b="Bianco";
        String bb="bianco";
        if(head==null){head=nodo_aux;}
        else{
            Nodo nodo=head;
            while(nodo!=null && nodo.getNext()!=null && nodo.getNext().getPaziente().getColore()!=b && nodo.getNext().getPaziente().getColore()!=bb){
                nodo=nodo.getNext();
            }
            nodo_aux.setNext(nodo.getNext());
            nodo.setNext(nodo_aux);
        }
    }
    
    public void InserisciRosso(Paziente n){
        Nodo nodo_aux=new Nodo(n);
        String r="Rosso";
        String rr="rosso";
        if(head==null){InserisciInTesta(n);}
        else{
            Nodo nodo=head;
            while(nodo!=null && nodo.getNext()!=null && nodo.getNext().getPaziente().getColore()==r && nodo.getNext().getPaziente().getColore()==rr){
                nodo=nodo.getNext();
            }
            nodo_aux.setNext(nodo.getNext());
            nodo.setNext(nodo_aux);
       }
    }
    
    public void ContaPazienti(){
        System.out.println("Numero pazienti Rossi: "+ContaPazientiRossi());
        System.out.println("Numero pazienti Gialli: "+ContaPazientiGialli());
        System.out.println("Numero pazienti Bianchi: "+ContaPazientiBianchi());
    }
    
    private int ContaPazientiRossi(){
        if(head==null){return 0;}
        else{
            int c=0;
            Nodo nodo=new Nodo();
            nodo=head;
            while(nodo!=null){
                nodo=nodo.getNext();
                c++;
            }
            return c;
        }
    }
    
    private int ContaPazientiGialli(){
        if(head==null){return 0;}
        else{
            int c=0;
            Nodo nodo=new Nodo();
            nodo=head;
            while(nodo!=null){
                nodo=nodo.getNext();
                c++;
            }
            return c;
        }
    }
    
    private int ContaPazientiBianchi(){
        if(head==null){return 0;}
        else{
            int c=0;
            Nodo nodo=new Nodo();
            nodo=head;
            while(nodo!=null){
                nodo=nodo.getNext();
                c++;
            }
            return c;
        }
    }
}
