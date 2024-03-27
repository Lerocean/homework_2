package spring_web;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @GetMapping(value = "/sayHello/{name}")
    public Response sayHello(@PathVariable("name") String name) {
        return new Response("Hello from server, " + name);
    }

    @PostMapping(value = "/sendMessage")
    public Response sendMessage(@RequestBody SendMessageRequest request) {
        return new Response("Message received: " + request.message);
    }

    static class SendMessageRequest {
        private String message;

        public void setMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
    static class Response {
        private final String responseText;

        Response(String responseText) {
            this.responseText = responseText;
        }

        public String getResponseText() {
            return responseText;
        }
    }
}
