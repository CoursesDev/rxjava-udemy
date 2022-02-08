package org.pathway.carrito.function;

import java.util.Collection;

public class CarritoDeLaCompra {
    private final Collection<Integer> precios;

    public CarritoDeLaCompra(Collection<Integer> precios) {
        this.precios = precios;
    }

    public int calcularPrecioTotal() {
        int precioTotal = 0;
        for (Integer precio : precios) {
            precioTotal += precio;
        }
        return precioTotal;
    }

    public int contarNumeroProductos() {
        return precios.size();
    }

    public int calcularPrecioTotalLambda() {
        return this.precios.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public long calcularDescuentoTotal(int cantidadConDescuento){
        long descuentoTotal = 0;
        for(Integer precio : precios){
            if(precio >= cantidadConDescuento){
                descuentoTotal += (cantidadConDescuento* 5L)/100;
            }
        }
        return descuentoTotal;
    }

    public long calcularDescuentoTotalLambda(int cantidadConDescuento){
        long descuentoTotal = 0;
        long numeroDeDescuentos  = this.precios.stream()
                .filter(precio -> precio >= cantidadConDescuento)
                .count();
        descuentoTotal = (cantidadConDescuento* 5L /100)*numeroDeDescuentos;
        return descuentoTotal;
    }

    public boolean detectarError() {
        boolean negativeFind = false;
        for (Integer precio : precios) {
            if (precio < 0) {
                negativeFind = true;
            }
        }
        return negativeFind;
    }

    public boolean detectarErrorAnyMatch() {
        return this.precios.stream().anyMatch(precio -> precio < 0);
    }

    public boolean detectarErrorFindAny() {
        return this.precios.stream().anyMatch(precio -> precio < 0);
    }

    public boolean detectarErrorAnyMatchParallel() {
        return this.precios.parallelStream().anyMatch(precio -> precio < 0);
    }

    public boolean detectarErrorFindAnyParallel() {
        return this.precios.parallelStream().anyMatch(precio -> precio < 0);
    }

    public boolean detectarErrorFindFirstParallel() {

        return this.precios.parallelStream().anyMatch(precio -> precio < 0);
    }
}
