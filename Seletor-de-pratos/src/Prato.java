public class Prato {
    public String Nome;
    public int TempoInicio;
    public int TempoFim;

    public Prato(String nome, int TempoI, int TempoF) {
        this.Nome = nome;
        this.TempoInicio = TempoI;
        this.TempoFim = TempoF;
    }

    public String getNome() {
        return Nome;
    }

    public int getTempoInicio() {
        return TempoInicio;
    }

    public int getTempoFim() {
        return TempoFim;
    }
}
