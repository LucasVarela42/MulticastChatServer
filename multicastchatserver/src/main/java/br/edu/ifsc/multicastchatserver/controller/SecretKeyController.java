package br.edu.ifsc.multicastchatserver.controller;

import br.edu.ifsc.multicastchatserver.model.SecretKey;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecretKeyController {
    private final String myKey = "limao";

    @RequestMapping(value = "/key", method = RequestMethod.GET)
    public SecretKey secretKey() {
        return new SecretKey(myKey);
    }

}
