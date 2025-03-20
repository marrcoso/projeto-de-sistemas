package formasdepagamento;

import javax.management.RuntimeErrorException;

public class Debito implements FormaDePagamento{
    private int saldo;

    public Debito(int saldo) {
        this.saldo = saldo;
    }

    private boolean saldoDisponivel(Pedido p) {
        if (p.valor() <= this.saldo){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int formaDePagamento(Pedido p) {
        if (saldoDisponivel(p)) {
            return p.valor();
        } else {
            throw new RuntimeErrorException(null, "Saldo Indisponível.");
        }
    }
}
