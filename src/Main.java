

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static LinkedList<Book> bookList = new LinkedList<>() ;

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File file = new File("src\\Data.xml");
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document document =  documentBuilder.parse(file);
        document.getDocumentElement().normalize();
        NodeList list = document.getElementsByTagName("book");
        for (int i = 0 ; i < list.getLength() ; i++) {
            Node node = list.item(i) ;
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                Book book = new Book() ;
                book.setId(element.getAttribute("id").toString().trim());
                book.setAuther(element.getElementsByTagName("author").item(0).getTextContent());
                book.setTitle(element.getElementsByTagName("title").item(0).getTextContent());
                book.setDescribtion(element.getElementsByTagName("description").item(0).getTextContent());
                book.setPrice(Double.parseDouble(element.getElementsByTagName("price").item(0).getTextContent()));
                book.setPublishDate(element.getElementsByTagName("publish_date").item(0).getTextContent());
                bookList.add(book);
            }
        }

        System.out.println("Enter the ID of Book : ");
        Scanner in = new Scanner(System.in) ;
        String inputID = in.nextLine().trim();
        Book target = search(inputID) ;
        if (target != null){
            System.out.println(target.toString());

        }else {
            System.out.println("NOT Exist !");
        }

    }
    private static Book search(String id) {
        for (Book book : bookList) {
            if (book.getId().equals(id)){
                return book ;
            }
        }
        return null ;
    }
}