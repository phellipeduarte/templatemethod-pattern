public abstract class Quarto {

    private String numero;
    private Boolean ocupado;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean ocupado) {
        this.ocupado = ocupado;
    }

    public abstract Double getDiaria();

    public abstract String getTipo();

    public String getInfo(){
        return
        "{\n" +
        "   numero: " + getNumero() + ",\n" +
        "   diaria: " + getDiaria() + ",\n" +
        "   tipo: " + getTipo() + "\n" +
        "}";
    }

    public Double simularEstadia(Integer dias){
        return dias * getDiaria();
    }

}
