import java.util.Scanner;

public static int leggicomando(){
    String c;
    do {
        System.out.println("[I] Inserisci elemento | [E] Elimina elemento | [R] RicercaNelVettore | [D] Elimina duplicati | [V] Visualizza vettore | [X] Esci");

    } while(c!="I" && c!="E" && c!="R" && c!="D" && c!="V" && c!="X");
    return c;
}

 public static int ricercaNelVettore (int [] V =new int [] , int valore,N){
    int i,iTrovato;
    i=0;
    iTrovato=-1;
    while (i<N and iTrovato==-1){
        if (V[i] == valore) {
            iTrovato=i;
            i=i+1;
        }
    }
    return iTrovato;
}

public static int InserisciElemento (int [] V =new int [] , int N,e,ie ){
    int i,N2;
    N2=N+1;
    i=N2-1;
    while (i>=ie+1){
        V[i]=V[i-1];
        i=i+1;
    }
    V[ie]=e;
    return N2;

}

public static int EliminaElemento (int [] V =new int [] , int N,ie ){
    int N2;
    N2=N-1;
    i=ie;
    while (i<=N-2){
        V[i]=V[i+1];
        i=i+1;
    }
    return N2;



    public static void  visualizzaVettore (int [] V =new int []){
        int i;
        i=0;
        while ("i<N"){
            System.out.println("V[i]");
            i=i+1;
        }
 
    }

    public static void azzeraVettore (int [] V =new int [] , int valore){
        int i;
        i=0;
        while ("i<N-1"){
            V[i]=0;
            i=i+1;
        }

     public static int rimuoviDuplicati(int[] v, int n) {
        boolean duplicato;
        int i, j, k;

        k = 0;
        int[] w = new int[n];

        i = 0;
        while (i <= n - 1) {
            duplicato = false;
            j = i + 1;
            while (j <= n - 1 && duplicato == false) {
                if (v[i] == v[j]) {
                    duplicato = true;
                }
                j = j + 1;
            }
            if (duplicato == false) {
                w[k] = v[i];
                k = k + 1;
            } else {

            }
            i = i + 1;
        }

        i = 0;
        while (i < k) {
            v[i] = w[i];
            i = i + 1;
        }
        
        return k;
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



