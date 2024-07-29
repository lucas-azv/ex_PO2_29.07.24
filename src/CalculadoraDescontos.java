public class CalculadoraDescontos {
    private DescontoStrategy strategy;

    public void setTipoCliente(TipoCliente tipoCliente) {
        switch (tipoCliente) {
            case REGULAR:
                this.strategy = new DescontoClienteRegular();
                break;
            case VIP:
                this.strategy = new DescontoClienteVip();
                break;
            case FUNCIONARIO:
                this.strategy = new DescontoFuncionario();
                break;
            default:
                this.strategy = null;
                break;
        }
    }

    public double calcularDesconto(double consumo) {
        if (strategy != null) {
            return strategy.calcularDesconto(consumo);
        } else {
            return 0;
        }
    }
}