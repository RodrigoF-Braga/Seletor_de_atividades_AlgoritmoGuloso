
import java.util.List;
import java.util.ArrayList;

void main() {
    List<Prato> cardapio = new ArrayList<>();

    cardapio.add(new Prato("Lasanha", 14, 16));
    cardapio.add(new Prato("Pão de Queijo", 13, 14));
    cardapio.add(new Prato("Frango Assado", 13, 15));
    cardapio.add(new Prato("Bolo de Cenoura", 16, 17));
    cardapio.add(new Prato("Pizza", 15, 17));
    cardapio.add(new Prato("Torta de Legumes", 16, 18));
    cardapio.add(new Prato("Batata Gratinada", 12, 14));
    cardapio.add(new Prato("Quiche", 17, 19));

    cardapio.sort(Comparator.comparingInt(Prato::getTempoFim));

    System.out.println("Lista de pratos ordenada por horário de término de preparação\n");
    for (Prato p : cardapio) {
        System.out.println(p.getNome() + ": " + p.getTempoInicio() + "h - " + p.getTempoFim() + "h");
    }
    List<Prato> selecionados = new ArrayList<>();
    selecionados.add(cardapio.get(0));
    int fimUltimo = cardapio.get(0).getTempoFim();

    for (int i = 1; i < cardapio.size(); i++) {
        Prato prato = cardapio.get(i);
        if (prato.getTempoInicio() >= fimUltimo) {
            selecionados.add(prato);
            fimUltimo = prato.getTempoFim();
        }
    }
    System.out.println("\n");
    System.out.println("Pratos selecionados\n");
    for (Prato p : selecionados) {
        System.out.println(p.getNome() + ": " + p.getTempoInicio() + "h - " + p.getTempoFim() + "h");
    }
}
