package com.company;

import com.company.model.dancePerformance.DancePerformance;
import org.w3c.dom.Node;
import com.company.parsers.dancePerformance.DancePerformanceParser;
import com.company.parsers.dancePerformance.Parser;

import java.util.ArrayList;

//https://www.youtube.com/watch?v=ONfqhT_oua4
public class Main {

    public static void main(String[] args) {
        String documentPath = "src/com/company/DancePerformances.xml";
        String schemaPath = "src/com/company/DancePerformances-schema.xsd";
        XmlValidator xmlValidator = new XmlValidator(documentPath, schemaPath);

        if (!xmlValidator.validate()) {
            return;
        }

        Node rootNode = xmlValidator.getDocument();
        if (rootNode.getNodeName().equals("DancePerformances")) {
            Parser<DancePerformance> parser = new Parser<>();
            parser.setNode(rootNode);
            parser.setParser(new DancePerformanceParser());
            ArrayList<DancePerformance> perfList = parser.parseList();
            System.out.println(perfList);
        }

    }
}
