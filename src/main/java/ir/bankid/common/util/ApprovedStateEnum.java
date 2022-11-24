package ir.bankid.common.util;

public enum ApprovedStateEnum {
    WAITING(0),FAILED(1),SUCCESS(2);

    private int value;
    ApprovedStateEnum(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }
}
