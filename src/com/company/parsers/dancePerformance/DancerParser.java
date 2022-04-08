package com.company.parsers.dancePerformance;

import com.company.model.dancePerformance.dancer.DanceTeam;
import com.company.model.dancePerformance.dancer.Dancer;
import com.company.model.dancePerformance.dancer.SingleDancer;
import org.w3c.dom.Node;

public class DancerParser implements Parse<Dancer> {

    private Node dancerNode;

    @Override
    public void setNode(Node node) {
        this.dancerNode = node;
    }

    @Override
    public Dancer parse() {
        switch (dancerNode.getNodeName()) {
            case "singleDancer": {
                return singleDancerParse(dancerNode);
            }
            case "danceTeam": {
                return danceTeamParse(dancerNode);
            }
        }
        return null;
    }

    private DanceTeam danceTeamParse(Node danceTeamNode) {
        DanceTeam dancerTeam = new DanceTeam();
        dancerTeam.setId(danceTeamNode.getAttributes().getNamedItem("id").getTextContent());
        for (int i = 0; i < danceTeamNode.getChildNodes().getLength(); i++) {
            Node n = danceTeamNode.getChildNodes().item(i);
            if (n.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (n.getNodeName()) {
                case "yearOfCreation": {
                    dancerTeam.setYearOfCreation(Integer.parseInt(n.getTextContent()));
                    break;
                }
                case "name": {
                    dancerTeam.setName(n.getTextContent());
                    break;
                }
                case "bossName": {
                    dancerTeam.setBossName(n.getTextContent());
                    break;
                }
                default:
                    break;
            }
        }
        return dancerTeam;
    }

    private SingleDancer singleDancerParse(Node singleDancerNode) {
        SingleDancer singleDancer = new SingleDancer();
        singleDancer.setId(singleDancerNode.getAttributes().getNamedItem("id").getTextContent());
        for (int i = 0; i < singleDancerNode.getChildNodes().getLength(); i++) {
            Node n = singleDancerNode.getChildNodes().item(i);
            if (n.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (n.getNodeName()) {
                case "age": {
                    singleDancer.setAge(Integer.parseInt(n.getTextContent()));
                    break;
                }
                case "name": {
                    singleDancer.setName(n.getTextContent());
                    break;
                }
                case "yearsOfExperience": {
                    singleDancer.setYearsOfExperience(Integer.parseInt(n.getTextContent()));
                    break;
                }
                default:
                    break;
            }
        }
        return singleDancer;
    }
}
