package ru.spmi.lk.entities.disk;

public class Disk {
    private int id;
    private String name;
    private boolean isFolder;
    private boolean isFile;
    private boolean canAdd;
    private String link;
    private boolean isSymLink;
    private boolean isLocked;
    private boolean isDraggable;
    private boolean isDroppable;
    private boolean formattedSize;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isFolder() {
        return isFolder;
    }

    public boolean isFile() {
        return isFile;
    }

    public boolean isCanAdd() {
        return canAdd;
    }

    public String getLink() {
        return link;
    }

    public boolean isSymLink() {
        return isSymLink;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public boolean isDraggable() {
        return isDraggable;
    }

    public boolean isDroppable() {
        return isDroppable;
    }

    public boolean isFormattedSize() {
        return formattedSize;
    }
}
