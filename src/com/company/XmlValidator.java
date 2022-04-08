package com.company;

import org.w3c.dom.Document;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;

public class XmlValidator {
    private final Document document;
    private final Schema schema;

    public XmlValidator(String documentPath, String schemaPath) {
        this.document = buildDocument(documentPath);
        this.schema = loadSchema(schemaPath);
    }

    public Document getDocument() {
        return document;
    }

    public Schema getSchema() {
        return schema;
    }

    public boolean validate() {
        try {
            Validator validator = this.schema.newValidator();
            validator.validate(new DOMSource(this.document));
            System.out.println("Validation passed.");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private Document buildDocument(String xmlFilePath) {
        Document document = null;
        try {
            File file = new File(xmlFilePath);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            document = dbf.newDocumentBuilder().parse(file);
        } catch (Exception e) {
            System.out.println("buildDocument error " + e);

        }
        return document;
    }

    private Schema loadSchema(String xmsSchemaPath) {
        Schema schema = null;
        try {
            String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
            SchemaFactory factory = SchemaFactory.newInstance(language);
            schema = factory.newSchema(new File(xmsSchemaPath));
        } catch (Exception e) {
            System.out.println("loadSchema error " + e);
        }
        return schema;
    }
}
