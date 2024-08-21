import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente = new Cliente();
        //lendo as informações do cliente
        Scanner scanner = new Scanner(System.in);
        // variavel para verificar o erro de entradas
        boolean erro = true;
        //lendo a conta do cliente
        System.out.println("Gostariamos de algumas informações");
        System.out.println("Por fafor, digite o seu nome:");
        cliente.setNome(scanner.nextLine());
        System.out.println("o número da conta:");
        // teste de validação do campo número de conta
        while(erro){
            try {
                cliente.setNumero(scanner.nextInt());
                erro = false;  
            } catch (InputMismatchException e) {
                // reinicia o scanner para ler novamente
                System.out.println("Entrada inválida, o número da conta deve ser preenchida apenas por números");
                scanner = null;
                scanner = new Scanner(System.in);
            }
        }   
        System.out.println("o número da agencia:");
        cliente.setAgencia(scanner.next()); 
        System.out.println("seu saldo:");
        // teste de validação do campo saldo
        erro = true;
        while(erro){
            try {
                cliente.setSaldo(scanner.nextDouble());
                erro = false;  
            } catch (InputMismatchException e) {
                // reinicia o scanner para ler novamente
                System.out.println("Entrada inválida, digite seu saldo novamento no modelo '100,00' ");
                scanner = null;
                scanner = new Scanner(System.in);
            }
        }
        
        //saída do sistema
        System.out.println("Olá "+cliente.getNome()+", obrigado por criar uma conta em nosso banco, sua agência é "+cliente.getAgencia()+", conta "+cliente.getNumero()+" e seu saldo "+cliente.getSaldo()+" já está disponível para saque");
        
    }
        
    
}
