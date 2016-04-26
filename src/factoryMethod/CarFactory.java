package factoryMethod;

/**
 * Created by mics on 4/14/16.
 */
public class CarFactory extends TransportFactory {
    @Override
    Transport create() {
        return new Car();
    }
}
