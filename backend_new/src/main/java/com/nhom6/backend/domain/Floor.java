package com.nhom6.backend.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Objects;

public class Floor {
    private int id;
    private String floorNo;
    private String floorName;
    private String description;

    @Id
    @Column(name = "id", table = "floor", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "floor_no", table = "floor", nullable = true, length = 45)
    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    @Basic
    @Column(name = "floor_name", table = "floor", nullable = true, length = 45)
    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    @Basic
    @Column(name = "description", table = "floor", nullable = true, length = 255)
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
        Floor floor = (Floor) o;
        return id == floor.id &&
                Objects.equals(floorNo, floor.floorNo) &&
                Objects.equals(floorName, floor.floorName) &&
                Objects.equals(description, floor.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, floorNo, floorName, description);
    }
}
