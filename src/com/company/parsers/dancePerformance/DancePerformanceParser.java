package com.company.parsers.dancePerformance;

import com.company.model.dancePerformance.*;
import com.company.model.dancePerformance.dancer.Dancer;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DancePerformanceParser implements Parse<DancePerformance> {
    private Node dancePerformanceNode;

    @Override
    public void setNode(Node node) {
        this.dancePerformanceNode = node;
    }

    @Override
    public DancePerformance parse() {
        DancePerformance dancePerformance = new DancePerformance();
        NamedNodeMap attributeMap = dancePerformanceNode.getAttributes();
        dancePerformance.setNumber(Integer.parseInt(attributeMap.getNamedItem("number").getTextContent()));

        NodeList dancePerformanceChildNodes = dancePerformanceNode.getChildNodes();
        for (int i = 0; i < dancePerformanceChildNodes.getLength(); i++) {
            Node n = dancePerformanceChildNodes.item(i);
            if (n.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            String value = n.getTextContent();
            switch (n.getNodeName()) {
                case "type": {
                    dancePerformance.setType(Type.valueOf(value));
                    break;
                }
                case "scene": {
                    dancePerformance.setScene(Scene.valueOf(value));
                    break;
                }
                case "numberOfDancers": {
                    dancePerformance.setNumberOfDancers(NumberOfDancers.valueOf(value));
                    break;
                }
                case "music": {
                    dancePerformance.setMusic(Music.valueOf(value));
                    break;
                }
                case "dancers": {
                    Parser<Dancer> parser = new Parser<>();
                    parser.setNode(n);
                    parser.setParser(new DancerParser());
                    dancePerformance.setDancers(parser.parseList());
                    break;
                }
                default:
                    break;
            }
        }

        return dancePerformance;
    }
}
