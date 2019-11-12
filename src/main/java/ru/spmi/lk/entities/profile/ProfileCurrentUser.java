package ru.spmi.lk.entities.profile;

public class ProfileCurrentUser {
    private int id;
    private String sync_id;
    private String external_id;
    private String sync_source;
    private String login;
    private int bitrix_id;
    private String fullname;
    private String lastname;
    private String name;
    private String surname;
    private String email;
    private String sex;
    private String domain;
    private String code;

    public int getId() {
        return id;
    }

    public String getSyncId() {
        return sync_id;
    }

    public String getExternalId() {
        return external_id;
    }

    public String getSyncSource() {
        return sync_source;
    }

    public String getLogin() {
        return login;
    }

    public int getBitrixId() {
        return bitrix_id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getSex() {
        return sex;
    }

    public String getDomain() {
        return domain;
    }

    public String getCode() {
        return code;
    }
}
