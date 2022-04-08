package com.company.parsers.dancePerformance;

import org.w3c.dom.Node;

public interface Parse<T> {
    void setNode(Node node);

    T parse();
}
