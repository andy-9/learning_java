package org.example;

public class Employee {
    String name;
    int age;
    boolean hasJob;
    private Payroll payroll;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public boolean hasJob() { // naming here does not use "get"
        return hasJob;
    }

    public void setJob(final boolean hasJob) {
        this.hasJob = hasJob;
    }

    public Payroll getPayroll() {
        return payroll;
    }

    public void setPayroll(Payroll payroll) {
        this.payroll = payroll;
    }
}
