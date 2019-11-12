package ru.spmi.lk.entities.stipend;

public class Stipend {
    private int id;
    private String sync_id;
    private String external_id;
    private String date;
    private String date_begin;
    private String date_end;
    private int sum;
    private String currency;
    private String type;
    private String order;

    public int getId() {
        return id;
    }

    public String getSyncId() {
        return sync_id;
    }

    public String getExternalId() {
        return external_id;
    }

    public String getDate() {
        return date;
    }

    public String getDateBegin() {
        return date_begin;
    }

    public String getDateEnd() {
        return date_end;
    }

    public int getSum() {
        return sum;
    }

    public String getCurrency() {
        return currency;
    }

    public String getType() {
        return type;
    }

    public String getOrder() {
        return order;
    }
}
