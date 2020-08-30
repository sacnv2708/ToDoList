package com.nhom6.backend.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "language")
public class Language extends AbstractAuditingEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "language_no")
    private String languageNo;

    @Column(name = "language_name")
    private String languageName;

    @Column(name = "description")
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguageNo() {
        return languageNo;
    }

    public void setLanguageNo(String languageNo) {
        this.languageNo = languageNo;
    }


    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
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
        Language language = (Language) o;
        return id == language.id &&
                Objects.equals(languageNo, language.languageNo) &&
                Objects.equals(languageName, language.languageName) &&
                Objects.equals(description, language.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, languageNo, languageName, description);
    }
}
