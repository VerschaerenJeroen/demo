package be.thomasmore.froomi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Apartment {
    @Id
    private int id;
    private String address;
    private String location;
    private int price;
    private Boolean bathroomPresent;
    private Boolean kitchenPresent;

    public Apartment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getBathroomPresent() {
        return bathroomPresent;
    }

    public void setBathroomPresent(Boolean bathroomPresent) {
        this.bathroomPresent = bathroomPresent;
    }

    public Boolean getKitchenPresent() {
        return kitchenPresent;
    }

    public void setKitchenPresent(Boolean kitchenPresent) {
        this.kitchenPresent = kitchenPresent;
    }

}
