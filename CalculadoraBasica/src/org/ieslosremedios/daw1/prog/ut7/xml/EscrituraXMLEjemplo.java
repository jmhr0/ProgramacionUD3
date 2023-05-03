package org.ieslosremedios.daw1.prog.ut7.xml;

import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
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
        // Creamos el documento vacío para añadirle a continuación los nodos
        // En este caso lo hago todo en una sola línea
        Document document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();

        // Creamos el nodo raíz
        Element estudiantes = document.createElement("estudiantes");
        // Hacemos que cuelgue del documento (estructura de árbol)
        document.appendChild(estudiantes);

        // Creamos el primer nodo y lo colgamos de su padre, el nodo raíz. --> <estudiante></estudiante>
        Element estudianteFran = document.createElement("estudiante");
        estudiantes.appendChild(estudianteFran);

        // Creamos un nodo de texto que será el valor del elemento anterior
        Text test = document.createTextNode("Juan");
        // y lo colgamos del nodo anterior --> <estudiante>Fran</estudiante>
        estudianteFran.appendChild(test);

        // Igual para el siguiente esutidante
        Element estudianteMenganito = document.createElement("estudiante");
        estudiantes.appendChild(estudianteMenganito);
        Text test2 = document.createTextNode("Menganito");
        estudianteMenganito.appendChild(test2);

        // Clases necesarias para finalizar la creación del archivo XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File("C:\\Users\\1DAW_2223_03\\Downloads"));

        // Se realiza la transformación, de Document a Fichero.
        transformer.transform(source, result);
    }
}