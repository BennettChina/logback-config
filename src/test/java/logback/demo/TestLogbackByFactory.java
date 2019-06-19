package logback.demo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for logback with LoggerFactory
 */

public class TestLogbackByFactory {

    private final static Logger logger = LoggerFactory.getLogger(TestLogbackByFactory.class);

    @Test
    public void testLogbackByFactory() {
        // Trace level logs are not output to the console,
        // Because the configuration is output the debug level and above it
        logger.trace("Use LoggerFactory to get a log object");
        logger.debug("This way only needs the jar package of slf4j.");
        logger.info("Hello World!");
        logger.warn("Hello Logback!");
        logger.error("These are the five log levels for logback!");
    }
}
