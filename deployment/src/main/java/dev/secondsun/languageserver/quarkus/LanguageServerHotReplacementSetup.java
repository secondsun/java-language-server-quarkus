package dev.secondsun.languageserver.quarkus;

import io.quarkus.deployment.devmode.HotReplacementContext;
import io.quarkus.deployment.devmode.HotReplacementSetup;

public class LanguageServerHotReplacementSetup implements HotReplacementSetup {

    private HotReplacementContext context;

    @Override
    public void setupHotDeployment(HotReplacementContext context) {
        this.context = context;

    }
}
