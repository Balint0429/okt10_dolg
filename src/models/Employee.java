package models;

public class Employee {
    String név;
    String település;
    String cím;
    int születés;
    Double fizetés;
    public String getNév() {
        return név;
    }
    public void setNév(String név) {
        this.név = név;
    }
    public String getTelepülés() {
        return település;
    }
    public void setTelepülés(String település) {
        this.település = település;
    }
    public String getCím() {
        return cím;
    }
    public void setCím(String cím) {
        this.cím = cím;
    }
    public int getSzületés() {
        return születés;
    }
    public void setSzületés(int születés) {
        this.születés = születés;
    }
    public Double getFizetés() {
        return fizetés;
    }
    public void setFizetés(Double fizetés) {
        this.fizetés = fizetés;
    }
    
}
