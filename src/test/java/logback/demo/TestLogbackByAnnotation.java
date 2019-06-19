package logback.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Unit test for logback with annotation
 */

@Slf4j
public class TestLogbackByAnnotation {

    @Test
    public void testLogbackByAnnotation() {
        // Trace level logs are not output to the console,
        // Because the configuration is output the debug level and above it
        log.trace("Use annotations to generate a log object");
        log.debug("This approach requires the lombok plugin");
        log.info("Hello World!");
        log.warn("Hello Logback!");
        log.error("These are the five log levels for logback!");
    }
}
