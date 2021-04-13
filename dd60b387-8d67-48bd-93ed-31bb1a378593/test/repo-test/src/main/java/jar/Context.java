package jar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Context {

    @Bean(name = "webscript.jar.helloworldwebscript.get")
    public HelloWorldWebScript helloWorldWebScript() {
        return new HelloWorldWebScript();
    }
}
