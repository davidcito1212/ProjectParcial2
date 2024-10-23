package co.edu.uniquindio.projectparcial2.model.Bridge.implementacion;

import co.edu.uniquindio.projectparcial2.model.Bridge.Prestamo;
import co.edu.uniquindio.projectparcial2.model.Bridge.PrestamoLocal;

public class EntregaLocal implements IMetodoEntrega{
    @Override
    public void procesarPedido(Prestamo prestamo) {
        if (prestamo instanceof PrestamoLocal){
            System.out.println("Procesando prestamos local para una entrega local");
        }else{
            System.out.println("Invalido");
        }
    }
}
