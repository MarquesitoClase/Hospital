package org.example.personalhospital;

public abstract class Characters {
    private Long id;
    private String name;
    private boolean esMedico;

    public Characters(Long id, String name, boolean esMedico) {
        this.id = id;
        this.name = name;
        this.esMedico=esMedico;
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

    public boolean isEsMedico() {
        return esMedico;
    }

    public void setEsMedico(boolean esMedico) {
        this.esMedico = esMedico;
    }
}
