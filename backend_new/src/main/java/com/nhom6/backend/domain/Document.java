package com.nhom6.backend.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Objects;

public class Document {
    private int id;
    private String documentNo;
    private String documentName;
    private String facultyNo;
    private String authorNo;
    private String publisherNo;
    private String locationNo;
    private String floorNo;
    private String categoryNo;

    @Id
    @Column(name = "id", table = "document", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "document_no", table = "document", nullable = true, length = 45)
    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo;
    }

    @Basic
    @Column(name = "document_name", table = "document", nullable = true, length = 45)
    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    @Basic
    @Column(name = "faculty_no", table = "document", nullable = true, length = 45)
    public String getFacultyNo() {
        return facultyNo;
    }

    public void setFacultyNo(String facultyNo) {
        this.facultyNo = facultyNo;
    }

    @Basic
    @Column(name = "author_no", table = "document", nullable = true, length = 45)
    public String getAuthorNo() {
        return authorNo;
    }

    public void setAuthorNo(String authorNo) {
        this.authorNo = authorNo;
    }

    @Basic
    @Column(name = "publisher_no", table = "document", nullable = true, length = 45)
    public String getPublisherNo() {
        return publisherNo;
    }

    public void setPublisherNo(String publisherNo) {
        this.publisherNo = publisherNo;
    }

    @Basic
    @Column(name = "location_no", table = "document", nullable = true, length = 45)
    public String getLocationNo() {
        return locationNo;
    }

    public void setLocationNo(String locationNo) {
        this.locationNo = locationNo;
    }

    @Basic
    @Column(name = "floor_no", table = "document", nullable = true, length = 45)
    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    @Basic
    @Column(name = "category_no", table = "document", nullable = true, length = 45)
    public String getCategoryNo() {
        return categoryNo;
    }

    public void setCategoryNo(String categoryNo) {
        this.categoryNo = categoryNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return id == document.id &&
                Objects.equals(documentNo, document.documentNo) &&
                Objects.equals(documentName, document.documentName) &&
                Objects.equals(facultyNo, document.facultyNo) &&
                Objects.equals(authorNo, document.authorNo) &&
                Objects.equals(publisherNo, document.publisherNo) &&
                Objects.equals(locationNo, document.locationNo) &&
                Objects.equals(floorNo, document.floorNo) &&
                Objects.equals(categoryNo, document.categoryNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, documentNo, documentName, facultyNo, authorNo, publisherNo, locationNo, floorNo, categoryNo);
    }
}
