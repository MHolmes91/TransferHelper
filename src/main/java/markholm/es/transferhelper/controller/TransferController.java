package markholm.es.transferhelper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import markholm.es.transferhelper.model.Message;

@RestController
public class TransferController {
    @RequestMapping("/")
    public Message rootAction(@RequestParam(value="title", defaultValue="Hello World!") String title, @RequestParam(value="message", defaultValue="Hello World!") String message){
        return new Message(title, message);
    }

}
