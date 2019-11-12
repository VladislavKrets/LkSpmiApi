package ru.spmi.lk.entities.orders;

public class OrderOptions {
    private String dateformat;
    private OrderOptionsColumn[] columns;

    public String getDateformat() {
        return dateformat;
    }

    public OrderOptionsColumn[] getColumns() {
        return columns;
    }
}
