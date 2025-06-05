package com.pree.todos.entity;

public enum Priority {
    HIGH("High"),
    MEDIUM("Medium"),
    LOW("Low");

    private final String label;

    Priority(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
