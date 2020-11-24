
package joaoatacadao.produto;

public class Periferico extends Informatica {
    protected String tipo;
    protected String padraoDeEntrada;

    public Periferico(String tipo, String padraoDeEntrada, String cor, String modelo, String nome, String codigoDeBarras, float valor, String marca) {
        super(cor, modelo, nome, codigoDeBarras, valor, marca);
        this.tipo = tipo;
        this.padraoDeEntrada = padraoDeEntrada;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPadraoDeEntrada() {
        return padraoDeEntrada;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPadraoDeEntrada(String padraoDeEntrada) {
        this.padraoDeEntrada = padraoDeEntrada;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nTipo: " + tipo + ",\nPadrão de Entrada: " + padraoDeEntrada;
    }
    
    
}
