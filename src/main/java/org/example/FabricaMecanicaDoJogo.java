package org.example;

import java.io.IOException;

public class FabricaMecanicaDoJogo {

    public MecanicaDoJogo getMecanicaA () throws IOException
    {
        return new MecanicaA();
    }

    public MecanicaDoJogo getMecanicaB () throws IOException
    {
        return new MecanicaB();
    }
}