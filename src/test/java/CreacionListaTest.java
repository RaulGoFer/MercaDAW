import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import es.etg.daw.programacio.practica.mercadaw.DAWMarket.Empleado;
import es.etg.daw.programacio.practica.mercadaw.DAWMarket.Supermercado;

public class CreacionListaTest {
    
    @Test
    public void listaEmpleadosTest(){
        List<Empleado> empleados = new ArrayList<Empleado>();
        Supermercado supermercado = new Supermercado(null, null, null, empleados);
        empleados.add(supermercado.crearEmpleado("Raul", "Gomez", "Cajero"));

        int numEmpleadosEsperado = 1;
        assertEquals(numEmpleadosEsperado, empleados.size());
    }
}
