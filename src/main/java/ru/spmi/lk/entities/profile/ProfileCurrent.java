package ru.spmi.lk.entities.profile;

public class ProfileCurrent {
    private int id;
    private String sync_id;
    private String sync_source;
    private String external_id;
    private int user_id;
    private int bitrix_id;
    private String type;
    private String edu_mark_book_num; //номер зачетки
    private String edu_status;
    private int faculty_id;
    private String cathedra;
    private int edu_direction_id;
    private int edu_specialization_id;
    private int edu_qualification_id;
    private int edu_group_id;
    private int edu_subgroup;
    private int edu_course;
    private int edu_semester;
    private int edu_year;
    private String updated_at;
    private String role;
    private String type_name;
    private String bitrix_login;
    private String bitrix_email;
    private ProfileCurrentUser user;
    private InfoEntity faculty;
    private InfoEntity edu_direction;
    private InfoEntity edu_group;
    private InfoEntity edu_qualification;
    private InfoEntity edu_specialization;

    public int getId() {
        return id;
    }

    public String getSyncId() {
        return sync_id;
    }

    public String getSyncSource() {
        return sync_source;
    }

    public String getExternalId() {
        return external_id;
    }

    public int getUserId() {
        return user_id;
    }

    public int getBitrixId() {
        return bitrix_id;
    }

    public String getType() {
        return type;
    }

    public String getEduMarkBookNum() {
        return edu_mark_book_num;
    }

    public String getEduStatus() {
        return edu_status;
    }

    public int getFacultyId() {
        return faculty_id;
    }

    public String getCathedra() {
        return cathedra;
    }

    public int getEduDirectionId() {
        return edu_direction_id;
    }

    public int getEduSpecializationId() {
        return edu_specialization_id;
    }

    public int getEduQualificationId() {
        return edu_qualification_id;
    }

    public int getEduGroupId() {
        return edu_group_id;
    }

    public int getEduSubgroup() {
        return edu_subgroup;
    }

    public int getEduCourse() {
        return edu_course;
    }

    public int getEduSemester() {
        return edu_semester;
    }

    public int getEduYear() {
        return edu_year;
    }

    public String getUpdatedAt() {
        return updated_at;
    }

    public String getRole() {
        return role;
    }

    public String getTypeName() {
        return type_name;
    }

    public String getBitrixLogin() {
        return bitrix_login;
    }

    public String getBitrixEmail() {
        return bitrix_email;
    }

    public ProfileCurrentUser getUser() {
        return user;
    }

    public InfoEntity getFaculty() {
        return faculty;
    }

    public InfoEntity getEduDirection() {
        return edu_direction;
    }

    public InfoEntity getEduGroup() {
        return edu_group;
    }

    public InfoEntity getEduQualification() {
        return edu_qualification;
    }

    public InfoEntity getEduSpecialization() {
        return edu_specialization;
    }
}
