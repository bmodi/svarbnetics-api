package org.svarb.svarbneticsapi.model;

public class Gene {
    private int id;
    private String symbol;
    private String name;
    private boolean dominant;

    // Constructor
    public Gene(int id, String symbol, String name, boolean dominant) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.dominant = dominant;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDominant() {
        return dominant;
    }

    public void setDominant(boolean dominant) {
        this.dominant = dominant;
    }
}
