package com.iss.modal;

public class RecruitOtherInfo {
    private Integer id;

    private String companynature;

    private String companyscale;

    private String experience;

    private String education;

    private String jobdescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanynature() {
        return companynature;
    }

    public void setCompanynature(String companynature) {
        this.companynature = companynature == null ? null : companynature.trim();
    }

    public String getCompanyscale() {
        return companyscale;
    }

    public void setCompanyscale(String companyscale) {
        this.companyscale = companyscale == null ? null : companyscale.trim();
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription == null ? null : jobdescription.trim();
    }
}