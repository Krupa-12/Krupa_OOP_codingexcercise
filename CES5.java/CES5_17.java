interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {

    @Override
    public boolean isPassed(int mark) {
        // Assuming passing mark is 40
        return mark >= 40;
    }

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Result result = new Result();

        int mark = 55;
        double average = 62.5;

        System.out.println("Mark: " + mark);
        System.out.println("Passed: " + result.isPassed(mark));

        System.out.println("Average: " + average);
        System.out.println("Division: " + result.getDivision(average));
    }
}
