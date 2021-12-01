package johnapi.myapi.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "data")

//Creation of the data table

public class UsuárioModel {
    @Id
    public Integer código;
    @Column
    public String nome;


    public int getCódigo() {
        return código;
    }

    public void setCódigo(Integer código) {
        this.código = código;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
