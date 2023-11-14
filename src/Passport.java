public class Passport {
    int id;
    String firstName ;
    String lastName;
    int yearOfBirth;
    String gender;
    String country;


    public Passport(int  id, String firstName, String lastName, int yearOfBirth, String gender, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.country = country;



    }
    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                '}';
    }


}
