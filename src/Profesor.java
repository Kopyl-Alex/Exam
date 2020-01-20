public class Profesor {
    private String name;
    private String surname;
    private String department;

    public Profesor(String name,String surname,String department){
        this.name=name;
        this.surname =surname;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return surname;
    }

    public String getSurname() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

