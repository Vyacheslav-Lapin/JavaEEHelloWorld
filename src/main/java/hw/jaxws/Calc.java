package hw.jaxws;

import javax.jws.WebService;

@WebService
public class Calc {

  public String square(String number) {
    double num = Double.parseDouble(number);
    return Double.toString(num * num);
  }
}
