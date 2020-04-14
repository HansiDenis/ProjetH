package Projet;

import java.util.List;

class SportEvent extends Event {
    String sport;

    SportEvent(String name, String place, int start, int end, String sport) {
        date = new int[2];
        this.name = name;
        this.place = place;
        this.date[0] = start;
        this.date[1] = end;
        this.sport = sport;
        this.type = "sport";
    }

    @Override
    void takePlace(List<Event> newEvents) {
        System.out.println("En" + this.sport + ",l'important c'est la concentration et vous prenez plaisir à voir ces athlètes pratiquer au plus haut niveau.");
    }

    @Override
    String reference() {
        return "SE" + sport.substring(0, Integer.min(3, sport.length()));
    }
}

