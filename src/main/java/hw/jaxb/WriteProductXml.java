package hw.jaxb;

import static java.lang.System.out;

import java.io.File;
import javax.xml.bind.JAXBContext;
import lombok.SneakyThrows;
import lombok.val;

public class WriteProductXml {

  @SneakyThrows
  public static void main(String[] args) {
    val product = new Product("Widget", 25.00, "The all new multifunction widget");
    val jaxbContext = JAXBContext.newInstance(Product.class);
    val marshaller = jaxbContext.createMarshaller();
    marshaller.marshal(product, new File("./build/tmp/product.xml"));
    marshaller.marshal(product, out);
  }
}
