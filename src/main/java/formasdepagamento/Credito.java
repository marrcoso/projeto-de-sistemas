package formasdepagamento;

import javax.management.RuntimeErrorException;

public class Credito implements FormaDePagamento{
private int limite;

    public Credito(int limite) {
        this.limite = limite;
    }

    private boolean limiteDisponivel(Pedido p) {
        if (p.valor() <= this.limite){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int formaDePagamento(Pedido p) {
        if (limiteDisponivel(p)) {
            return p.valor();
        } else {
            throw new RuntimeErrorException(null, "Limite Excedido.");
        }
    }

}
