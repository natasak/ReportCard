package com.example.android.reportcardapp;


public class ReportCard {

    /** Name of the student */
    private String mStudentName;

    /** Grades in an array */
    int[] mGrades = new int[9];


    /**
     * Create a new ReportCard object.
     *
     * @param studentName is the name of a student
     * @param gradesArray is an array of grades
     */
    public ReportCard(String studentName, int[] gradesArray) {
        mStudentName = studentName;

        for (int i=0; i<9; i++) {
            mGrades[i] = gradesArray[i];
        }
    }

    /**
     * Get the Student's name.
     *
     * @return current student's name.
     */
    public String getStudentName() {
        return mStudentName;
    }

    /**
     * Set Student's name.
     *
     * @param name - set this name for student.
     */
    public void setStudentName(String name) {
        mStudentName = name;
    }

    /**
     * Get the grades.
     *
     * @return array of grades.
     */
    public int[] getGrades() {
        return mGrades;
    }

    /**
     * Set the grades.
     *
     * @param grades - array of grades.
     */
    public void setGrades(int[] grades) {
        for (int i=0; i<9; i++) {
            mGrades[i] = grades[i];
        }
    }

    @Override
    public String toString() {
        String printOut = "Report Card of a student:" + mStudentName + "\n" +
                "Computer Science: " + mGrades[0] + "\n" +
                "Mathematics: " + mGrades[1] + "\n" +
                "Literature: " + mGrades[2] + "\n" +
                "Foreign Language: " + mGrades[3] + "\n" +
                "Chemistry: " + mGrades[4] + "\n" +
                "Biology: " + mGrades[5] + "\n" +
                "Physics: " + mGrades[6] + "\n" +
                "History: " + mGrades[7] + "\n" +
                "Geography: " + mGrades[8];
        return printOut;
    }
}