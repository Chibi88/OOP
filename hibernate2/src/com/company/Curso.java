package com.company;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_curso")
    private Integer idCurso;

    private String nombre;
    private Double precio;

    public Curso(){
    }

    public Curso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(idCurso, curso.idCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurso);
    }
}
