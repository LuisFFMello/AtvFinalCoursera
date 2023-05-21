package org.example;

public class FabricaEmbaralhadores {
    public Embaralhador getRandomShuffle()
    {
        int random = (int) (Math.random()*2);
        if (random ==0)
        {
            return  new EmbaralhadorA();
        } else
        {
            return new EmbaralhadorB();
        }

    }

}