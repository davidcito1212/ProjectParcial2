package co.edu.uniquindio.projectparcial2.model.Bridge.implementacion;

import co.edu.uniquindio.projectparcial2.model.Bridge.Prestamo;
import co.edu.uniquindio.projectparcial2.model.Bridge.PrestamoInternacional;

public class EntregaInternacional implements IMetodoEntrega{
    @Override
    public void procesarPedido(Prestamo prestamo) {
         if (prestamo instanceof PrestamoInternacional) {
            System.out.println("Procesando prestamo internacional para una entrega internacional");
         }else{
             System.out.println("Invalido");
         }
    }
}
