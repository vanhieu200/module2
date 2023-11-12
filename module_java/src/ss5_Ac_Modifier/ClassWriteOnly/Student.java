package ss5_Ac_Modifier.ClassWriteOnly;

public class Student {
    private String name = "join";
    private String classes = "C02";

    public void Student(){}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }



}
