package examfinal;

import java.util.ArrayList;

public class CompositeBarco {
    private static CompositeBarco instancia;

    public static CompositeBarco getInstance() {
        if (instancia == null) {
            instancia = new CompositeBarco();
        }
        return instancia;
    }

    public Cargable agregarCarga(String carga) {
        switch (carga) {
            case "cargasimple":
                CargaSimple cargaSimple = new CargaSimple("TV 32' LCD", "tecnologia", 3, false);
                return cargaSimple;

            case "cargaContenedor":
                CargaContendores cargaContendores = new CargaContendores();
                CargaSimple cargaSimple1 = new CargaSimple("TV 32' LCD", "tecnologia", 3, false);
                CargaSimple cargaSimple2 = new CargaSimple("Medicametos", "Medicina", 2, true);
                cargaContendores.agregarCargaSimple(cargaSimple1);
                cargaContendores.agregarCargaSimple(cargaSimple2);
                return cargaContendores;
            default:
                return null;
        }

    }
}





