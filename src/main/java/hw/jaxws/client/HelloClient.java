package hw.jaxws.client;

import lombok.val;
import wsclient.HelloService;

public class HelloClient {

  public static void main(String[] args) {
    val service = new HelloService();
    val hello = service.getHelloPort();
    val text = hello.sayHello("Henry");
    System.out.println(text);
  }
}
