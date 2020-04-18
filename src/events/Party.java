package events;

public class Party extends Event {

   String kind; //genre pour carnaval ou anniversaire
   String theme;
   int age; //pour anniv

    Party(int start, int end, String place, String name, String kind, String th, int age) {
        NUMBER_OF_EVENTS += 1;
        this.eventNumber = NUMBER_OF_EVENTS;
        this.start = start;
        this.end = end;
        this.place = place;
        this.name = name;
        this.theme = th;
        this.type = "Party";
        this.kind = kind;
        if (kind.equals("anniversaire")) {
            this.age = age;
        }
        AllEvents.getInstance().addEvent(this);
    }

    @Override
    void takePlace() {
        System.out.println("");
    }


    @Override
    public String reference() {
        if (name.length() <= 2) {
            return "PE-" + this.kind;
        }
        return "PE-" + this.kind.substring(0, 2);
    }
}