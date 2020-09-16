package hw.jaxb;

import static java.lang.System.out;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import lombok.SneakyThrows;
import lombok.val;

public class WritductList {

  @SneakyThrows
  public static void main(String[] args) {
    //    val products = new ArrayList<Product>() {{
    //      add(new Product("Widget", 25.00, "The all new multifunction widget"));
    //      add(new Product("Widget Pro", 35.00, "The all new multifunction widget pro"));
    //      add(new Product("Widget Pro XL", 45.00, "The all new multifunction widget pro xl"));
    //    }};

    val products = new ArrayList<Product>();
    products.add(new Product("Widget", 25.00, "The all new multifunction widget"));
    products.add(new Product("Widget Pro", 35.00, "The all new multifunction widget pro"));
    products.add(new Product("Widget Pro XL", 45.00, "The all new multifunction widget pro xl"));

    val productList = new ProductList(products);

    val jaxbContext = JAXBContext.newInstance(ProductList.class);
    val marshaller = jaxbContext.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    marshaller.marshal(productList, new File("./build/tmp/productList.xml"));
    marshaller.marshal(productList, out);
  }
}
