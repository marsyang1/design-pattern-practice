package com.mars.part2.singleton;

import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Mars on 2015/11/15.
 */
@Slf4j
public class SerialNumberGeneratorTraditionalTest extends TestCase {

    public void testGetSerial() throws Exception {
        log.info("next serial: " + SerialNumberGeneratorTraditional.getInstance().getSerial() );
        log.info("next serial: " + SerialNumberGeneratorTraditional.getInstance().getSerial() );
        log.info("next serial: " + SerialNumberGeneratorTraditional.getInstance().getSerial() );
        log.info("next serial: " + SerialNumberGeneratorTraditional.getInstance().getSerial() );
    }
}