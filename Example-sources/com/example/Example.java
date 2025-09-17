
package com.example;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Example {

    @SerializedName("agenda")
    @Expose
    private List<Agenda> agenda;
    @SerializedName("adicionais")
    @Expose
    private List<Adicionai> adicionais;

    public List<Agenda> getAgenda() {
        return agenda;
    }

    public void setAgenda(List<Agenda> agenda) {
        this.agenda = agenda;
    }

    public List<Adicionai> getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(List<Adicionai> adicionais) {
        this.adicionais = adicionais;
    }

}
