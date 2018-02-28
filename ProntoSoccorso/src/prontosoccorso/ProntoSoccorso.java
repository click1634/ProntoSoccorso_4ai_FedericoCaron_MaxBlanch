package prontosoccorso;
import java.util.*;

public class ProntoSoccorso {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Lista lista_pazienti=new Lista();
        int scelta=0;
        do{
            System.out.println("Cosa vuole fare:\n"
            + "1- aggiunta di un paziente alla lista di attesa;\n"
            + "2- recupero del paziente con il massimo grado di urgenza;\n"
            + "3- visualizza il numero di pazienti per colore;\n"
            + "4- visualizza tutti i pazienti in attesa;\n"
            + "5- eliminazione di un paziente specifico;\n"
            + "6- Esci dal programma.");
            scelta=input.nextInt();
            switch(scelta){
                case 1:
                    Paziente x;
                    System.out.println("Inserire il nome del paziente");
                    String nome=input.next();
                    System.out.println("Inserire il grado di urgenza (Rosso, Giallo, Bianco)");
                    String colore=input.next();
                    switch(colore){
                        case "Rosso":
                            x=new Paziente(nome,colore);
                            lista_pazienti.InserisciRosso(x);
                            break;
                        case "rosso":
                            x=new Paziente(nome,colore);
                            lista_pazienti.InserisciRosso(x);
                            break;
                        case "Giallo":
                            x=new Paziente(nome,colore);
                            lista_pazienti.InserisciGiallo(x);
                            break;
                        case "giallo":
                            x=new Paziente(nome,colore);
                            lista_pazienti.InserisciGiallo(x);
                            break;
                        case "Bianco":
                            x=new Paziente(nome,colore);
                            lista_pazienti.InserisciInCoda(x);
                            break;
                        case "bianco":
                            x=new Paziente(nome,colore);
                            lista_pazienti.InserisciInCoda(x);
                            break;
                        default:
                            System.out.println("Input non corretto.");
                            break;
                    }
                    break;

                case 2:
                    System.out.println(lista_pazienti.EliminaRosso());
                    break;

                case 3:
                    lista_pazienti.ContaPazienti();
                    break;
                    
                case 4:
                    lista_pazienti.Visualizza();
                    break;

                case 5:
                    System.out.println("Inserire nome paziente");
                    String n=input.next();
                    lista_pazienti.EliminaPaziente(n);
                    break;
                    
                case 6:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Operazione non riconosciuta");
                    break;
            }
        }while(scelta!=6);
    }
    
}
