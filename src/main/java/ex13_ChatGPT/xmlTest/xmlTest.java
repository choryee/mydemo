package ex13_ChatGPT.xmlTest;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class xmlTest { //  DOM 트리에서 노드를 돌면서, 요소 가져오기.
    public static void main(String[] args) {

        try {
            // Create a DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the XML file
            Document document = builder.parse(new File("test.xml"));
            System.out.println("document>> "+ document);

            // Get the root element
            Element root = document.getDocumentElement();
            System.out.println("Root element>> " + root.getNodeName());

            // Get a NodeList of <person> elements
            NodeList personNodes = root.getElementsByTagName("person");

            // Iterate through the <person> elements
            for (int i = 0; i < personNodes.getLength(); i++) {
                Node personNode = personNodes.item(i);

                if (personNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element personElement = (Element) personNode;

                    // Get the name and age elements
                    String name = personElement.getElementsByTagName("name").item(0).getTextContent();
                    String age = personElement.getElementsByTagName("age").item(0).getTextContent();

                    System.out.println("personNode>> "+personNode);
                    System.out.println("Person " + (i + 1) + ":");
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                }
            }// for
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
