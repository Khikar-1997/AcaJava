package com.company;

import java.util.Objects;

public class Company {
    //region Propertys

    private String name;
    private String address;
    private int warkersQuantity;
    private String directorsFullName;
    private String countryName;
    private String googleMapLink;

    //endregion

    //region Constructors


    public Company(String name, String address, int warkersQuantity, String directorsFullName,String countryName, String googleMapLink) {
        this.name = name;
        this.address = address;
        this.warkersQuantity = warkersQuantity;
        this.directorsFullName = directorsFullName;
        this.countryName = countryName;
        this.googleMapLink = googleMapLink;
    }

    public Company(String address, int warkersQuantity, String directorsFullName, String googleMapLink) {
        this.address = address;
        this.warkersQuantity = warkersQuantity;
        this.directorsFullName = directorsFullName;
        this.googleMapLink = googleMapLink;
    }

    public Company() {
    }

    //endregion

    //region Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getWarkersQuantity() {
        return warkersQuantity;
    }

    public void setWarkersQuantity(int warkersQuantity) {
        this.warkersQuantity = warkersQuantity;
    }

    public String getDirectorsFullName() {
        return directorsFullName;
    }

    public void setDirectorsFullName(String directorsFullName) {
        this.directorsFullName = directorsFullName;
    }

    public String getGoogleMapLink() {
        return googleMapLink;
    }

    public void setGoogleMapLink(String googleMapLink) {
        this.googleMapLink = googleMapLink;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return warkersQuantity == company.warkersQuantity &&
                Objects.equals(name, company.name) &&
                Objects.equals(address, company.address) &&
                Objects.equals(directorsFullName, company.directorsFullName) &&
                Objects.equals(googleMapLink, company.googleMapLink) &&
                Objects.equals(countryName, company.countryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, warkersQuantity, directorsFullName, googleMapLink, countryName);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", warkersQuantity=" + warkersQuantity +
                ", directorsFullName='" + directorsFullName + '\'' +
                ", countryName='" + countryName + '\'' +
                ", googleMapLink='" + googleMapLink + '\'' +
                '}' + "\n";
    }

    //endregion
}
