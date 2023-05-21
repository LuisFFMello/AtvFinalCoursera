package org.example;
import java.io.IOException;

public interface MecanicaDoJogo  {

    public boolean testWord(String tentativa) throws IOException;
    public boolean endGame (int tentativas);
    public boolean hasHint();
    public String getChosenWord() throws IOException;
    public String getChosenWordShuffled() throws IOException;

}