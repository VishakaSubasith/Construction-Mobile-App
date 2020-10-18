package com.example.requisitionandapproval.MainClasses.Order;

import org.junit.Test;

import static org.junit.Assert.*;

public class validationTest {

    validation validation = new validation();
    @Test
    public void getAddline1() {

        assertEquals("q",validation.getAddline1());
    }


    @Test
    public void getAddline2() {
        assertEquals("q",validation.getAddline2());
    }

    @Test
    public void getRequireDate() {
        assertEquals("q",validation.getRequireDate());
    }

    @Test
    public void getSuplier() {
        assertEquals(1,validation.getSuplier());
    }

    @Test
    public void addressValidation() {

        assertEquals(true,validation.addressValidation());

    }
}