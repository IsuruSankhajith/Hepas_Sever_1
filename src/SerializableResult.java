import java.io.Serializable;
import java.util.List;

public class SerializableResult implements Serializable {
    private String result;
    private List<StudentUnit> studentUnitList;

    public SerializableResult(String result) {
        this.result = result;
    }

    public SerializableResult(String result, List<StudentUnit> studentUnitList) {
        this.result = result;
        this.studentUnitList = studentUnitList;
    }

    public String getResult() {
        return result;
    }

    public List<StudentUnit> getStudentUnitList() {
        return studentUnitList;
    }

    public void setStudentUnitList(List<StudentUnit> studentUnitList) {
        this.studentUnitList = studentUnitList;
    }
}
