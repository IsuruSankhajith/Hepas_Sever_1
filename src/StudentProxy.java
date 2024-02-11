import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class StudentProxy {

    private StudentInfoService studentInfoService;

    public StudentProxy() throws MalformedURLException, NotBoundException, RemoteException {
        studentInfoService = (StudentInfoService) Naming.lookup("rmi://localhost:1000/HonorsEvaluatorDB");
    }

    public StudentInfo findStudentByPersonId(int personId, String firstName, String email) throws RemoteException {
        return studentInfoService.getStudentInfoByPersonId(personId, firstName, email);
    }

}
