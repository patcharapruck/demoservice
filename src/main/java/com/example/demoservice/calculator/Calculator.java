package com.example.demoservice.calculator;

public class Calculator {

    //private long id;
    private Double firstnum;
    private String operator;
    private Double secondnum;
    private Double ans;

    public Calculator(){

    }

    public Calculator(Double firstnum,String operator,Double secondnum){
        this.firstnum = firstnum;
        this.operator = operator;
        this.secondnum = secondnum;
    }


    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setFirstnum(Double firstnum){
        this.firstnum = firstnum;
    }

    public void setSecondnum(Double secondnum){
        this.secondnum = secondnum;
    }

    public void setAns(Double ans){
        this.ans = ans;
    }

    public String getOperator() {
        return this.operator;
    }

    public Double getFirstnum() {
        return this.firstnum;
    }

    public Double getSecondnum() {
        return this.secondnum;
    }

    public Double getAns(){
        return  this.ans;
    }
}
