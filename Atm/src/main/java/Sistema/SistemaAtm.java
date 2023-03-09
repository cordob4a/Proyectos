package Sistema;
import javax.swing.JOptionPane;
public class SistemaAtm{

public static double saldoActual;

public SistemaAtm(){
saldoActual =0;
}

public void depositar(double deposito){
saldoActual +=deposito;
}

public void retirar(double retiro){
	if(saldoActual >= retiro){
		saldoActual -= retiro;
	}else{
		JOptionPane.showMessageDialog(null,"ERROR SALDO INSUFICIENTE");
}
}
public double obtenerSaldo(){
return saldoActual;}
}