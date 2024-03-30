package com.example.VacPayCalc.domain;

public class PayCalculator {
	
	private int averageSalary;
	private int countVacationDays;
	public int getAverageSalary() {
		return averageSalary;
	}
	public void setAverageSalary(int averageSalary) {
		this.averageSalary = averageSalary;
	}
	public int getCountVacationDays() {
		return countVacationDays;
	}
	public void setCountVacationDays(int countVacationDays) {
		this.countVacationDays = countVacationDays;
	}
	
	public int calculateSalary() {
		return averageSalary / 28 * countVacationDays;
	}

}
