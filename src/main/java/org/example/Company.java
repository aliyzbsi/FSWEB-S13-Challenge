package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;


    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro >= 0) {
            this.giro = giro;
        } else {
            System.out.println("Giro cannot be negative!");
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }


    public void addEmployee(int index, String name) {
        if (index >= 0 && index < developerNames.length) {
            if (developerNames[index] == null) {
                developerNames[index] = name;
                System.out.println("Employee added at index " + index);
            } else {
                System.out.println("Index " + index + " is already filled.");
            }
        } else {
            System.out.println("Index is out of range.");
        }
    }

    // toString metodu
    @Override
    public String toString() {
        StringBuilder devs = new StringBuilder();
        for (String dev : developerNames) {
            if (dev != null) {
                devs.append(dev).append(" ");
            }
        }
        return "Company [id=" + id + ", name=" + name + ", giro=" + giro + ", developers=" + devs + "]";
    }
}
