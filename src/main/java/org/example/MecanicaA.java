package org.example;

import java.io.IOException;

    public class MecanicaA implements MecanicaDoJogo  {

        private FabricaEmbaralhadores f = new FabricaEmbaralhadores();
        private BancoDePalavras b = new BancoDePalavras();
        private boolean acertou;
        private String chosenWordRandom = b.getRandomWord();
        private String chosenWordShuffled = f.getRandomShuffle().embaralhar(chosenWordRandom);


        public MecanicaA() throws IOException {
        }

        @Override
        public boolean testWord(String tentativa) throws IOException
        {
            if (tentativa.equals(getChosenWord()))
            {
                acertou = true;
                return true;
            }else
            {
                acertou = false;
                return false;
            }
        }

        @Override
        public boolean endGame (int tentativas)
        {
            if (tentativas == 5 || acertou )
            {
                return true;
            } else return false;


        }

        @Override
        public boolean hasHint()
        {
            return true;
        }

        @Override
        public String getChosenWord() throws IOException
        {
            return chosenWordRandom;
        }

        public String getChosenWordShuffled() throws IOException
        {
            return chosenWordShuffled;
        }

    }