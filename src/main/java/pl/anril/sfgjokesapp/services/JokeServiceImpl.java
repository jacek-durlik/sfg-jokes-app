package pl.anril.sfgjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JokeServiceImpl implements JokeService {

    public final ChuckNorrisQuotes chuckNorrisQuotes;

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
