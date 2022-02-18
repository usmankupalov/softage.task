package ru.softage.task.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkedHoursModel extends AbstractModel{

    public Date startDate;
    public Date finishDate;
    public Long workerId;

    public WorkedHoursModel(){}

    public WorkedHoursModel setId(Long id){
        this.id = id;
        return this;
    }

    public WorkedHoursModel setStartDate(Date startDate){
        this.startDate = startDate;
        return this;
    }

    public WorkedHoursModel setFinishDate(Date finishDate){
        this.finishDate = finishDate;
        return this;
    }

    public WorkedHoursModel setWorkerId(Long workerId){
        this.workerId = workerId;
        return this;
    }

    @Override
    public String toString() {
        return "WorkedHoursModel{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", workerId=" + workerId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WorkedHoursModel)) return false;
        WorkedHoursModel that = (WorkedHoursModel) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(finishDate, that.finishDate) &&
                Objects.equals(workerId, that.workerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startDate, finishDate, workerId);
    }
}
