package org.example;

import java.util.*;

public class ViewerStatistics {
    private Set<Viewer> listViewer = new HashSet<>();

    public ViewerStatistics(Set<Viewer> listViewer) {
        this.listViewer = listViewer;
    }

    public double averageAge() {
        return listViewer
                .stream()
                .mapToInt(x->x.getAge())
                .average()
                .orElseThrow(() -> new IllegalArgumentException("Empty list"));
    }
}
