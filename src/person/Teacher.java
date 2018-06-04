package person;

public class Teacher extends Person {
    
    private String mainSubject;
    private int yearsOfExpirience;
    private String gender;

    
    
    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public int getYearsOfExpirience() {
        return yearsOfExpirience;
    }

    public void setYearsOfExpirience(int yearsOfExpirience) {
        this.yearsOfExpirience = yearsOfExpirience;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    public Teacher(String customName, String customSurname, String customJmbg, String mainSubject, int yearsOfExpirience, String gender) {
        super(customName, customSurname, customJmbg);
        this.mainSubject = mainSubject;
        this.yearsOfExpirience = yearsOfExpirience;
        this.gender = gender;
    }
        
        @Override
        public void showData() {
        super.showData();
        System.out.println(getMainSubject());
        System.out.println(getYearsOfExpirience());
        System.out.println(getGender());
    }
    
    
}
