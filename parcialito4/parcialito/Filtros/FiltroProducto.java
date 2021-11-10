package parcialito.Filtros;

import parcialito.Vendedor;

public class FiltroProducto extends Filtro{
    private String codigo;

    public FiltroProducto(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean cumple(Vendedor v) {
        return v.vendio(codigo);
    }
}
