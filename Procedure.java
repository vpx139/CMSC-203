package Patient;

public class Procedure {
    //   procedure variables 
    private String procedureName;
    private String procedureDate; 
    private String practitionerName;
    private double charges;

    // no argument constructors 
    public Procedure() {
        this.procedureName = "";
        this.procedureDate = "";
        this.practitionerName = "";
        this.charges = 0.0;
    }

    //name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = "";
        this.charges = 0.0;
    }

    //  constructors 
    public Procedure(String procedureName, String procedureDate, 
                     String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    // Accessors 
    public String getProcedureName() {
        return procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public double getCharges() {
        return charges;
    }

    // Mutators 
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    
    //
    public String toString() {
        return 
                "     Procedure Name: " + procedureName + "\n" +
                "     Procedure Date: " + procedureDate + "\n" +
                "     Practitioner Name: " + practitionerName + "\n" +
                "     Charges: $" + String.format("%.2f", charges);
    }
}

