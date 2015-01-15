package pl.edu.ug.aib.firstApp.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {

    public String name;
    public String company;
    public String phone;
    public Integer pictureId;

    // atrybut istnieje w klasie, ale jest ignorowany przy zapytaniach JSONa
    @JsonIgnore
    public String pictureBytes;
}

