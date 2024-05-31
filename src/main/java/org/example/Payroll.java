package org.example;

public class Payroll {
    private String hierarchyLevel;
    private int income;
    private int yearsInCompany;

    public String getHierarchyLevel() {
        return hierarchyLevel;
    }

    public void setHierarchyLevel(final String hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(final int income) {
        this.income = income;
    }

    public int getYearsInCompany() {
        return yearsInCompany;
    }

    public void setYearsInCompany(final int yearsInCompany) {
        this.yearsInCompany = yearsInCompany;
    }
}
