package com.example.ahorcado.services;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Set;

/**
 * Clase que representa las Estadísticas Globales del juego
 */
@Service
@Data
public class GameStats {
    private int partidasTerminadas;
    private ArrayList<String> palabrasJugadas;
    private ArrayList<String> palabrasAcertadas;
    private ArrayList<String> palabrasFalladas;
    private ArrayList<Character> letrasAcertadas;
    private ArrayList<Character> letrasFalladas;

    public GameStats() {
        this.partidasTerminadas = 0;
        this.palabrasJugadas = new ArrayList<>();
        this.palabrasAcertadas = new ArrayList<>();
        this.palabrasFalladas = new ArrayList<>();
        this.letrasAcertadas = new ArrayList<>();
        this.letrasFalladas = new ArrayList<>();
    }
    public void nuevaPartida(String palabra) {
        partidasTerminadas++;
        palabrasJugadas.add(palabra);
    }

    public void addAciertos(Set<Character> aciertosPartida) {
        letrasAcertadas.addAll(aciertosPartida);
    }
    public void addFallos(Set<Character> letrasFalladas) {
        this.letrasFalladas.addAll(letrasFalladas);
    }

    public void acertarPalabra(String palabra){palabrasAcertadas.add(palabra);}

    public void fallarPalabra(String palabra){palabrasFalladas.add(palabra);}


}

