package com.angeltm.store.Utilities;

public class Status {
    private boolean OperationStatus;
    private String message;


    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public boolean isOperationStatus() {
        return OperationStatus;
    }
    public void setOperationStatus(boolean operationStatus) {
        OperationStatus = operationStatus;
    } 
}
