package org.ieslosremedios.daw1.prog.ut7.actividad74;


import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class ImportacionXML {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\kille\\Downloads\\contactosotro.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);

            // Opcional: normalizar el documento XML
            doc.getDocumentElement().normalize();

            // Obtener la lista de nodos de contacto
            NodeList nodeList = doc.getElementsByTagName("Contacto");

            // Recorrer la lista de contactos
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoContacto = (Element) node;

                    // Obtener los valores de los campos de cada contacto
                    String nombre = elementoContacto.getElementsByTagName("Nombre").item(0).getTextContent();
                    String direccion = elementoContacto.getElementsByTagName("Direccion").item(0).getTextContent();
                    String telefono = elementoContacto.getElementsByTagName("Telefono").item(0).getTextContent();

                    // Imprimir valores
                    System.out.println("Contacto " + (i + 1));
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Dirección: " + direccion);
                    System.out.println("Teléfono: " + telefono);
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
