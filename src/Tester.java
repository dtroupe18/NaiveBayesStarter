/**
 * Created by Dave on 5/22/17.
 */
public class Tester {

    public static void main(String[] args) {

        System.out.println("Labels:\n" +
                "1. Number of times Pregnant\n" +
                "2. Plasma glucose concentration a 2 hours in an oral glucose tolerance test\n" +
                "3. Diastolic blood pressure (mm Hg)\n" +
                "4. Triceps skin fold thickness (mm)\n" +
                "5. 2-Hour serum insulin (mu U/ml)\n" +
                "6. Body mass index (weight in kg/(height in m)^2)\n" +
                "7. Diabetes pedigree function\n" +
                "8. Age (years)\n" +
                "9. Class variable (0 or 1)");

        double[][] trainingData = DataSetup.loadData("pima-indians-diabetes-train.csv");
        DataSetup.printData(trainingData);

        System.out.println("\n___________________________________________________");

        double[][] testingData = DataSetup.loadData("pima-indians-diabetes-test.csv");
        DataSetup.printData(testingData);
    }
}
