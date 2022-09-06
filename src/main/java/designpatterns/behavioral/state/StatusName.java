package designpatterns.behavioral.state;

public enum StatusName {
    NEW("new"),
    SEND("send"),
    DELIVERED("delivered");

    private String statusName;

    private StatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}
