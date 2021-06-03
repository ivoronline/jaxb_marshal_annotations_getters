import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Marshal {

  public static void main(String[] args) throws Exception {

    //CREATE PERSON
    Person  person = new Person();
            person.setId  (1);
            person.setName("John");
            person.setAge (20);

    //MARSHAL PERSON
    Marshaller  marshaller = JAXBContext.newInstance(Person.class).createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                marshaller.marshal(person, new File("src/main/resources/person.xml"));

  }

}
