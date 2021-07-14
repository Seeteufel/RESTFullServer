package org.med.alarm;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class AlarmXML {

    public static void writer(String fileName, List<Alarm> alarms) {

        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Alarm.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(alarms, new File(fileName));
        }
        catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static List<Alarm> reader(String fileName) {

        return null;
    }
}
