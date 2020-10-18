package com.example.requisitionandapproval.MainClasses.Order;

public class validation {

    private String addline1;
    private String addline2;
    private String requireDate;
    private int Suplier;


    public String getAddline1() {
        return addline1;
    }

    public void setAddline1(String addline1) {
        this.addline1 = addline1;
    }

    public String getAddline2() {
        return addline2;
    }

    public void setAddline2(String addline2) {
        this.addline2 = addline2;
    }

    public String getRequireDate() {
        return requireDate;
    }

    public void setRequireDate(String requireDate) {
        this.requireDate = requireDate;
    }

    public int getSuplier() {
        return Suplier;
    }

    public void setSuplier(int suplier) {
        Suplier = suplier;
    }



    public boolean addressValidation(){

        if (getAddline1().isEmpty() ||  getAddline2().isEmpty() || getRequireDate().isEmpty() || getSuplier()==0){
            return false;
        }else{
            return true;
        }


    }
}
