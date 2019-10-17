package dev.secondsun.languageserver.quarkus;

import io.quarkus.arc.deployment.BeanContainerListenerBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.ExecutionTime;
import io.quarkus.deployment.annotations.Record;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.LaunchModeBuildItem;

import java.util.Properties;

import static io.quarkus.runtime.LaunchMode.DEVELOPMENT;

public class LanguageServerProcessor {
    private static final String FEATURE_NAME = "language-server-java";

    @BuildStep
    FeatureBuildItem createFeatureItem() {
        return new FeatureBuildItem(FEATURE_NAME);
    }

    @BuildStep
    @Record(ExecutionTime.STATIC_INIT)
    BeanContainerListenerBuildItem setupHotReplacement(LaunchModeBuildItem launchMode) {
        Properties properties = new Properties();

        if (launchMode.getLaunchMode() == DEVELOPMENT) {
            String interceptorConfig = HotReplacementInterceptor.class.getName();

        }
    }

}
