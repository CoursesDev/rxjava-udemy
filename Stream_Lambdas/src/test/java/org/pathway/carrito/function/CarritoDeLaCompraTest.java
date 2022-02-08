package org.pathway.carrito.function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarritoDeLaCompraTest {

    private final Integer TOTAL_SIZE = 20000000;
    private final Integer NUMBER_ADD = 1000000;

    @Test
    void shouldReturnTheCountOfAllItems() {

        CarritoBuilder builder = new CarritoBuilder(30);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        assertEquals(30, carritoDeLaCompra.contarNumeroProductos());
    }

    @Test
    void shouldCalculateTotalPrice() {

        CarritoBuilder builder = new CarritoBuilder(60,5);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        assertEquals(300, carritoDeLaCompra.calcularPrecioTotal());

    }

    @Test
    void shouldCalculateTotalPriceLambda() {

        CarritoBuilder builder = new CarritoBuilder(60, 5);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        assertEquals(300, carritoDeLaCompra.calcularPrecioTotalLambda());
    }

    @Test
    void shouldCalculateTotalDiscount() {

        CarritoBuilder builder = new CarritoBuilder(20,100);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        assertEquals(100, carritoDeLaCompra.calcularDescuentoTotal(100));

    }
    @Test

    void shouldCalculateTotalDiscountLambda() {

        CarritoBuilder builder = new CarritoBuilder(20,100);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        assertEquals(100, carritoDeLaCompra.calcularDescuentoTotalLambda(100));

    }

    @Test
    void shouldDetectErrorAnThrowRuntimeExceptionWhenAPriceIsNegative(){

        CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE,NUMBER_ADD);
        builder.add(-1);
        builder.addMultiple(TOTAL_SIZE, NUMBER_ADD);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        assertTrue(carritoDeLaCompra.detectarError());

    }

    @Test
    void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeAnyMatch(){

        CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE,NUMBER_ADD);
        builder.add(-1);
        builder.addMultiple(TOTAL_SIZE,NUMBER_ADD);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        assertTrue(carritoDeLaCompra.detectarErrorAnyMatch());

    }

    @Test
    void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeNumberFindAny(){

        CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE,NUMBER_ADD);
        builder.add(-1);
        builder.addMultiple(TOTAL_SIZE,NUMBER_ADD);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        assertTrue(carritoDeLaCompra.detectarErrorFindAny());

    }

    @Test
    void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeAnyMatchParallel(){

        CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE,NUMBER_ADD);
        builder.add(-1);
        builder.addMultiple(TOTAL_SIZE,NUMBER_ADD);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        assertTrue(carritoDeLaCompra.detectarErrorAnyMatchParallel());

    }

    @Test
    void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeNumberFindAnyParallel(){

        CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE,NUMBER_ADD);
        builder.add(-1);
        builder.addMultiple(TOTAL_SIZE,NUMBER_ADD);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        assertTrue(carritoDeLaCompra.detectarErrorFindAnyParallel());

    }

    @Test
    void shouldDetectErrorAndReturnTrueWhenAPriceIsNegativeNumberFindFirstParallel(){

        CarritoBuilder builder = new CarritoBuilder(TOTAL_SIZE,NUMBER_ADD);
        builder.add(-1);
        builder.addMultiple(TOTAL_SIZE,NUMBER_ADD);
        CarritoDeLaCompra carritoDeLaCompra = builder.build();
        assertTrue(carritoDeLaCompra.detectarErrorFindFirstParallel());

    }

}