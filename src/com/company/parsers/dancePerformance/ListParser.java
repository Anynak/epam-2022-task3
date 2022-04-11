package com.company.parsers.dancePerformance;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class ListParser<T> {
    private final Parser<T> parser;

    public ListParser(Parser<T> parser) {
        this.parser = parser;
    }

    public ArrayList<T> parseList(NodeList nodeList) {
        ArrayList<T> result = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node n = nodeList.item(i);
            if (n.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            parser.setNode(n);
            result.add(this.parser.parse());
        }
        return result;
    }
}
