package com.kodilla.execution_model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @ParameterizedTest
    @CsvSource(value = {"STS, 199.23,Fortuna, 122.12", "ING, 2300.00, PKO, 2100.00"})
    public void ShouldAddItemToInvoiceAndClearInvoice(String input, double input2, String input3, double input4){
        //given
        Item item1 = new Item(input,input2);
        Item item2 = new Item(input3,input4);

        Invoice invoice1 = new Invoice();
        //when
        invoice1.addItem(item1);
        invoice1.addItem(item2);
        //then

        assertEquals(2,invoice1.getSize());

        invoice1.clear();

        assertEquals(0,invoice1.getSize());

    }

    @ParameterizedTest
    @CsvSource(value = {"T-shirt, 199.23,Jeans, 122.12", "Lenovo, 2300.00, Asus, 2100.00"})
    public void ShouldAddItemToInvoiceAndCheckOnePriceAndName(String input, double input2, String input3, double input4) {
        //given
        Item item1 = new Item(input, input2);
        Item item2 = new Item(input3, input4);

        Invoice invoice1 = new Invoice();
        //when
        invoice1.addItem(item1);
        invoice1.addItem(item2);
        //then

        assertEquals(2, invoice1.getSize());

        var expectedName = item1.getName();
        var expectedPrice = item1.getPrice();

        assertEquals(input, expectedName);
        assertEquals(input2, expectedPrice);
    }
    @ParameterizedTest
    @CsvSource(value = {"T-shirt, 199.23,Jeans, 122.12", "Lenovo, 2300.00, Asus, 2100.00"})
    public void ShouldAddItemToInvoiceAnReturnNullWhenPassingOfRangeIndex(String input, double input2, String input3, double input4) {
        //given
        Item item1 = new Item(input, input2);
        Item item2 = new Item(input3, input4);

        Invoice invoice1 = new Invoice();
        //when
        invoice1.addItem(item1);
        invoice1.addItem(item2);
        var expectedResult = invoice1.getItem(3);
        //then

        assertNull(expectedResult);

    }

    @ParameterizedTest
    @CsvSource(value = {"T-shirt, 199.23,Jeans, 122.12", "Lenovo, 2300.00, Asus, 2100.00"})
    public void ShouldAddItemToInvoiceAnReturnNullWhenPassingNegativeIndex(String input, double input2, String input3, double input4) {
        //given
        Item item1 = new Item(input, input2);
        Item item2 = new Item(input3, input4);

        Invoice invoice1 = new Invoice();
        //when
        invoice1.addItem(item1);
        invoice1.addItem(item2);
        var expectedResult = invoice1.getItem(-3);
        //then

        assertNull(expectedResult);

    }

}