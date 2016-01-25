package com.mars.part2.singleton;

import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Mars on 2015/11/15.
 */
@Slf4j
public class SerialNumberGeneratorTest extends TestCase {

    public void testGetSerial() throws Exception {
        log.info("next VEHICLE serial: " + SerialNumberGenerator.VEHICLE.getSerial() );
        log.info("next ENGINE serial: " + SerialNumberGenerator.ENGINE.getSerial() );
        log.info("next VEHICLE serial: " + SerialNumberGenerator.VEHICLE.getSerial() );
        log.info("next VEHICLE serial: " + SerialNumberGenerator.VEHICLE.getSerial() );
        log.info("next ENGINE serial: " + SerialNumberGenerator.ENGINE.getSerial() );
    }
}