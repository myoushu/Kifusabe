package project.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.domain.Game;

import java.time.ZonedDateTime;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Dave on 5/4/2016.
 */
@RestController
public class KifuSabeController {
    @RequestMapping(path = "/game", method = GET)
    public Game game(@RequestParam(value="id") String id) {
        return new Game(1,1,1,"black", "white", 69f, 74f, "W+5346", 5, 6.5F, "19x19", ZonedDateTime.now().toString());
    }
}
