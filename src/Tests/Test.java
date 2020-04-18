package Tests;

import InterTree.Node;
import InterTree.Tree;
import events.Event;
import events.NBASeries;
import events.SportEvent;

public class Test {
    public static void main(String[] args) {
        Node a = new Node(0, 20);
        a.addEvent("pipi");
        a.addEvent("caca");
        Node c = new Node(15, 50);
        c.addEvent("POp");
        Node d = new Node(6, 20);
        d.addEvent("2");
        Node e = new Node(8, 12);
        e.addEvent("Fart");
        Node f = new Node(7, 20);
        f.addEvent("3");
        Node g = new Node(8, 20);
        g.addEvent("4");
        Tree tt = new Tree(c);
        tt.insert(a);
        tt.insert(d);
        tt.insert(e);
        tt.insert(f);
        NBASeries nn = new NBASeries("nn", "londres", 100, 120, "Lakers", "Clippers", 20000);
        Event nb = new NBASeries("nn", "londres", 100, 120, "Lakers", "Clippers", 20000);
        Event s = new SportEvent("boxing", "Paris", 50, 50, "boxe", true);
        tt.addEvent(nn);
        tt.addEvent(nb);
        tt.addEvent(s);
        System.out.println(tt.mixedSearch(50, 50, "sport"));


    }
}