package org.med.alarm;

import java.time.LocalDate;

public class Alarm {

    private String NotificationIdentifier;
    private PerceivedSeverity Severity;
    private LocalDate EventTime;
    private String ProbableCause;
    private String AdditionalText;

    public Alarm() {
    }

    public Alarm(String notificationIdentifier, PerceivedSeverity severity, LocalDate eventTime, String probableCause, String additionalText) {
        NotificationIdentifier = notificationIdentifier;
        Severity = severity;
        EventTime = eventTime;
        ProbableCause = probableCause;
        AdditionalText = additionalText;
    }

    public String getNotificationIdentifier() {
        return NotificationIdentifier;
    }

    public void setNotificationIdentifier(String notificationIdentifier) {
        NotificationIdentifier = notificationIdentifier;
    }

    public PerceivedSeverity getSeverity() {
        return Severity;
    }

    public void setSeverity(PerceivedSeverity severity) {
        Severity = severity;
    }

    public LocalDate getEventTime() {
        return EventTime;
    }

    public void setEventTime(LocalDate eventTime) {
        EventTime = eventTime;
    }

    public String getProbableCause() {
        return ProbableCause;
    }

    public void setProbableCause(String probableCause) {
        ProbableCause = probableCause;
    }

    public String getAdditionalText() {
        return AdditionalText;
    }

    public void setAdditionalText(String additionalText) {
        AdditionalText = additionalText;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "NotificationIdentifier='" + NotificationIdentifier + '\'' +
                ", Severity=" + Severity +
                ", EventTime=" + EventTime +
                ", ProbableCause='" + ProbableCause + '\'' +
                ", AdditionalText='" + AdditionalText + '\'' +
                '}';
    }
}