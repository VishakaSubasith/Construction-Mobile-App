package com.example.requisitionandapproval.model.AdaptorModels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemclsTest {

    @Test
    void getItName() {
        Itemcls itemclsTest = new Itemcls("cement","10","20",1,2);
        assertEquals("cement",itemclsTest.getItName());
        assertEquals("10",itemclsTest.getQty());
        assertEquals("20",itemclsTest.getPrice());
        assertEquals(1,itemclsTest.getDeleteBtn());

    }

    @Test
    void setItName() {

    }

    @Test
    void getQty() {

    }

    @Test
    void setQty() {
    }

    @Test
    void getPrice() {
    }

    @Test
    void setPrice() {
    }
}