package com.exercise.Services;

import com.exercise.IServicioA;
import com.exercise.IservicioB;

public class ServicioBImpl implements IservicioB {
    private IServicioA iServicioA;
    @Override
    public IServicioA getServicioA() {
        return iServicioA;
    }

    @Override
    public void setServicioA(IServicioA servicioA) {
        this.iServicioA=servicioA;
    }

    @Override
    public int multiplicarSuma(int a, int b, int multiplicador) {
        return iServicioA.sumar(a,b)*multiplicador;
    }

}
