package com.halils.xpensetracking.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    private long id;
    private String type;
}
