package com.company.parsers.dancePerformance;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class Parser<T> implements Parse<T> {

    private Node node;
    private Parse<T> parse;

    @Override
    public void setNode(Node node) {
        this.node = node;
    }

    public void setParser(Parse<T> parse){
        this.parse = parse;
    }

    public T parse(){
        this.parse.setNode(this.node);
        return this.parse.parse();
    }

    public ArrayList<T> parseList(){
        NodeList nodeList = this.node.getChildNodes();
        ArrayList<T> result = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node n = nodeList.item(i);
            if (n.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            this.parse.setNode(n);
            result.add(this.parse.parse());
        }
        return result;
    }
}
