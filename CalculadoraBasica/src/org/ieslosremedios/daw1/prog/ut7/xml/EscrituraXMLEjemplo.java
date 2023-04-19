package org.ieslosremedios.daw1.prog.ut7.xml;

import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class EscrituraXMLEjemplo {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        // Document --> XML
        DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
        Document document = factory.newDocumentBuilder().newDocument();

        // create the root element node
        Element element = document.createElement("root");
        document.appendChild(element);

        // create a comment node given the specified string
        Comment comment = document.createComment("This is a comment");
        document.insertBefore(comment, element);

        // add element after the first child of the root element
        Element itemElement = document.createElement("item");
        element.appendChild(itemElement);

        // add an attribute to the node
        itemElement.setAttribute("myattr", "attrvalue");

        // create text for the node
        itemElement.insertBefore(document.createTextNode("text"), itemElement.getLastChild());

        // Obtención del TransfomerFactory y del Transformer a partir de él.
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();

        // Creación de la fuente XML a partir del documento.
        DOMSource source = new DOMSource(document);

        // Creación del resultado, que será un fichero.
        StreamResult result = new StreamResult(new File("org/ieslosremedios/daw1/prog/ut7/xml/otro.xml"));

        // Se realiza la transformación, de Document a Fichero.
        transformer.transform(source, result);
    }
}