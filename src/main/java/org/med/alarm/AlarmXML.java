package org.med.alarm;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class AlarmXML {

    public static void writer(String fileName, Object obj) {

        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Alarms.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            jaxbMarshaller.marshal(obj, new File(fileName));
        }
        catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
