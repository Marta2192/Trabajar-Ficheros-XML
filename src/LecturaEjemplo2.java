import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LecturaEjemplo2 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		FileInputStream fisXML = new FileInputStream("C:\\PRUEBAS\\CLASES.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = factory.newDocumentBuilder();
		Document documentoXML = db.parse(fisXML);
		
		NodeList listaNombre = documentoXML.getElementsByTagName("nombre");
		
		for (int i=0; i<listaNombre.getLength(); i++) {
			
			System.out.println(listaNombre.item(i).getTextContent());
			}
		
		NodeList listaCodigo = documentoXML.getElementsByTagName("codigo");
		
		for (int i=0; i<listaCodigo.getLength(); i++) {
			
			System.out.println(listaCodigo.item(i).getTextContent());
			
			}

	}

}
