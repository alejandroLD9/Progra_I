package ZReto2;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Ticket> lista;

    public Agenda() {
        lista = new ArrayList<>();
    }

    public Agenda add(Ticket t) {
        lista.add(t);
        return this;
    }

    public Agenda filtrarVencidos(int zona_) {
        Agenda agendaFiltrada = new Agenda();

        for (Ticket t : this.lista) {
            
            if (t.getZona() == zona_ && t.vencido()) {
                agendaFiltrada.add(t);
            }
        }
        return agendaFiltrada;
    }

    public Agenda filtrarActivos(int zona_) {
        Agenda agendaFiltrada = new Agenda();
        for (Ticket t : this.lista) {
            
            if (t.getZona() == zona_ && !t.vencido()) {
                agendaFiltrada.add(t);
            }
        }
        return agendaFiltrada;
    }

    @Override
    public String toString() {
        if (this.lista.isEmpty()) {
            return "La agenda está vacía.";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("--- LIistado de tickets ---\n");
        for (Ticket t : lista) {
            sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }
}
