interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        }
        return "";
    }
}
