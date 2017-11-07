import com.company.TransportationFactoryClass;
import com.eisgroup.javaexam.factory.TransportationFactory;
import com.eisgroup.javaexam.factory.test.BaseTransportationFactoryTest;


public class TransportationTest extends BaseTransportationFactoryTest {


    @Override
    protected TransportationFactory getTransportationFactory() {
        return new TransportationFactoryClass();
    }
}
