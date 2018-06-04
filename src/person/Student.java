package person;


public class Student extends Person {
    
    
    private String indexNumber;
    private int year;

    
    
    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    
    
    public Student(String customName, String customSurname, String customJmbg) {
        super(customName, customSurname, customJmbg);
    }
            
          
    public Student(String customName, String customSurname, String customJmbg, String indexNumber, int year) {
        super(customName, customSurname, customJmbg);
        this.indexNumber = indexNumber;
        this.year = year;
    }
    
    // showData isto ime kao u Person
    
    @Override
    public void showData() {
        super.showData();
        System.out.println(getIndexNumber());
        System.out.println(getYear());
        System.out.println();
    }
    
}
 