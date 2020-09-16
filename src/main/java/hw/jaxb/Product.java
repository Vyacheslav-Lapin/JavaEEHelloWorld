package hw.jaxb;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@XmlRootElement
@NoArgsConstructor
@XmlAccessorType(FIELD)
@AllArgsConstructor
public class Product {

  String name;
  Double price;
  String description;
}
