package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Company company1 = new Company("Google", "kjgkjgkjg", 555, "Poxosyan Gagik", "USA", "jfjhfj");
        Company company2 = new Company("ACA", " kjgkjgkjg ", 555, " Poxosyan Gagik ", "Armenia", "jfjhfj");
        Company company3 = new Company("Facebook", "kjgkjgkjg", 555, "Poxosyan Gagik", "UK", "jfjhfj");
        Company company4 = new Company("Ararat", "kjgkjgkjg", 555, "Poxosyan Gagik", "Armenia", "jfjhfj");
        Company company5 = new Company("Amazon", "kjgkjgkjg", 555, "Poxosyan Gagik", "USA", "jfjhfj");
        Scanner scanner = new Scanner(System.in);
        String countryName = scanner.nextLine();
        YellowPage yellowPage = new YellowPage(new HashMap<>());
        ArrayList<Company> usaCompany = new ArrayList<>();
        ArrayList<Company> armeniaCompany = new ArrayList<>();
        ArrayList<Company> ukCompany = new ArrayList<>();

        usaCompany.add(company1);
        armeniaCompany.add(company2);
        ukCompany.add(company3);
        armeniaCompany.add(company4);
        usaCompany.add(company5);
        yellowPage.getYellowPages().put(company1.getCountryName(), usaCompany);
        yellowPage.getYellowPages().put(company2.getCountryName(), armeniaCompany);
        yellowPage.getYellowPages().put(company3.getCountryName(), ukCompany);
        yellowPage.getYellowPages().put(company4.getCountryName(), armeniaCompany);
        yellowPage.getYellowPages().put(company5.getCountryName(), usaCompany);
        yellowPage.printListOfCopaniesInSameCountry(yellowPage.getListOfCompaniesByCountry(countryName));
    }
}
