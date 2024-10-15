package Entity;

public enum EStatus {

    PENDING("Pending"),
    PAID("Paid"),
    COMPLETED("Compeleted"),
    CANCELED("Cancel");
private final String labelStatus;

    EStatus(String labelStatus) {
        this.labelStatus = labelStatus;
    }

    public String getLabelStatus() {
        return labelStatus;
    }
}
