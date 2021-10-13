import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Ejemplo2 {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		// TODO Auto-generated method stub

		DocumentBuilderFactory factoria = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = factoria.newDocumentBuilder();
		Document documento = db.newDocument();
		
		
		Element dam2 = documento.createElement("DAM2");
		documento.appendChild(dam2);
		
		Element asignaturas = documento.createElement("asignaturas");
		dam2.appendChild(asignaturas);
		
		Element asignatura = documento.createElement("asignatura");
		asignaturas.appendChild(asignatura);
		
		Element codigo = documento.createElement("codigo");
		codigo.setTextContent("1111");
		asignatura.appendChild(codigo);
		
		Element nombre = documento.createElement("nombre");
		nombre.setTextContent("Acceso a datos");
		asignatura.appendChild(nombre);
		
		Element codigo2 = documento.createElement("codigo");
		codigo2.setTextContent("2222");
		asignatura.appendChild(codigo2);
		
		Element nombre2 = documento.createElement("nombre");
		nombre2.setTextContent("PSP");
		asignatura.appendChild(nombre2);
		
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		DOMSource dom = new DOMSource(documento);
		StreamResult sr = new StreamResult(new File("C:\\PRUEBAS\\CLASES.xml"));
		transformer.transform(dom, sr);
	}

}
/* <DAM2>
 * 		<asignaturas>
 * 			<asignatura>
 * 				<codigo>1111</codigo>
 * 				<nombre>Acceso a datos</nombre>
 * 			</asignatura>
 * 			<asignatura>
 * 				<codigo>2222</codigo>
 * 				<nombre>PSP</nombre>
 * 			</asignatura>
 * 		</asignaturas>
 * </DAM2>
 */
