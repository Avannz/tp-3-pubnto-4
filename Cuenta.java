public abstract class Cuenta {
    private int identificador;
    private float balance;
    private Cliente cliente;

    public Cuenta(int identificador, float balance, Cliente cliente) {
        this.identificador = identificador;
        this.balance = balance;
        this.cliente = cliente;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract double depositar();

     public abstract double extraer();


}
