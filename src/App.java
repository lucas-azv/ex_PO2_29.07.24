public class App {
    public static void main(String[] args) {
            CalculadoraDescontos calculadora = new CalculadoraDescontos();
        
            calculadora.setTipoCliente(TipoCliente.REGULAR);
            System.out.println("Desconto do Cliente Regular: " + calculadora.calcularDesconto(1500));
        
            calculadora.setTipoCliente(TipoCliente.VIP);
            System.out.println("Desconto do Cliente VIP: " + calculadora.calcularDesconto(1500));
        
            calculadora.setTipoCliente(TipoCliente.FUNCIONARIO);
            System.out.println("Desconto do Funcionario: " + calculadora.calcularDesconto(1500));
        }
    }