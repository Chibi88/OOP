package com.company;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Contacto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_contacto")
    private Integer idContacto;

    private String telefono;
    private String email;


    public Contacto() {
       }

    public Contacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "idContacto=" + idContacto +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(idContacto, contacto.idContacto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idContacto);
    }
}
