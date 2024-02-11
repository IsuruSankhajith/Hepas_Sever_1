import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class HepasServer1 {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);

            HonorsEvaluator evaluator = new HonorsEvaluatorImpl();
            Naming.rebind("rmi://localhost:1099/HonorsEvaluator", evaluator);

            System.out.println("Hepas Server 01 is ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
