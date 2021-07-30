package org.med.service;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.med.alarm.AlarmRepository;

public class Binder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(AlarmRepository.class).to(AlarmRepository.class);
    }
}
