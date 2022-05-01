package com.hamitmizrak.pagingsorting;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "person_data")
public class PersonEntity implements Serializable {
    public static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false)
    private Long personId;

    @Column(name = "person_name")
    private String personName;

    @Column(name = "person_surname")
    private String personSurName;

    @Column(name = "created_date")
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createdDate;


}
