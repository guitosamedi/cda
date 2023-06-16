package fr.diginamic.entites;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;


@Entity
@Table(name="emprunt")
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DATE_DEBUT")
    private Date dateDebut;

    @Column(name = "DATE_FIN")
    private Date dateFin;

    @Column(name = "DELAI")
    private Integer delai;

    @ManyToOne
    @JoinColumn(name="ID_CLIENT")
    private Client client;

    @ManyToMany
    @JoinTable(name="compo",
    joinColumns = @JoinColumn(name="ID_LIV", referencedColumnName = "ID"),
    inverseJoinColumns = @JoinColumn(name="ID_EMP", referencedColumnName = "ID")
    )

    private Set<Livre> livres;

    public Emprunt() {}
    public Emprunt(Integer id, Date dateDebut, Date dateFin, Integer delai, Client client) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.delai = delai;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Integer getDelai() {
        return delai;
    }

    public void setDelai(Integer delai) {
        this.delai = delai;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", delai=" + delai +
                ", client=" + client +
                '}';
    }
}
