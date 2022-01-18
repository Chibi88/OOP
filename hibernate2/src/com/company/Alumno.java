package com.company;


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Alumno implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_alumno")
    private Integer idAlumno;

    private String nombre;
    private String apellido;

    @JoinColumn (name = "id_domicilio", referencedColumnName = "id_domicilio") //si se llaman igual no es necesario
    @ManyToOne
    private Domicilio domicilio;

    @JoinColumn (name = "id_contacto", referencedColumnName = "id_contacto")
    @ManyToOne
    private Contacto contacto;


    @OneToMany (mappedBy = "alumno")   //mapeo bidireccional
    private List<Asignacion>asignaciones; //no incluirlo en el toString porque es una lista

    public Alumno(){

    }

    public Alumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "idAlumno=" + idAlumno +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", domicilio=" + domicilio +
                ", contacto=" + contacto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(idAlumno, alumno.idAlumno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlumno);
    }
}


