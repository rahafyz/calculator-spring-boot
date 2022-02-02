package com.mapsa.calculator.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Operation {
    private int num1;
    private int num2;
    private int num3;
    private int arr1;
    private int arr2;
    private int arr3;
    private int arr4;
    private int arr5;
    private double[] nums;

    public Operation() {
    }

    public Operation(int num3) {
        this.num3 = num3;
    }


    public Operation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operation(double[] nums) {
        this.nums = nums;
    }

    public Operation(int arr1, int arr2, int arr3, int arr4, int arr5) {
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.arr3 = arr3;
        this.arr4 = arr4;
        this.arr5 = arr5;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getArr1() {
        return arr1;
    }

    public int getArr2() {
        return arr2;
    }

    public int getArr3() {
        return arr3;
    }

    public int getArr4() {
        return arr4;
    }

    public int getArr5() {
        return arr5;
    }

    public void setArr1(int arr1) {
        this.arr1 = arr1;
    }

    public void setArr2(int arr2) {
        this.arr2 = arr2;
    }

    public void setArr3(int arr3) {
        this.arr3 = arr3;
    }

    public void setArr4(int arr4) {
        this.arr4 = arr4;
    }

    public void setArr5(int arr5) {
        this.arr5 = arr5;
    }

//        public double[] getArrayNums() {
//        Double[] numbers = new Double[nums.size()];
//        numbers = nums.toArray(numbers);
//        double[] fnums = Stream.of(numbers).mapToDouble(Double::doubleValue).toArray();
//        return fnums;
//    }


    public double[] getNums() {
        return nums;
    }

    public void setNums(double[] nums) {
        this.nums = nums;
    }
}
