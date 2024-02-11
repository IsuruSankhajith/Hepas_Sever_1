import java.io.Serializable;
import java.util.List;

public class StudentInfo implements Serializable {

    private Integer recordNo;
    private Integer personId;
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String courseCode;
    private Integer unitAttempted;
    private Integer unitCompleted;
    private String courseStatus;
    private CourseInfo courseInfo;
    private List<StudentUnit> studentUnits;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getUnitAttempted() {
        return unitAttempted;
    }

    public void setUnitAttempted(Integer unitAttempted) {
        this.unitAttempted = unitAttempted;
    }

    public Integer getUnitCompleted() {
        return unitCompleted;
    }

    public void setUnitCompleted(Integer unitCompleted) {
        this.unitCompleted = unitCompleted;
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    public CourseInfo getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(CourseInfo courseInfo) {
        this.courseInfo = courseInfo;
    }

    public List<StudentUnit> getStudentUnits() {
        return studentUnits;
    }

    public void setStudentUnits(List<StudentUnit> studentUnits) {
        this.studentUnits = studentUnits;
    }
}
