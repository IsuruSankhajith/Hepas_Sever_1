import java.io.Serializable;

public class CourseInfo implements Serializable {
    private Integer seriesNo;
    private String courseCode;
    private String courseTitle;
    private Integer yearStartOffer;
    private Integer yearEndOffer;
    private String courseCoordinatorName;
    private String courseCoordinatorEmail;
    private String courseCoordinatorMobilePhone;

    public Integer getSeriesNo() {
        return seriesNo;
    }

    public void setSeriesNo(Integer seriesNo) {
        this.seriesNo = seriesNo;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Integer getYearStartOffer() {
        return yearStartOffer;
    }

    public void setYearStartOffer(Integer yearStartOffer) {
        this.yearStartOffer = yearStartOffer;
    }

    public Integer getYearEndOffer() {
        return yearEndOffer;
    }

    public void setYearEndOffer(Integer yearEndOffer) {
        this.yearEndOffer = yearEndOffer;
    }

    public String getCourseCoordinatorName() {
        return courseCoordinatorName;
    }

    public void setCourseCoordinatorName(String courseCoordinatorName) {
        this.courseCoordinatorName = courseCoordinatorName;
    }

    public String getCourseCoordinatorEmail() {
        return courseCoordinatorEmail;
    }

    public void setCourseCoordinatorEmail(String courseCoordinatorEmail) {
        this.courseCoordinatorEmail = courseCoordinatorEmail;
    }

    public String getCourseCoordinatorMobilePhone() {
        return courseCoordinatorMobilePhone;
    }

    public void setCourseCoordinatorMobilePhone(String courseCoordinatorMobilePhone) {
        this.courseCoordinatorMobilePhone = courseCoordinatorMobilePhone;
    }
}
