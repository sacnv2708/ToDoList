package com.nhom6.backend.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "classify")
public class Classify extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "classify_no")
    private String classifyNo;

    @Column(name = "classify_name")
    private String classifyName;

    @Column(name = "description")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassifyNo() {
        return classifyNo;
    }

    public void setClassifyNo(String classifyNo) {
        this.classifyNo = classifyNo;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classify classify = (Classify) o;
        return id == classify.id &&
                Objects.equals(classifyNo, classify.classifyNo) &&
                Objects.equals(classifyName, classify.classifyName) &&
                Objects.equals(description, classify.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, classifyNo, classifyName, description);
    }
}
