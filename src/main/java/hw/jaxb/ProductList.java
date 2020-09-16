package hw.jaxb;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@XmlRootElement
@XmlAccessorType(FIELD)
@NoArgsConstructor
@AllArgsConstructor
public class ProductList {

  @XmlElement(name = "product")
  List<Product> products;
}
