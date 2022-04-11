package com.company;

import com.company.model.dancePerformance.DancePerformance;
import com.company.model.dancePerformance.comparators.DancePerformanceComparator;
import com.company.parsers.dancePerformance.ListParser;
import com.company.parsers.dancePerformance.Parser;
import org.w3c.dom.Node;
import com.company.parsers.dancePerformance.DancePerformanceParser;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String documentPath = "src/com/company/DancePerformances.xml";
        String schemaPath = "src/com/company/DancePerformances-schema.xsd";
        XmlValidator xmlValidator = new XmlValidator(documentPath, schemaPath);

        if (!xmlValidator.validate()) {
            return;
        }

        Node rootNode = xmlValidator.getDocument().getFirstChild();
        if (rootNode.getNodeName().equals("DancePerformances")) {
            Parser<DancePerformance> parser = new DancePerformanceParser();
            ListParser<DancePerformance> listParser = new ListParser<>(parser);
            ArrayList<DancePerformance> perfList = listParser.parseList(rootNode.getChildNodes());
            System.out.println(perfList);
            perfList.sort(new DancePerformanceComparator());
            System.out.println("\n");
            System.out.println(perfList);
        }
    }
}
