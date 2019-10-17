package dev.secondsun.languageserver.quarkus;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

public class LanguageServerProcessor {
    private static final String FEATURE_NAME = "language-server-java";

    @BuildStep
    FeatureBuildItem createFeatureItem() {
        return new FeatureBuildItem(FEATURE_NAME);
    }


}
