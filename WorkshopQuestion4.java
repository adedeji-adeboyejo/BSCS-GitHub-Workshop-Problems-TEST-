package GitHubWorkshopQuestions;

public class WorkshopQuestion4 {
    public static double calculateAverage(int[] grades){
        int sum = 0;

        for(int i = 0; i <= grades.length; i++){ //ERROR: loop goes out of bounds, do "i < grades.length;"
            sum + grades[i]; //ERROR: incorrect math operation, do "+="
        }

        return sum / grades.length; //ERROR: integer division is not appropriate, method returns a double
    }

    public static int findMax(int[] grades){
        int max = grades[1]; //ERROR: the first grade is at index 0, not 1

        for(int i = 0; i < grades.length; i++){
            if(grades[i] < max){ //ERROR: wrong comparator, should use ">" 
                max = grades[i];
            }
        }

        return max;
    }

    public static void main(String[] args){
        int[] grades = {85, 92, 67, 78};

        double avg = calculateAverage(grades);
        int max = findMax(grades);

        System.out.println("Average grade: " + avg);
        System.out.println("Highest grade: " + max);
    }
}
