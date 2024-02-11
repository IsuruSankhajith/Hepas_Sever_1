import java.io.Serializable;

public class StudentUnit implements Serializable {
    private Integer recordNo;
    private Integer personId;
    private String unitCode;
    private String unitTitle;
    private Double resultScore;
    private String resultGrade;
    private Integer yearAttemped;
    private Integer semesterAttemped;
    private String notes;

    public Integer getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(Integer recordNo) {
        this.recordNo = recordNo;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitTitle() {
        return unitTitle;
    }

    public void setUnitTitle(String unitTitle) {
        this.unitTitle = unitTitle;
    }

    public Double getResultScore() {
        return resultScore;
    }

    public void setResultScore(Double resultScore) {
        this.resultScore = resultScore;
    }

    public String getResultGrade() {
        return resultGrade;
    }

    public void setResultGrade(String resultGrade) {
        this.resultGrade = resultGrade;
    }

    public Integer getYearAttemped() {
        return yearAttemped;
    }

    public void setYearAttemped(Integer yearAttemped) {
        this.yearAttemped = yearAttemped;
    }

    public Integer getSemesterAttemped() {
        return semesterAttemped;
    }

    public void setSemesterAttemped(Integer semesterAttemped) {
        this.semesterAttemped = semesterAttemped;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
