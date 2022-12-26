
package aula5cursoemvideo;

public class Aula5CursoEmVideo {

  
    public static void main(String[] args) {
        // criando objeto Conta 1 "p1"
        ContaBanco p1 = new ContaBanco();//cria um objeto, pessoa,pra gerenciar
        
        // setando as informções da conta 1 "p1"
        p1.setNumConta(001);// criou uma conta
        p1.setDono("giovani");// nome do dono da conta
        p1.abrirConta("CC");// abriu uma CONTA CORRENTE, que ganha 50.00 de inicio.
        p1.depositar(300); //depoistou na conta
        p1.sacar(250); //sacou da conta 
        p1.fecharConta(); // não fechou a conta, por que tem dinheiro nela
        
        
            // criando objeto da conta 2 "p2"
            ContaBanco p2 = new ContaBanco();//criou outra pessoa
            
            // setando as informações da conta 2 "p2"
            p2.setNumConta(002);// criou uma nova conta
            p2.setDono("guilherme");// nome do dono da conta
            p2.abrirConta("CP");// abriu uma CONTA POUPANÇA, e ganhou 150.00.
            p2.depositar(200);// depositou na conta 
            p2.sacar(350); // sacou da conta 
            p2.fecharConta();// conta fechada com sucesso, por que estava vazia 
            p2.depositar(200);// erro por que a conta já foi fechada
            
        // mostrando os status das contas 1 e 2 "p1" e "p2"   
        p1.statusAtual();
        p2.statusAtual();
        
        
        
        
    }
    
}
