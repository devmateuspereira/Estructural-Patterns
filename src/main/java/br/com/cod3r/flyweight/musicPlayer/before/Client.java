package br.com.cod3r.flyweight.musicPlayer.before;

import br.com.cod3r.flyweight.musicPlayer.before.service.MusicService;

public class Client {

    public static void main(String[] args) {
        MusicService player = new MusicService();
        System.out.println();
        player.listenMusic("User A", "The Unforgiven;Metallica;300");
        player.listenMusic("User A", "The Unforgiven;Metallica;300");
        player.listenMusic("User A", "The Unforgiven;Metallica;300");
        player.listenMusic("User A", "Be Yourself;Audioslave;200");
        player.listenMusic("User B", "The Unforgiven;Metallica;300");
        player.listenMusic("User B", "Be Yourself;Audioslave;200");
        player.report();
    }

}