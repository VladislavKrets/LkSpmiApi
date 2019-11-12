package ru.spmi.lk.entities.orders;

public class Order {
    private int id;
    private String sync_id;
    private String external_id;
    private String number; //номер
    private String date;
    private String date_approve;
    private String title; //null
    private String action; //описание
    private OrderPivot pivot;

    public int getId() {
        return id;
    }

    public String getSyncId() {
        return sync_id;
    }

    public String getExternalId() {
        return external_id;
    }

    public String getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getDate_approve() {
        return date_approve;
    }

    public String getTitle() {
        return title;
    }

    public String getAction() {
        return action;
    }

    public OrderPivot getPivot() {
        return pivot;
    }
}
