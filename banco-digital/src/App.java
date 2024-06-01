import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente beatriz = new Cliente();
		beatriz.setNome("Beatriz");
		
		Conta cc = new ContaCorrente(beatriz);
		Conta poupanca = new ContaPoupanca(beatriz);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
