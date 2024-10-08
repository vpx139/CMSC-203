package Patient;


	public class Patient {
	    // strings 
	    private String emergencyContactPhone; 
	    private String middleName;
		private String firstName;
	    private String lastName;
	    private String city;
	    private String state;
	    private String zipCode;
	    private String phoneNumber;
	    private String streetAddress;
	    private String emergencyContactName;
	    
	    //Constructors
    public Patient(String firstName, String middleName, String lastName,String streetAddress, String city, String state, String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
    	this.firstName = firstName;
    	this.streetAddress = streetAddress;
	    this.middleName = middleName;
	    this.lastName = lastName;
	    this.state = state;
	    this.city = city;
	    this.zipCode = zipCode;
	    this.phoneNumber = phoneNumber;
	    this.emergencyContactName = emergencyContactName;
	    this.emergencyContactPhone = emergencyContactPhone;
	    } 
    //  name 
    public Patient(String firstName, String middleName, String lastName) {
    	this.firstName = firstName;
	    this.middleName = middleName;
	    this.lastName = lastName;
	    this.streetAddress = "";
	    this.city = "";
	    this.state = "";
	    this.zipCode = "";
	    this.phoneNumber = "";
	    this.emergencyContactName = "";
	    this.emergencyContactPhone = "";
	    }
	    // no argument constructors 
	    public Patient() {
	       
	        this.phoneNumber = "";
	        this.lastName = "";
	        this.streetAddress = "";
	        this.firstName = "";
	        this.city = "";
	        this.state = "";
	        this.zipCode = "";
	        this.emergencyContactName = "";
	        this.emergencyContactPhone = "";
	        this.middleName = "";
	    }

	   

	

	    // Accessor
	    public String getFirstName() {
	        return firstName;
	    }

	    public String getMiddleName() {
	        return middleName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public String getStreetAddress() {
	        return streetAddress;
	    }

	    public String getCity() {
	        return city;
	    }

	    public String getState() {
	        return state;
	    }
 
	    public String getEmergencyContactPhone() {
	        return emergencyContactPhone;
	    }
	    public String getZipCode() {
	        return zipCode;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public String getEmergencyContactName() {
	        return emergencyContactName;
	    }

	   

	    // Mutator
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public void setMiddleName(String middleName) {
	        this.middleName = middleName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public void setStreetAddress(String streetAddress) {
	        this.streetAddress = streetAddress;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public void setState(String state) {
	        this.state = state;
	    }

	    public void setZipCode(String zipCode) {
	        this.zipCode = zipCode;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public void setEmergencyContactName(String emergencyContactName) {
	        this.emergencyContactName = emergencyContactName;
	    }

	    public void setEmergencyContactPhone(String emergencyContactPhone) {
	        this.emergencyContactPhone = emergencyContactPhone;
	    }

	    
	    public String buildFullName() {
	        return firstName + " " + middleName + " " + lastName;
	    }

	  
	    public String buildAddress() {
	        return streetAddress + ", " + city + ", " + state + " " + zipCode;
	    }

	   
	    public String buildEmergencyContact() {
	        return emergencyContactName + " (" + emergencyContactPhone + ")";
	    }

	    //output
	    public String toString() {
	        return "" +
	        		"Name: " + buildFullName() + "\n" +
	                "Phone Number: " + phoneNumber + "\n" +
	                "Address: " + buildAddress() + "\n" +
	                "Emergency Contact: " + buildEmergencyContact();
	    }
	}


