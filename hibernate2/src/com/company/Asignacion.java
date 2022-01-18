package com.company;

import java.io.Serializable;

@Getter
@Setter
@Entity
public class Asignacion implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_asignacion")
    private Integer idAsignacion;

    private String turno;

    @JoinColumn (name = "id_alumno", referencedColumn = "id_alumno")
    @ManyToOne
    private Alumno alumno;

    @JoinColumn (name = "id_curso", referencedColumn = "id_curso")
    @ManyToOne
    private Curso curso;

    public Asignacion() {}

    public Asignacion(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    @Override
    public String toString() {
        return "Asignacion{" +
                "idAsignacion=" + idAsignacion +
                ", turno='" + turno + '\'' +
                ", alumno=" + alumno +
                ", curso=" + curso +
                '}';
    }

    //Equals y hashcode
}

