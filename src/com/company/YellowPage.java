package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class YellowPage {
    //region Propertys

    private HashMap<String,ArrayList<Company>>yellowPages;

    //endregion

    //region Constructors

    public YellowPage(HashMap<String, ArrayList<Company>> yellowPages) {
        this.yellowPages = yellowPages;
    }

    public YellowPage() {
    }

    //endregion

    //region Public Methods
    public ArrayList<Company> getListOfCompaniesByCountry(String countryName){
        if (this.yellowPages.containsKey(countryName)){
            return this.yellowPages.get(countryName);
        } else {
            throw new RuntimeException("We have not company in this " + countryName);
        }
    }

    public void printListOfCopaniesInSameCountry(ArrayList<Company> companies){
        System.out.println(companies);
    }
    //endregion

    //region Getter and Setter

    public HashMap<String, ArrayList<Company>> getYellowPages() {
        return yellowPages;
    }

    public void setYellowPages(HashMap<String, ArrayList<Company>> yellowPages) {
        this.yellowPages = yellowPages;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YellowPage that = (YellowPage) o;
        return Objects.equals(yellowPages, that.yellowPages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yellowPages);
    }

    @Override
    public String toString() {
        return "YellowPage{" +
                "yellowPages=" + yellowPages +
                '}';
    }

    //endregion
}
