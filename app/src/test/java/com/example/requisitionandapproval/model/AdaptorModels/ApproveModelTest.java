package com.example.requisitionandapproval.model.AdaptorModels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApproveModelTest {

    @Test
    void getITName() {
        ApproveModel approveModel = new ApproveModel("Ceyment","10","200");
        assertEquals("Ceyment",approveModel.getITName());
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

    @Test
    void setITName() {
    }
}