package ru.softage.task.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkerModel extends AbstractModel{
    public String name;
    public String lastname;
    public String position;
    public Date hiringDate;
    public Date birthday;
    public Date resignationDate;
    public Long departmentId;
    public String lastName;

    public WorkerModel(){}

    public WorkerModel setId(Long id){
        this.id = id;
        return this;
    }

    public WorkerModel setName(String name){
        this.name = name;
        return this;
    }

    public WorkerModel setLastName(String lastName){
        this.lastname = lastName;
        return this;
    }

    public WorkerModel setPosition(String position){
        this.position = position;
        return this;
    }

    public WorkerModel setHiringDate(Date hiringDate){
        this.hiringDate = hiringDate;
        return this;
    }

    public WorkerModel setBirthday(Date birthday){
        this.birthday = birthday;
        return this;
    }

    public WorkerModel setResignationDate(Date resignationDate){
        this.resignationDate = resignationDate;
        return this;
    }

    public WorkerModel setDepartmentId(Long departmentId){
        this.departmentId = departmentId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkerModel)) return false;
        WorkerModel worker = (WorkerModel) o;
        return  Objects.equals(id, worker.id) &&
                Objects.equals(name, worker.name) &&
                Objects.equals(lastname, worker.lastname) &&
                Objects.equals(position, worker.position) &&
                Objects.equals(hiringDate, worker.hiringDate) &&
                Objects.equals(resignationDate, worker.resignationDate) &&
                Objects.equals(birthday, worker.birthday) &&
                Objects.equals(departmentId, worker.departmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname, position, hiringDate, resignationDate,
                birthday, departmentId);
    }

    @Override
    public String toString() {
        return "WorkerModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", position='" + position + '\'' +
                ", hiringDate=" + hiringDate +
                ", birthday=" + birthday +
                ", resignationDate=" + resignationDate +
                ", departmentId=" + departmentId +
                '}';
    }
}
