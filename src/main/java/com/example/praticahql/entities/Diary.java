package com.example.praticahql.entities;

import javax.persistence.*;
import java.sql.Time;
import java.util.Set;

@Entity
@Table(name = "diarys")
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Time start_time;
    private Time ending_time;
    @ManyToOne
    @JoinColumn(name = "dentist_id", nullable = false)
    private Dentist dentist;

    @OneToMany(mappedBy = "diary")
    private Set<Turn> turns;

    public Diary() {
    }

    public Diary(Long id, Time start_time, Time ending_time, Dentist dentist) {
        this.id = id;
        this.start_time = start_time;
        this.ending_time = ending_time;
        this.dentist = dentist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Time getStart_time() {
        return start_time;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    public Time getEnding_time() {
        return ending_time;
    }

    public void setEnding_time(Time ending_time) {
        this.ending_time = ending_time;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }
}
