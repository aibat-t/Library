package kz.aibat.library.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {

    private int id;

    @NotNull(message = "ФИО не должен быть пустым")
    @Size(min = 2, max = 100, message = "ФИО должно быть от 2 до 100 символов длинной")
    private String fullName;

    @NotNull(message = "Год рождения не должен быть пустым")
    @Min(value = 1900, message = "Год рождения должен быть больше, чем 1500")
    private int birthYear;

    public Person() {
    }

    public Person(int id, String fullName, int birthYear) {
        this.id = id;
        this.fullName = fullName;
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
