package pl.anril.sfgjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    public final ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
