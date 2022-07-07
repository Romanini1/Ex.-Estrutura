class Main {
  public static void main(String[] args) {
    Fila lf = new Fila();
    Pilha lp = new Pilha();
    Contato c1 = new Contato("Diow", "4002");
    Contato c2 = new Contato("Paulo", "8922");
    Contato c3 = new Contato("Gustavo", "4001");
    Contato c4 = new Contato("Veiga", "8921");
    Contato c5 = new Contato("Jose", "5555");
    Contato c6 = new Contato("Joao", "4444");
    lf.removeFila();
    lf.insereFila(c4);
    lf.insereFila(c2);
    lf.insereFila(c3);
    lf.insereFila(c1);
    lf.imprimeFila();
    lf.removeFila();
    lf.imprimeFila();



    lp.inserePilha(c4);
    lp.inserePilha(c2);
    lp.inserePilha(c3);
    lp.inserePilha(c1);
    lp.imprimePilha();
    lp.removePilha();
    lp.imprimePilha();
    
  }
}
