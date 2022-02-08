package org.pathway.carrito.function;

import java.util.ArrayList;

public class CarritoBuilder {
    ArrayList<Integer> precios = new ArrayList<>();

    public CarritoBuilder(int size){
        for(int i = 0; i < size; i++){
            double random = Math.random()*100+1;
            precios.add((int) random);
        }
    }

    public CarritoBuilder(int size, int value){
        for(int i = 0; i < size; i++){
            precios.add(value);
        }
    }

    public CarritoDeLaCompra build(){
        return new CarritoDeLaCompra(this.precios);
    }

    public void add(Integer nuevoValor){
        precios.add(nuevoValor);
    }

    public void addMultiple(int size, int value){
        for(int i = 0; i < size; i++){
            precios.add(value);
        }
    }

}
