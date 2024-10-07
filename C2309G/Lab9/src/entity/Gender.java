package entity;

public enum Gender {
    M("Male"),
    F("Female"),
    O("Other");

    private String genderLabel;

    Gender(String genderLabel) {
        this.genderLabel = genderLabel;
    }

    public String getGenderLabel() {
        return genderLabel;
    }
}
