package pl.anril.sfgjokesapp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.anril.sfgjokesapp.services.JokeService;

@Controller
@RequiredArgsConstructor
public class JokesController {
    private final JokeService jokeService;

    @RequestMapping(value = {"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
