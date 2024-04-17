public class Paciente {
    private String estado;
    private String nome;

    public Paciente() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void add(int altera) {
        if (altera == 1) {
            this.estado = "Emergencia";
        } else if (altera == 2) {
            this.estado = "Normal";
        }
    }
}
