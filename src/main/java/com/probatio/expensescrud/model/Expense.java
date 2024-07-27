package com.probatio.expensescrud.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
@DynamoDBTable(tableName = "HomeExpenses")
public class Expense {

    public String ExpensesId;



    public float Costo;
    public String Concepto;
    public String Fecha;

    @DynamoDBHashKey(attributeName = "ExpensesId")
    public String getExpensesId(){
        return ExpensesId;
    }

    public void setExpensesId(String id){
        this.ExpensesId = id;

    }

    public float getCosto() {
        return Costo;
    }

    public void setCosto(float costo) {
        this.Costo = costo;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String concepto) {
        this.Concepto = concepto;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        this.Fecha = fecha;
    }


}
