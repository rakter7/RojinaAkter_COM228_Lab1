package Exe1;

public class Patient {
    //Instance variables
    private String patientId, firstName, lastName, address, city, province, postalCode;
    //Multiple argument constructors
    public Patient (String patientId, String firstName, String lastName, String address, String city, String province, String postalCode)
    {
        this.patientId= patientId;
        this.firstName= firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.province=province;
        this.postalCode=postalCode;
    }

    // Setter

    public void setPatientId(String patientId)
    {
        this.patientId=patientId;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public void setProvince(String province)
    {
        this.province=province;
    }
    public void setPostalCode(String postalCode)
    {
        this.postalCode=postalCode;
    }

    //Getter

    public String getPatientId(){
        return patientId;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getProvince(){
        return province;
    }
    public String getPostalCode(){
        return postalCode;
    }
    //Default constructor
    public Patient(){

    }
    //Method for Patient's information
    public String getPatientInfo(){
        String patientInfo = ("Patient ID: " + patientId + "\nPatient Name: " + firstName + " "+lastName+"\nAddress:  "+address + ", "+city+", "+province+", "+postalCode);
        return patientInfo ;
    }
}

