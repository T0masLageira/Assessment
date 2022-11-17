package backendassessment.assessment.EntitiesDTO;

public class UsersDTO {


    private Long id;
    private String name;
    private String surName;
    private String phoneNumber;
    private String email;





    public UsersDTO(Long id, String name, String surName, String phoneNumber, String email) {
        this.id=id;
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
