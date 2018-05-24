package spring.boot.demo.dao.dto;

public class ActivityRelation {
    private Integer id;

    private String formNo;

    private Integer formSn;

    private String parentFormNo;

    private Integer parentFormSn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormNo() {
        return formNo;
    }

    public void setFormNo(String formNo) {
        this.formNo = formNo == null ? null : formNo.trim();
    }

    public Integer getFormSn() {
        return formSn;
    }

    public void setFormSn(Integer formSn) {
        this.formSn = formSn;
    }

    public String getParentFormNo() {
        return parentFormNo;
    }

    public void setParentFormNo(String parentFormNo) {
        this.parentFormNo = parentFormNo == null ? null : parentFormNo.trim();
    }

    public Integer getParentFormSn() {
        return parentFormSn;
    }

    public void setParentFormSn(Integer parentFormSn) {
        this.parentFormSn = parentFormSn;
    }
}