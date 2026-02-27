package org.example.personalhospital;

public abstract class Characters {
    private Long id;
    private String nombre;
    private boolean esMedico;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsMedico() {
        return esMedico;
    }

    public void setEsMedico(boolean esMedico) {
        this.esMedico = esMedico;
    }
}
