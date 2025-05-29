public class StudentsScoreboard {

    
    static int[] getTotalOf(int[][] scores) {
        int[] totals = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                totals[i] += scores[i][j];
            }
        }
        return totals;
    }

    
    static double[] getAverageOf(int[] totals, int subjectsCount) {
        double[] averages = new double[totals.length];
        for (int i = 0; i < totals.length; i++) {
            averages[i] = (double) totals[i] / subjectsCount;
        }
        return averages;
    }

   
    static int[] getPositionOf(double[] averages) {
        int[] positions = new int[averages.length];

        for (int i = 0; i < averages.length; i++) {
            int rank = 1;
            for (int j = 0; j < averages.length; j++) {
                if (averages[j] > averages[i]) {
                    rank++;
                }
            }
            positions[i] = rank;
        }

        return positions;
    }
}
