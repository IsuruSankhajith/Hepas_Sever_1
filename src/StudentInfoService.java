import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StudentInfoService extends Remote {
    public StudentInfo getStudentInfoByPersonId(Integer personId, String firstName, String email) throws RemoteException;
}
