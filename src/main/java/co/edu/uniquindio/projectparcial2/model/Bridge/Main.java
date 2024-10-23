package co.edu.uniquindio.projectparcial2.model.Bridge;

import co.edu.uniquindio.projectparcial2.model.Bridge.implementacion.EntregaInternacional;
import co.edu.uniquindio.projectparcial2.model.Bridge.implementacion.EntregaLocal;

public class Main {
    public static void main(String[] args) {
        EntregaInternacional entregaInternacional = new EntregaInternacional();
        EntregaLocal entrega = new EntregaLocal();
        PrestamoLocal prestamoLocal = new PrestamoLocal(entrega);
        prestamoLocal.realizarPrestamo();
    }
}
