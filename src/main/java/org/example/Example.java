package org.example;

public class Example {

    static int totalCount = 0;
    int instanceCount = 0;

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    @Override
    public String toString() {
        return "OopStaticExercise{" +
                "totalCount=" + totalCount + " " +
                "instanceCount=" + instanceCount +
                '}';
    }
}
