package project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.extensions.webscripts.Cache;
import org.springframework.extensions.webscripts.Status;
import org.springframework.extensions.webscripts.WebScriptRequest;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HelloWorldWebScriptTest {

    private HelloWorldWebScript sut;

    @Mock
    WebScriptRequest webScriptRequest;
    @Mock
    Status status;
    @Mock
    Cache cache;

    @BeforeEach
    public void setUp() {
        sut = new HelloWorldWebScript();
    }

    @Test
    public void testController() {
        String propName = "msg";
        String propValue = "Hello World";

        Map<String, Object> model = sut.executeImpl(webScriptRequest, status, cache);

        assertNotNull("Response from Web Script Java Controller is null", model);
        assertEquals("Incorrect Web Script Java Controller Response", propValue, model.get(propName));
    }
}
