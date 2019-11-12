package ru.spmi.lk.entities.profile;

public class Profile {
    private int id;
    private String type;
    private String type_name;
    private String name;
    private String href;
    private String extra;
    private boolean current;
    private int[] deps;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTypeName() {
        return type_name;
    }

    public String getName() {
        return name;
    }

    public String getHref() {
        return href;
    }

    public String getExtra() {
        return extra;
    }

    public boolean isCurrent() {
        return current;
    }

    public int[] getDeps() {
        return deps;
    }
}
