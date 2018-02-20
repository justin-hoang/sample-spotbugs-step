package com.oracle.sample;

public class ScaryBugs {

    /** The check str value. */
    private String checkStrValue = null;

    /**
     * The Constructor.
     */
    public ScaryBugs() {
        this.checkStrValue = "Test1";
    }

    /**
     * Execute some conditions.
     */
    private void executeSomeConditions() {
        if ("Test2".equalsIgnoreCase(this.checkStrValue)) {
            // Condition 1
        }
        else if ("Test2".equals(this.checkStrValue)) {
            // Duplicate condition
        }
    }

    /**
     * Incorrect assignment in if condition.
     */
    private void incorrectAssignmentInIfCondition() {
        boolean value = false;
        if (value = true) {
            //do Something
        } else {
            //else Do Something
        }
    }

    /**
     * The main method.
     *
     * @param args the args
     */
    public static void main(String[] args) {
        ScaryBugs instance = new ScaryBugs();
        instance.executeSomeConditions();
        instance.incorrectAssignmentInIfCondition();
    }
}
