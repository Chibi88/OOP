package com.company;


import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
public class Domicilio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_domicilio")
    private Integer idDomicilio;



    @Column (name = "no_calle");
    private String noCalle;

    private Domicilio(){

    }

    public Domicilio (Integer idDomicilio){
        this.idDomicilio = idDomicilio;
    }

    @Override
    public String toString() {
        return "Domicilio{" +
                "idDomicilio=" + idDomicilio +
                ", calle='" + calle + '\'' +
                ", noCalle='" + noCalle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Domicilio domicilio = (Domicilio) o;
        return idDomicilio.equals(domicilio.idDomicilio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDomicilio);
    }


}

//equals y hashcode lo pone como buena pracrica para verificar que el id
// no sea nulo ni se repita