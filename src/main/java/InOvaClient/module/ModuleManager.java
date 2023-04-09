package InOvaClient.module;

import InOvaClient.module.movement.*;


import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    public static final ModuleManager INSTANCE = new ModuleManager();
    private List<Mod> modules = new ArrayList<>();
    public ModuleManager() {
        addModules();
    }

    public List<Mod> getModules() {
        return modules;
    }

    public List<Mod> getEnabledModules() {
        List<Mod> enabled = new ArrayList<>();
        for (Mod module : modules) {
            if (module.isEnabled()) enabled.add(module);
        }
        return enabled;
    }
    private void addModules() {
        modules.add(new Flight());
        modules.add(new Sprint());
        modules.add(new AutoSwim());

    }
}
