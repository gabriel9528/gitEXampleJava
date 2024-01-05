package com.exercise.Services;

import com.exercise.IServicioA;

public class ServicioAImpl implements IServicioA {
    @Override
    public int sumar(int a, int b) {
        return a+b;
    }
}
