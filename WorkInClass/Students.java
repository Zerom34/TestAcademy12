package WorkInClass;
import java.io.Serializable;
public class Students implements Serializable {
    public String name;
    public String surname;
    public String secName;
    public int assessment;

    public Students(String name, String surname, String secName, int assessment) {
        this.name = name;
        this.surname = surname;
        this.secName = secName;
        this.assessment = assessment;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMidlname() {
        return secName;
    }

    public int getAssessment() {
        return assessment;
    }
    public String getFullName(String name, String surname, String secName){
        return (name + " " + surname + " " + secName);
    }
}
