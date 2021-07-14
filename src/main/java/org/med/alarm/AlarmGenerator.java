package org.med.alarm;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;

public class AlarmGenerator {

    private static final int maxStringLen = 10;
    private static final TimeUnit maxAgeOfAlarmUnit = TimeUnit.HOURS;
    private static final int maxAgeOfAlarm = 5;

    private List<Alarm> alarms;

    public AlarmGenerator() {

        alarms = new LinkedList<>();
    }


    public void createDummyAlarms(int numberOfAlarms) {

        Faker faker = new Faker(new Locale("en-GB"));
        Date referenceDate = new Date();

        for (int i = 0; i < numberOfAlarms; i++) {
            alarms.add(
                    new Alarm(
                            faker.numerify("AlarmID:########"),
                            PerceivedSeverity.values()[faker.number().numberBetween(0, 5)],
                            faker.date().past(maxAgeOfAlarm, maxAgeOfAlarmUnit, referenceDate),
                            faker.lorem().characters(maxStringLen),
                            faker.lorem().characters(maxStringLen)
                    )
            );
        }
    }

    public List<Alarm> createListOfAlarms(int numberOfAlarms) {
        createDummyAlarms(numberOfAlarms);
        return alarms;
    }
}
