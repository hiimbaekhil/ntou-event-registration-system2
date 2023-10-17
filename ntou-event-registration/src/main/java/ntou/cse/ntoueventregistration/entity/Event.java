package ntou.cse.ntoueventregistration.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Document("events")
public class Event implements Serializable {
    private String title;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String describe;

    public Event() {
    }

    public Event(String title, LocalDateTime startTime, LocalDateTime endTime, String describe) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.describe = describe;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
