import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface HonorsEvaluator extends Remote {
    SerializableResult evaluateHonorsEligibility(String studentType, int personId, String firstName, String email, Map<String, Double[]> inputData) throws RemoteException;
}
