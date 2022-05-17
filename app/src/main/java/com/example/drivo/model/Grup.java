package com.example.drivo.model;

public class Grup {

    private String judulGrup;
    private String judulButtonGrup;

    public Grup(String judulGrup, String judulButtonGrup) {
        this.judulGrup = judulGrup;
        this.judulButtonGrup = judulButtonGrup;
    }

    public String getJudulGrup() {
        return judulGrup;
    }

    public void setJudulGrup(String judulGrup) {
        this.judulGrup = judulGrup;
    }

    public String getJudulButtonGrup() {
        return judulButtonGrup;
    }

    public void setJudulButtonGrup(String judulButtonGrup) {
        this.judulButtonGrup = judulButtonGrup;
    }

}
