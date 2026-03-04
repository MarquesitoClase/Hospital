package org.example.personalhospital;

public abstract class Characters {
    private Long id;
    private String name;
    private boolean isDoctor;

    public Characters(Long id, String name, boolean isDoctor) {
        this.id = id;
        this.name = name;
        this.isDoctor=isDoctor;
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

    public boolean getIsDoctor() {
        return isDoctor;
    }

    public void setIsDoctor(boolean isDoctor) {
        this.isDoctor = isDoctor;
    }
}
