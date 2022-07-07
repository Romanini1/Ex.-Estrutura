public class Fila{
  int ponteiro_final=-1;
  int inicio=0;

  Contato lista[] = new Contato[10];

  public void insereFila(Contato ci){
    if(ponteiro_final<(lista.length-1)){ 
      lista[ponteiro_final+1] = ci; 
      ponteiro_final++;
    }
    else{
      System.out.println("Fila cheia");
    }
  }

  public void removeFila(){
    if(ponteiro_final!=-1){ 
      
      for(int i=0;i<ponteiro_final;i++){
        lista[i] = lista[i+1]; 
      }
      ponteiro_final--;
    }
    else{
      System.out.println("Fila vazia");
    }
  }

  public void imprimeFila(){
    System.out.println("FILA: ");
    for(int i=0;i<ponteiro_final+1;i++){
      System.out.println(lista[i]);
    }
    System.out.println();
  }
}
