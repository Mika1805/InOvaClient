package InOvaClient;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Client implements ModInitializer {
    public static final Client INSTANCE = new Client();
    public Logger logger = LogManager.getLogger(Client.class);
    @Override
    public void onInitialize() {

        logger.info("Hello World");
    }
    
}