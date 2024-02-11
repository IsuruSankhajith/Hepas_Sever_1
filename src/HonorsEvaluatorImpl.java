import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HonorsEvaluatorImpl extends UnicastRemoteObject implements HonorsEvaluator {

    public HonorsEvaluatorImpl() throws RemoteException {
        super();
    }

    @Override
    public SerializableResult evaluateHonorsEligibility(String studentType, int personId, String firstName, String email, Map<String, Double[]> inputData) throws RemoteException {

        try {
            if (studentType.equals("OUST")) {
                StudentInfo studentInfo = new StudentProxy().findStudentByPersonId(personId, firstName, email);
                double [] extractedScores = extractData(extractData(studentInfo.getStudentUnits()));
                return prepareResponse(studentInfo.getStudentUnits(), evaluationProcess(personId, extractedScores));
            } else {
                return new SerializableResult(evaluationProcess(personId, extractData(inputData)));
            }
        } catch (Exception ex) {
            return new SerializableResult(ex.getMessage());
        }
    }

    private double [] extractData(Map<String, Double[]> inputData) {
        return inputData.values().stream()
                .mapToDouble(marks -> Arrays.stream(marks)
                        .sorted((a, b) -> Double.compare(b, a))
                        .mapToDouble(Double::doubleValue)
                        .findFirst()
                        .orElse(Double.NaN))
                .toArray();
    }

    private Map<String, Double[]> extractData(List<StudentUnit> inputData) {
        Map<String, Double[]> scores = new HashMap<>();
        for (StudentUnit studentUnit : inputData) {
            if (scores.containsKey(studentUnit.getUnitCode())) {
                Double[] oldArr = scores.get(studentUnit.getUnitCode());
                Double[] newArr = Arrays.copyOf(oldArr, oldArr.length+1);
                newArr[oldArr.length] = studentUnit.getResultScore();
                scores.put(studentUnit.getUnitCode(), newArr);
            } else {
                scores.put(studentUnit.getUnitCode(), new Double[]{studentUnit.getResultScore()});
            }
        }
        return scores;
    }

    private String evaluationProcess(int personId, double [] unitScores) {

        double courseAverage = Arrays.stream(unitScores).average().orElse(0);

        if (unitScores.length <= 15) {
            return String.format("%d, %.2f, completed less than 16 units! DOES NOT QUALIFY FOR HONORS STUDY!", personId, courseAverage);
        }

        long failCount = Arrays.stream(unitScores).filter(score -> score < 50).count();
        if (failCount >= 6) {
            return String.format("%d, %.2f, with 6 or more Fails! DOES NOT QUALIFY FOR HONORS STUDY!", personId, courseAverage);
        }

        double best8Average = Arrays.stream(unitScores)
                .boxed()
                .sorted((a, b) -> Double.compare(b, a))
                .mapToDouble(Double::doubleValue)
                .limit(8)
                .average()
                .orElse(0);

        if (70 <= courseAverage) {
            return String.format("%d, %.2f, QUALIFIES FOR HONOURS STUDY!", personId, courseAverage);
        }

        if (65 <= courseAverage && courseAverage < 70) {
            if (best8Average >= 80) {
                return String.format("%d, %.2f, %.2f, QUALIFIES FOR HONOURS STUDY!", personId, courseAverage, best8Average);
            } else {
                return String.format("%d, %.2f, %.2f, MAY HAVE GOOD CHANCE! Need further assessment!", personId, courseAverage, best8Average);
            }
        }


        if (60 <= courseAverage && courseAverage < 65 && best8Average < 80) {
            return String.format("%d, %.2f, %.2f, MAY HAVE A CHANCE! Must be carefully reassessed and get the coordinator’s permission!", personId, courseAverage, best8Average);
        }

        return String.format("%d, %.2f, DOES NOT QUALIFY FOR HONORS STUDY!", personId, courseAverage);
    }

    private SerializableResult prepareResponse(List<StudentUnit> studentUnitList, String responseMessage) {
        return new SerializableResult(responseMessage, studentUnitList);
    }

    public static void main(String[] args) throws RemoteException {
        double [] subjectScores = {85.1, 70.6, 90.2, 60.0, 75, 61, 70.4, 73, 75, 68, 45, 20.9, 32, 45.6, 49.1, 12.5};
        Map<String, Double[]> data = Map.of("U01",new Double[]{85.1, 70.6, 90.2}, "U02", new Double[]{61.0, 70.4, 73.0});
        HonorsEvaluatorImpl honorsEvaluatorAsync = new HonorsEvaluatorImpl();
        SerializableResult result = honorsEvaluatorAsync.evaluateHonorsEligibility("OUST", 20241201, "Jim", "j.max@our.oust.edu.au", null);
//        System.out.println(honorsEvaluatorAsync.evaluationProcess(123456, subjectScores));
        double[] output = honorsEvaluatorAsync.extractData(data);
    }
}
