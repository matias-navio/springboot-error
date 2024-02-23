package com.matias.springboot.error.app.springbooterror.models.domain;

public class User {

    private Long id;
    private String name;
    private String lastname;
    private Role role;

    public User(){
    }
    
    public User(Long id, String name, String lastname) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Role getRole(){
        return role;
    }
    // cualquier objeto que exista y no tenga Role va a largar una excepcion porque llama al metodo get de un objeto null
    // public String getRole() {
    //     return role.getName();
    // }

    public void setRole(Role role) {
        this.role = role;
    }

    

}
