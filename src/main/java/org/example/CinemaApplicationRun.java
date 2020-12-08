package org.example;


import java.util.*;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        Set<Viewer> listViewer = new HashSet<>();
        listViewer.add(new Viewer("User 1", 23, 4));
        listViewer.add(new Viewer("User 2", 22, 4));
        listViewer.add(new Viewer("User 3", 25, 4));
        listViewer.add(new Viewer("User 4", 28, 4));
        listViewer.add(new Viewer("User 5", 29, 4));

        System.out.println(new ViewerStatistics(listViewer).averageAge());
    }
}
