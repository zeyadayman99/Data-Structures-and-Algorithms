package org.datastructuresandalgorithms.asymptoticanalysis;

public class TimeComplexityDemo {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        TimeComplexityDemo demo = new TimeComplexityDemo();
        demo.findSum2(5);
        System.out.println("time taken by this algorithm = "
                + (System.currentTimeMillis() - now) + " milli seconds");
    }

    public int findSum1(int num) {
        return num * (num + 1) / 2;
    }
    public int findSum2(int num) {
        int sum = 0;
        for(int i = 0; i < num; i++) {
            sum += i;
        }
        return sum;
    }
}