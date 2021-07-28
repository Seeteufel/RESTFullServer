package org.med.alarm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;

public class AlarmRepository {

    private static final Logger logger = LoggerFactory.getLogger(AlarmGenerator.class);

    private List<Alarm> alarms;
    private AlarmGenerator generator;

    public AlarmRepository() {

        generator = new AlarmGenerator();
        alarms = generator.createListOfAlarms(10);
    }

    public List<Alarm> getAllAlarms() {

        return alarms;
    }

    public Runnable writeSnapshot() {

        return () -> {
            Alarms wrappedAlarms = new Alarms();
            wrappedAlarms.setAlarms(alarms);
            AlarmXML.writer("alarms_cache.xml", wrappedAlarms);
            logger.debug("writeSnapshot method called");
        };
    }

    public Runnable createAlarmPeriodically() {

        return () -> {
            alarms = generator.createListOfAlarms(1);
//            System.out.println("createAlarmPeriodically method called at " + new Date());
            logger.debug("createAlarmPeriodically method called");
        };

    }

    public Runnable terminateAlarmPeriodically() {

        return () -> {
            int noOfAlarms = alarms.size();
            if (noOfAlarms > 1) {
                int listIndex = new Random().nextInt(noOfAlarms);
                alarms.remove(listIndex);
//                System.out.println("terminateAlarmPeriodically method called at " + new Date());
                logger.debug("terminateAlarmPeriodically method called");
            }
        };
    }
}
