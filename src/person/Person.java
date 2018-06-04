package person;

public class Person {
    
    private String name;
    private String surname;
    private String jmbg;
    
    
    public Person () {
        this.name = "Ime";
        this.surname = "Prezime";
        this.jmbg = "1234512345123";
    }
    
    
    public Person (String customName, String customSurname, String customJmbg) {
        this.name = customName;
        this.surname = customSurname;
        this.jmbg = customJmbg;
    }


    public String getName () {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    
    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }

    
    public String getJmbg() {
        return this.jmbg;
    }

    public void setJmbg(String newJmbg) {
        this.jmbg = newJmbg;
    }

    public void showData() {
        System.out.println(getName());
        System.out.println(getSurname());
        System.out.println(getJmbg());
    }
    
    
}


// Person osoba1 = 