
package aula5cursoemvideo;


public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;        

    
    //metodo construtor >> saldo 0 e com o estado da conta fechado
    public ContaBanco() {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0.0f;
        this.status = false;
    }

    // informa tudo que tem e como está na hora,atual
    public void statusAtual(){
      System.out.println("_____________________________________________");
      System.out.println("Numero da conta "+this.getNumConta());
      System.out.println("Tipo "+this.getTipo());
      System.out.println("Dono "+this.getDono());
      System.out.println("Saldo "+this.getSaldo());
      System.out.println("Status "+this.getStatus());
    }
    
    
 //metodos
    //metodo para abrir conta, CC GANHA 50, CP GANHA 150
    public void abrirConta(String t){
       // se a conta foi aberta
       this.setStatus(true);
       
       // pega o "t", que é o tipo de conta escolhido
       this.setTipo(t);
       
       // se o tipo for CC
       if(t == "CC"){
           //já vai ganhar 50 de saldo na conta
          this.setSaldo(50.00f);
         //senao
       } else{
           //vai ganhar 150 de saldo na conta 
          this.setSaldo(150.0f);
       }
       //mensagem de aviso que a conta foi aberta
       System.out.println("Conta aberta com sucesso ");
       
    }
    
    
    // metodo para fechar a conta 
     public void fecharConta(){
         
      //se saldo for maior que zero   
        if(this.getSaldo() > 0){
          // exibe mensagem dizendo que não pode ser fechada a conta,tem dinheiro nela
           System.out.println("Não pode ser fechada, Conta com dinheiro");
        //se senao saldo for maior que zero  
        } else if(this.getSaldo() < 0 ){
         //exibe mensagem dizendo que não pode ser fechada a conta, está com saldo negativo,devendo 
          System.out.println("Não pode ser fechada, Conta com saldo negativo");
        //senao
        } else{
        //fecha a conta, diz que o estatus da conta é falso ou seja não existe     
          this.setStatus(false);
        }
        //exibe a messagem, conta fechada com sucesso
        System.out.println("Conta fechada com sucesso ");
    }
     
     //metodo para fazer deposito na conta
     public void depositar(float v){
     //se a conta está aberta  
       if(this.getStatus()){
        //vai até o saldo e soma mais o "v" valor adicionado
          this.setSaldo(getSaldo() + v );
        //exibe mensagem, dizendo que foi realizado o deposito com sucesso e o nome do dono da conta  
          System.out.println("deposito realizado na conta "+this.getDono());
     // senao     
       }else{
        //exibe mensagem, dizendo que deu erro e que não existe conta 
          System.out.println("Erro,impossivel depositar, conta nao existe");
       }
    }
     
     
    // metodo para sacar dinheiro da conta  
     public void sacar(float v ){
      //se a conta está aberta
        if(this.getStatus()){
         // se o saldo da conta é maior ou igual ao "v" valor adicionado 
            if (this.getSaldo() >= v ){
             // vai no saldo e tirar(sacar)  o "v" valor adicionado    
                this.setSaldo(this.getSaldo() - v );
                //exibi mesnagem, deizendo que o saque foi realizado na conta de,adiciona o nome do dono
                System.out.println("Saque realizado na conta de "+this.getDono());
         // senao
            }else
             // exibi mensagem , dizendo que não tem dinheiro na conta  
               System.out.println("Saldo insuficiente para sacar ");
     // senao       
       }else{
         // exibe mensagem, dizendo que a conta não existe
           System.out.println("Impossivel sacar, conta não existe ");
        }
       
    }
     
    // metodo para desconto mensal da conta, taxa do banco 
    public void pagarMensal(){
   // cria uma variavel ,inicia com 0      
    int v = 0 ;
      // se o tipo de conta escolhido for "CC"
        if(this.getTipo() == "CC"){
               // o valor a ser descontado será 12.00
               v = 12;
          //senao se o tipo de conta escolhido for "CP"     
            }else if( this.getTipo() == "CP"){
                  // o valor a ser descontado será 20.00
                   v = 20;
            }       
      //se a conta está aberta           
        if(this.getStatus()){
          // vai no saldo e tira o "v" valor de acordo com a opção acima   
            this.setSaldo(this.getSaldo() - v );
             // exibi mensagem, dizendo que a mensalidade foi paga e o nome do ono da conta que pagou
               System.out.println("Mensalidade paga com sucesso por "+this.getDono());
      // senao         
        } else {
            //exibi a mensagem, que a conta não existe e por isso nao foi paga a mensalidade 
            System.out.println("Conta fechada, não tem como cobrar mensalidade ");
           }
       }
       
    
    //metodos acessores

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
