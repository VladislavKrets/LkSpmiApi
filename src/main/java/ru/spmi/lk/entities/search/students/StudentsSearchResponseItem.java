package ru.spmi.lk.entities.search.students;

public class StudentsSearchResponseItem {
    private int id;
    private int user_id;
    private String fullname;
    private String fullname_en;
    private String edu_qualification;
    private String edu_specialization;
    private int edu_specialization_id;
    private String edu_direction;
    private String department;
    private String edu_group;
    private int edu_direction_id;
    private int department_id;
    private int edu_group_id;
    private int edu_dep_id;
    private String edu_form;
    private String edu_form_id;
    private int edu_course;
    private int edu_contract;
    private Integer edu_level;
    private StudentsSearchResponseItemPhoto photo;
    private String email;
    private String mobile;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return user_id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getFullnameEn() {
        return fullname_en;
    }

    public String getEduQualification() {
        return edu_qualification;
    }

    public String getEduSpecialization() {
        return edu_specialization;
    }

    public int getEduSpecializationId() {
        return edu_specialization_id;
    }

    public String getEduDirection() {
        return edu_direction;
    }

    public String getDepartment() {
        return department;
    }

    public String getEduGroup() {
        return edu_group;
    }

    public int getEduDirectionId() {
        return edu_direction_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public int getEduGroupId() {
        return edu_group_id;
    }

    public int getEduDepId() {
        return edu_dep_id;
    }

    public String getEduForm() {
        return edu_form;
    }

    public String getEduFormId() {
        return edu_form_id;
    }

    public int getEduCourse() {
        return edu_course;
    }

    public int getEduContract() {
        return edu_contract;
    }

    public Integer getEduLevel() {
        return edu_level;
    }

    public StudentsSearchResponseItemPhoto getPhoto() {
        return photo;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }
}
