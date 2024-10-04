package Entity;

import java.time.LocalDateTime;

public class Staff {
    private int id;
    private String code;
    private String name;
    private LocalDateTime doB;

    public Staff() {}

    public Staff(int id, String code, String name, LocalDateTime doB) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.doB = doB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDoB() {
        return doB;
    }

    public void setDoB(LocalDateTime doB) {
        this.doB = doB;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", doB=" + doB +
                '}';
    }
}
