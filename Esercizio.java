import java.util.Scanner;

public static int leggicomando(){
    String c;
    do {
        System.out.println("[I] Inserisci elemento | [E] Elimina elemento | [R] RicercaNelVettore | [D] Elimina duplicati | [V] Visualizza vettore | [X] Esci");

    } while(c!="I" && c!="E" && c!="R" && c!="D" && c!="V" && c!="X");
    return c;
}

 public static ricercaElemento (int [] V =new int [] , int N,int Elementodacercare) {
    int i;
    i = 0;
    while(i<N && V[i]!= e){
        if (i = N){
            i-1;
        }
        i++;
    }
}


 public static int InserisciElemento(int [] V,int N,int e,int ipos) {
    int i;
    i = 0;
    for (i=N ,i > 0, --i){
        V[i]=V[i-1];
        }
        V [ipos]=e;
    }
}



class Esercizio {

    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        int i, N, e;
        String c;
        System.out.println("Inserisci dimensione del vettore");
        N = in.nextLine();
        int [] V =new int [N*10];
        azzeraVettore(V,N);
        do {
            c=leggicomando();

            if (c = "I"){
                System.out.println("Inserisci elemento");
                e = in.nextLine();
                do {
                    System.out.println("Inserisci posizione");
                    i = in.nextline();
                }while(i<0 or i>=N);ù
                N=InserisciElemento(V,n,e,i);
            }

            if (c = "E"){
                do {
                    System.out.println("Inserire cella del vettore che desideri eliminare");
                    i = in.nextLine();
                }while(i<0 or i>=N);
                N=EliminaElemento(V,N,i)
            }

            if (c = "R"){
                System.out.println("Inserisci elemento da cercare");
                e=in.nextline();
                i=ricercaNelVettore(V,N,e);
                if (i >=0){
                    System.out.println("L'elemento " +e+ "si trova nella posizione " +i);
                }
                else {
                    System.out.println("L'elemento " +e+ "non è stato trovato ");
                }

            }

            if (c = "D"){
               System.out.println("Rimozione dei duplicati");
               N=EliminaDuplicati(V,N);
            }

            if (c = "V"){
                VisualizzaVettore(V,N);
            }

        } while (c!= "X");
 
    }
}
